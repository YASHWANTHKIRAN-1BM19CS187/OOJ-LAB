import java.util.*;
class account{
  String customer_name;
  int account_number;
  String account_type;
}
class curr_acct extends account{
  Scanner x=new Scanner(System.in);
  double temp=0.0;
  double amount=0.0;
  double fine=0.0;
  double min_amount=1000.0;
  void getdetails(){
    customer_name=x.nextLine();
    account_number=x.nextInt();
  }
  void deposit(){
    System.out.println("Enter the deposit amount : ");
    temp=x.nextDouble();
    amount+=temp;
  }
  void showbalance(){
    if(amount>=min_amount){
      System.out.println("Balance is : "+amount);
    }
    else{
      fine=(amount*1.0*10)/100;
      amount-=fine;
      System.out.println("the fine imposed : "+fine);
      System.out.println("Balance is : "+amount);
    }
  }
  void withdrawal(){
    System.out.print("Enter the withdrawal amount : ");
    temp=x.nextDouble();
    amount-=temp;
  }

}
class sav_acct extends account{
  Scanner x=new Scanner(System.in);
  double temp=0.0;
  double amount=0.0;
  double interest=0.0;
  void getdetails(){
    customer_name=x.nextLine();
    account_number=x.nextInt();
  }
  void deposit(){
    System.out.print("Enter the deposit amount : ");
    temp=x.nextDouble();
    amount+=temp;
  }
  void showbalance(){
    System.out.println("Balance is : "+amount);
  }
  void withdrawal(){
    System.out.print("Enter the withdrawal amount : ");
    temp=x.nextDouble();
    amount-=temp;
  }
  void interest(){
    interest=(amount*1.0*3)/100;
    amount+=interest;
    System.out.println("interest added : "+interest);
    System.out.println("Balance is : "+amount);
  }
}
public class Main{
  public static void main(String[] args){
    int opt=0;
    String type=null;
    Scanner x=new Scanner(System.in);
    System.out.println("Welcome to the bank service");
    System.out.println("Enter the type of account (curr_acct/sav_acct)");
    type=x.nextLine();
    if(type.equals("curr_acct")){
      curr_acct a=new curr_acct();
      System.out.println("Enter the customer_name,account_number:");
      a.getdetails();
      while(true){
        System.out.println("press 1 : Accept deposit and update the balance");
        System.out.println("press 2 : Display the balance");
        System.out.println("press 3 : Withdrawal and update the balance");
        System.out.println("Enter option : ");
        opt=x.nextInt();
        switch(opt){
          case 1 :a.deposit();
                  a.showbalance();
                  break;
          case 2 :a.showbalance();
                  break;
          case 3 :a.withdrawal();
                  a.showbalance();
                  break;
        }
      }
    }
    if(type.equals("sav_acct")){
      sav_acct a=new sav_acct();
      System.out.println("Enter the customer_name,account_number:");
      a.getdetails();
      while(true){
        System.out.println("press 1 : Accept deposit and update the balance");
        System.out.println("press 2 : Display the balance");
        System.out.println("press 3 : Compute and deposit interest");
        System.out.println("press 4 : Withdrawal and update the balance");
        System.out.println("Enter option : ");
        opt=x.nextInt();
        switch(opt){
          case 1 :a.deposit();
                  a.showbalance();
                  break;
          case 2 :a.showbalance();
                  break;
          case 3 :a.interest();
                  a.showbalance();
                  break;
          case 4 :a.withdrawal();
                  a.showbalance();
                  break;
        }
      }
    }
  }
}