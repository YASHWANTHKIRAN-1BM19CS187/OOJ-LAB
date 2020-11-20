import CIE.*;
import SEE.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sx = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n= sx.nextInt();
		CIE.internals in[]= new CIE.internals[n];
		SEE.externals en[]= new SEE.externals[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			System.out.println("Student "+(i+1));
			in[i] = new CIE.internals();
			en[i] = new SEE.externals();
			in[i].read();
			
			System.out.println("CIE MARKS:");
			in[i].accept();
			System.out.println("SEE MARKS:");
			en[i].get();
			System.out.println();
			in[i].display();
			for(j=0;j<5;j++)
			
			System.out.println("Total Marks for course "+(j+1)+": "+(in[i].cie[j] + (en[i].see[j]/2)));
		}
	}
}