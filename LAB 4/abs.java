abstract class Shape
{
int a=3;
int b=4;
abstract public void print_area();
}
class rectangle extends Shape
{
public int area_rect;

public void print_area()
{
area_rect=a*b;
System.out.println("The area of rectangle is: "+area_rect);
}
}
class triangle extends Shape
{
int area_tri;

public void print_area()
{
area_tri=(int) (0.5*a*b);
System.out.println("The area of triangle is: "+area_tri);
}
}
class circle extends Shape
{
int area_circle;

public void print_area()
{
area_circle=(int) (3.14*a*a);
System.out.println("The area of circle is: "+area_circle);
}
}
class abs{
public static void main(String[] args){
rectangle rec = new rectangle();
rec.print_area();
triangle tri = new triangle();
tri.print_area();
circle cir = new circle();
cir.print_area();
}
}
