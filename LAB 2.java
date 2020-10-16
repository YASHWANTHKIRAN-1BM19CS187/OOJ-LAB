import java.util.*;
 public class Student{
	public static void main(String args[]) {
		int usn ,n; 
		int Sgpa,sum=0,msum=0;
		int[] credits;
		int[] marks;
		String name;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number Of Subjects");
        n=sc.nextInt();
        credits=new int[n];
        marks=new int[n];
System.out.println("Enter the name of the Student");
        name=sc.next();
        
        System.out.println("Enter the USN of The Student");
        usn=sc.nextInt();

    
        for(int i=0;i<n;i++)
        {    System.out.println("Enter the Credits  And Marks Of The Subject"+(i+1));
            credits[i]=sc.nextInt();
			 marks[i]=sc.nextInt();
        }
		Student1 s1 = new Student1();
		for(int x: credits) {
    		sum +=x;}
		for(int y: marks) {
    		msum +=y;}
		s1.accept(usn,credits,marks,name);
		Sgpa = s1.FindSgpa(sum);
		s1.display(msum, Sgpa);
		
	}
}
class Student1 {
   int usn;
    int[] credits = new int[100];
   int[] marks = new int[100];
    String name;
    void accept(int usn, int[] credits, int[] marks, String name) {
     this.usn= usn;
     this.credits = credits;
     this.marks = marks;
     this.name = name;	
    }
    void display(double tot,int  Sgpa) {
    	System.out.println("\nName: "+name+"USN: "+usn+"\nTotal Marks: "+tot+"\nSgpa: "+Sgpa);
    }
    int  FindSgpa(int vsum) {
    	int  Sgpa ; int sum=0,v=0;
    	for(int x: marks) {
    		
    		sum +=(credits[v++]* x);
    	
    	}
    	Sgpa = sum/(vsum*10);
    	return (Sgpa);
    }
    
}
