#include <stdio.h>
 #include <conio.h>
#include<string.h>
void IOT();
void DataStructure();
void J2eee();
char display(char);
void printing();
struct studentdetails
{
    char  studentname[40];
    char  course[3];
}sc[1000];
int n;
int c_IOT=0;
int c_advanced_and_j2=0;
int c_advanced_data_structures=0;
int choice,choice_new;
int main()
{
  printf("Enter the number of students\n");
  scanf("%d",&n);
 scanf("%c");
  for(int i=0;i<n;i++)
  {
  printf("Enter the name of student %d\n",(i+1));
gets(sc[i].studentname);
  }
printf("1:Internet Of Things\t2:Advanced Java And J2EE\t3:Advanced DataStructures\n");
for(int i=0;i<n;i++)
{
printf("Enter the choice of student %s\n",sc[i].studentname);
scanf(" %d",&choice);

switch(choice)
{
case 1:c_IOT++;
sc[i].course[0] = 'I';
break;
case 2:c_advanced_and_j2++;
sc[i].course[0] = 'J';
break;
case 3:c_advanced_data_structures++;
sc[i].course[0] = 'D';
break;
}
}
printf("Number of students applied for Internet of things is %d \n",c_IOT);
printf("Number of students applied for advanced java and J2EEE is %d \n",c_advanced_and_j2);
printf("Number of students applied for data structures is %d\n",c_advanced_data_structures);

 do{
if(c_IOT >=0 && c_IOT<30)
{IOT();
}
  if(c_advanced_and_j2>=0 && c_advanced_and_j2<30)
{J2eee();
}
  if(c_advanced_data_structures>=0 && c_advanced_data_structures<30)
{
DataStructure();
}
if((c_advanced_data_structures>30||c_advanced_data_structures==0)&&(c_advanced_and_j2>30||c_advanced_and_j2==0)&&(c_IOT==0||c_IOT>30)){
break;
}
else{
  break ;
}
}while(1);
 printing();
printf(" ");}
void printing(){
printf("******After modification*******\n");
printf("Number of students applied for Internet of things is %d \n",c_IOT);
printf("Number of students applied for advanced java and J2EEE is %d \n",c_advanced_and_j2);
printf("Number of students applied for data structures is %d\n",c_advanced_data_structures);
printf("Students in Internet of things are:\n");display('I');
printf("\nStudents in advanced java and J2EEE are:\n");display('J');
printf("\nStudents in Advanced Data Structures are :\n");display('D');
}

void IOT(){
  for(int i = 0 ;i<=n;i++)
  {if(sc[i].course[0]=='I'){
  printf("This IOT  Course cannot be floated please select the other from the other two course only\n");
  printf("2:Advanced Java And J2EE\tOR\t3:Advanced DataStructures\n");
  c_IOT--;
  printf("Enter the Course for Student %s :",sc[i].studentname);
  scanf(" %d",&choice_new);
  if(choice_new == 2){
    printf("student %s applied for Advanced Java And J2EE  \n",sc[i].studentname);
  sc[i].course[0] = 'J';c_advanced_and_j2++;}
  else{

  sc[i].course[0] = 'D';c_advanced_data_structures++;
printf("student %s has applied for Advanced data structures \n",sc[i].studentname);
} }
}
}
void J2eee(){
  for(int i = 0 ;i<=n;i++)
  {if(sc[i].course[0]=='J'){
  printf("This J2EEE Course cannot be floated please select from  the other two course only\n");
  printf("1:Internet Of Things\tOR\t3:Data structures\n");
  c_advanced_and_j2--;
    printf("Enter the Course for Student %s :",sc[i].studentname);
  scanf(" %d",&choice_new);
  if(choice_new == 1){
    printf("student %s applied for internet of things  \n",sc[i].studentname);
  sc[i].course[0] = 'I';c_IOT++;}
  else{
  sc[i].course[0] = 'D';
  printf("student %s has applied for Advanced data structures \n",sc[i].studentname);
  c_advanced_data_structures++;}
}}
}
void DataStructure(){
  for(int i = 0 ;i<=n;i++)
  {if(sc[i].course[0]=='D'){
    printf("This Advanced data Structures Course cannot be floated please select from the other two course only\n");
    printf("1:Internet Of Things\tOR\t2:Advanced java and j2eee\n");
    c_advanced_data_structures--;
      printf("Enter the Course for Student %s :",sc[i].studentname);
    scanf(" %d",&choice_new);
    if(choice_new == 1){
      printf("student %s applied for internet of things  \n",sc[i].studentname);
    sc[i].course[0] = 'I';
    c_IOT++;}
    else{
  sc[i].course[0] = 'J';
  c_advanced_and_j2++;
 printf("student %s applied for Advanced Java And J2EE  \n",sc[i].studentname);
  }}
}
}
char display(char ch){
  int l=1;
  for(int i=0;i<=n;i++){
    if(sc[i].course[0]==ch){
    printf("%d. %s\t",l,sc[i].studentname);l++;}
  }return 0;
}
