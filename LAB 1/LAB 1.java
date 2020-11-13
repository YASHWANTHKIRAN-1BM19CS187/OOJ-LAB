import java.util.Scanner;
import java.lang.*;
 class Quadratic{
public static void main(String[] args)
{double a,b,c,r1,r2,d;
Scanner scan= new Scanner(System.in);
System.out.println("enter the co-efficients of the quadratic equation a,b and c\n");
 a = scan.nextDouble();
 b = scan.nextDouble();
 c = scan.nextDouble();
d = b*b- (4*a*c);
if ( d<0 )
{ System.out.println(" There are no real solutions for this quadratic equation\n");
 System.exit(0);}
r1 = (-b + Math.sqrt(d))/(2*a);
r2 = (-b - Math.sqrt(d))/(2*a);
if(d==0)
{ System.out.println("The solutions are real and equal to " + r1 );
}
else 
{System.out.println("The real solutions are\n" + r1 + " and " + r2);}

}
}
