import java.util.*;
import java.lang.*;

class NewThread implements Runnable {
String name; 
String disp;
int n1;
Thread t;
Random n=new Random();
NewThread(String threadname,String x,int time) {
name = threadname;
n1=time;
disp=x;
t = new Thread(this,name);
System.out.println("New thread: " + t);
t.start(); 
}
public void run() {
try {
for(int i = 1; i <=10; i++) 
{
int n2=n.nextInt(100);
System.out.println("time token of "+name+":"+n2);
Thread.sleep(n1);
}
} catch (InterruptedException e) {
System.out.println(name + "Interrupted");
}
System.out.println(name + " exiting.");
}
}

class ClientDetails {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
String name;
System.out.println("enter the name of client");
name=sc.next();
new NewThread("Client",name,2000); 
try {
Thread.sleep(20000);
System.out.println("--------------------------------");
} catch (InterruptedException e) {
System.out.println("Main thread Interrupted");
}
}
}