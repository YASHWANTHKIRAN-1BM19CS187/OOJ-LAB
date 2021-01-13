import java.util.*;
import arithmetic.addition.*;
import arithmetic.division.*;
import arithmetic.multiplication.*;
import arithmetic.subtraction.*;

class test2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        sum s = new sum(a,b);
        diff d=new diff(a,b);
        mul m=new mul(a,b);
        div q=new div(a,b);
        sc.close();
    }
}