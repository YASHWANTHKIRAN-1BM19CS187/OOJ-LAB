import java.util.*;
class WrongAge extends Exception{
 int f,s;
WrongAge(int fage,int sage){
f=fage;
s=sage;
}
public String toString(){
return "Please enter the correct ages as father's age can't be less than or equal to the son's age.";
}}
class NegativeAge extends Exception{
int x;
NegativeAge(int fage){
x=fage;
}
public String toString(){
return "Age can't be a negative value.";
}}
class Father
{
int fage;
Scanner in=new Scanner(System.in);
Father() throws NegativeAge
{
System.out.println("Enter the father's age:");
fage=in.nextInt();
if(fage<0){
throw new NegativeAge(fage);
}}}
class Son extends Father
{
int sage;
Scanner in=new Scanner(System.in);
Son() throws NegativeAge,WrongAge{
super();
System.out.println("Enter the son's age :");
sage=in.nextInt();
if(sage<0)
{
throw new NegativeAge(sage);
}
if(sage>=fage){
throw new WrongAge(fage,sage);
}
}}
class AgeDisplay{
public static void main(String args[]){
try{
Son s=new Son();
}
catch(NegativeAge n){
System.out.println("Exception:"+n);
}
catch(WrongAge w){
System.out.println("Exception:"+w);
}
}}