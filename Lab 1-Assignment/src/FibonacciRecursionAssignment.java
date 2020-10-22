import java.util.Scanner;
public class FibonacciRecursionAssignment {
	static int fib(int number) 
	{
		if(number<=1)
			return number;
		return fib(number-1) +fib(number-2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		System.out.println(fib(number));
	}

}
