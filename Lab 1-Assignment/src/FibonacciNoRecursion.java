import java.util.Scanner;
public class FibonacciNoRecursion {
	static int fib(int num)
	{
		int x=1,y=1;
		int z;
		for(int i=0;i<num-2;i++)
		{
			z=x+y;
			x=y;
			y=z;
		}
		return y;
	}	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num=sc.nextInt();
            System.out.println(fib(num));
		}

    }
}
