import java.util.*;
class book{
  String name;
  String author;
  double price;
  int num_pages;
  public book(){
    name="india's Hero";
    author="panday";
    price=455.3;
    num_pages=600;
  }
  public book(String name,String author,double price,int num_pages){
    this.name=name;
    this.author=author;
    this.price=price;
    this.num_pages=num_pages;
  }
  void setdetails(){
    Scanner x=new Scanner(System.in);
    name=x.nextLine();
    author=x.nextLine();
    price=x.nextDouble();
    num_pages=x.nextInt();
  }
  public String toString(){
    return (name+","+author+","+price+","+num_pages);
  }
}
public class Main{
  public static void main(String[] args){
    int n=0;
    Scanner x=new Scanner(System.in);
    System.out.print("enter the value for n:");
    n=x.nextInt();
    book[] b=new book[n];
    System.out.println("enter the details of book(name,author,price,num_pages)");
    for(int i=0;i<n;i++){
      b[i]=new book();
      System.out.println("details of "+(i+1)+" book:");
      b[i].setdetails();
    }
    System.out.println("the details of the books are:");
    for(int i=0;i<n;i++){
      System.out.println((i+1)+" book:");
      System.out.println(b[i]);
    }
  }
}
