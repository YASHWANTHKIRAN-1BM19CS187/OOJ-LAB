package CIE;
import java.util.*;
public class personal
{
	public String name;
	public int sem;
	public String usn;
	
	public void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		name = sc.next();
		System.out.println("Enter the semester");
		sem = sc.nextInt();
		System.out.println("Enter the USN");
		usn = sc.next();
	}
	public void display()
	{
		System.out.println("Student details: ");
		System.out.println("Name: "+name+"\nUSN: "+usn+"\nSem: "+sem);
	}
		
	
}