import java.util.Scanner;
class shape{
public static void main(String[] args){
int y=0;
Scanner x=new Scanner(System.in);
do{
System.out.println("the program is to find the area and volume of sphere:");
System.out.print("enter the radius of sphere:");
int r=x.nextInt();
System.out.println("area of sphere is:"+(4*3.14*r*r));
System.out.println("volume of sphere is:"+(4*3.14*r*r*r*1.0/3));
System.out.print("enter 0 to continue:");
y=x.nextInt();
}while (y==0);
}
}
