import java.util.Scanner;
public class lab1{
public static int det(int a,int b,int c){
int d=b*b-4*a*c;
return d;
}
public static void main(String[] args){
double r1,r2,real,imag;
Scanner x=new Scanner(System.in);
System.out.print("enter the a,b,c values:");
int a=x.nextInt();
int b=x.nextInt();
int c=x.nextInt();
int d=det(a,b,c);
if(d==0){
r1=-b+Math.sqrt(d*1.0);
r2=-b-Math.sqrt(d*1.0);
System.out.println("the roots are real and equal:"+r1+","+r2);
}
if(d>0){
r1=-b+Math.sqrt(d*1.0);
r2=-b-Math.sqrt(d*1.0);
System.out.println("the roots are real but not equal:"+r1+","+r2);
}
if(d<0){
real=-b;
imag=d;
System.out.println("the roots are imaginary:"+(real)+"+("+(+1.0*imag)+"i),"+(real)+"+("+(-1.0*imag)+"i)");
}
}
}
