#include <stdio.h>
int printeven(int m,int n)
{
    while(n>m)
    {
        m++;
        if((m%2==0)&&(m!=n))
            printf("%d\n",m);
    }
    return 0;
}
float sumaver(int m,int n)
{
    int sum=m+n;
    printf("the sum of two numbers is:%d\n",sum);
    float avg=sum*1.0/2;
    return avg;
}

int main(int argc, char **argv)
{
	int a,b,c,g1,g2;
    printf("enter the three numbers:");
    scanf("%d%d%d",& a,& b,& c);
    g1=((a>b)&&(a>c))?a:((b>a)&&(b>c))?b:c;
    if(a==g1)
    {
        if(b>c)
            g2=b;
        else
            g2=c;
    }
    else if(b==g1)
    {
        if(a>c)
            g2=a;
        else
            g2=c;
    }
    else
    {
        if(a>b)
            g2=a;
        else
            g2=b;
    }
    float k=sumaver(g1,g2);
    printf("the average of two numbers is:%f\n",k);
    printeven(g2,g1);
    
	return 0; 
}
