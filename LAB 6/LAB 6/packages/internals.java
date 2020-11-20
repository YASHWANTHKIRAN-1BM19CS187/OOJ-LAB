 package CIE;
import java.util.*;
public class internals extends personal
{
	public double cie[];
	
	public void accept()
	{
		cie= new double[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("CIE mark for course "+(i+1)+" : ");
			cie[i]= sc.nextDouble();
		}
	}
	
	
	
}