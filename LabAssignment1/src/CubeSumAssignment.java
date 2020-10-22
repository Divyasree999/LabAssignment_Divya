import java.util.Scanner;
public class CubeSumAssignment {
	static int sumOfCubes(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int digit=n%10;
			sum=sum+(digit*digit*digit);
			n=n/10;
		}
		return sum; 	
	}
	public static void main(String[] args)
	{
		System.out.println("Enter a number :" );
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(sumOfCubes(n));
	}
	   
}
