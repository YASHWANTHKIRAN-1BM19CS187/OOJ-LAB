package SEE;
import java.util.*;
import CIE.*;
public class externals extends personal
{
	public double see[];
	
	public void get()
	{
		see= new double[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("SEE mark for course "+(i+1)+" : ");
			see[i]= sc.nextDouble();
		}
	}
	
	
}
