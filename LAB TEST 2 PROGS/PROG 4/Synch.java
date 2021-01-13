class Callme {
void call(String msg) {
System.out.print("{" + msg);
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
System.out.println("Interrupted");
}
System.out.println("}");
}
}
class Caller implements Runnable {
String msg;
Callme target;
Thread t;
public Caller(Callme targ, String s) {
target = targ;
msg = s;
t = new Thread(this);
t.start();
}
public void run() {
synchronized(target) { 
target.call(msg);
}
}
}
class Synch1 {
public static void main(String args[]) {
Callme target = new Callme();
Caller ob1 = new Caller(target, "USN");
Caller ob2 = new Caller(target, "CSE");
Caller ob3 = new Caller(target, "BMSCE");
Caller ob4 = new Caller(target, "BANGALORE");
try {
ob1.t.join();
ob2.t.join();
ob3.t.join();
ob4.t.join();
} catch(InterruptedException e) {
System.out.println("Interrupted");
}
}
}