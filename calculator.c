#include<stdio.h>
#include<conio.h>
int main()
{
    int con;
	do
	{
	 int a,b,res;
	 char ch;
	 printf("the enter the value of a and b:");
     scanf("%d%d",&a,&b);
     printf("press '+' :to add\n");
     printf("press '-' :to aubtract\n");
     printf("press '*' :to multiply\n");
     printf("press '/' :to divide\n");
     printf("press '%' :modular operation\n");
     printf("press 'i' :increment\n");
     printf("press 'd' :decrement\n");
     printf("press '>' :greater than\n");
     printf("press '<' :less than\n");
     printf("press '=' :equal to\n");
     printf("press '!' :not equal to\n");
     printf("enter the operation to perform:");
	 scanf(" %c",& ch);
	 switch(ch)
	 {
		 case '+':res=a+b;
		          printf("the sum of two values is:%d",res);
				  break;
		 case '-':res=a-b;
		          printf("the difference of the the two values is:%d",res);
				  break;
		 case '*':res=a*b;
		          printf("the product of two values is:%d",res);
				  break;
	     case '/':res=a/b;
		          printf("the division of two values is:%d",res);
				  break;
		 case '%':res=a%b;
		          printf("the modulas of two values is:%d",res);
				  break;
		 case '>':if (a>b)
		 {
			 printf("yes, a is greater than b");
		 }
		          else
				  {
					  printf("no, a is not greater than b");
				  }
				  break;
		 case '<':if (a<b)
		 {
			 printf("yes, a is less than b");
		 }
		          else
				  {
					  printf("no, a is not less than b");
				  }
				  break;
		 case '=':if (a==b)
		 {
			 printf("yes, a is equal to b");
		 }
		          else
				  {
					  printf("no, a is not equal to b");
				  }
				  break;
		 case '!':if (a!=b)
		 {
			 printf("yes, a is not equal to b");
		 }
		          else
				  {
					  printf("no, a is equal to b");
				  }
				  break;
		 case 'i':a++;
		        b++;
		        printf("the increased value of a is %d and b is %d",a,b);
                break;
         case 'd':a--;
                b--;
                printf("the decreased value of a is %d and b is %d",a,b);
         default:printf("you have entered a false expression");		 
		 
	 }
	 printf("\npress 1 to continue.........");
	 scanf("%d",& con);
    }
	while(con==1);
	return 0; 
}
