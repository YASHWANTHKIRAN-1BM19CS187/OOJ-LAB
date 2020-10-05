import java.util.Scanner;
class prime{
public static int isprime(int c){
int count=0;
for(int j=1;j<=c;j++){
if (c%j==0)
count++;
}
if (count==2)
return 1;
else
return 0;
}
public static void check(int m,int n){
System.out.println("the prime number are:");
for(int i=n;i<=m;i++){
if (isprime(i)==1)
System.out.println(i);
}
}
public static void main(String[] args){
Scanner x=new Scanner(System.in);
System.out.println("enter two numbers:");
int p=x.nextInt();
int q=x.nextInt();
if (p>q)
check(p,q);
else
check(q,p);
}
}
