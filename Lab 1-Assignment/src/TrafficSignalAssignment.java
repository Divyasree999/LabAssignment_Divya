import java.util.Scanner;
public class TrafficSignalAssignment {
    public static void main(String[] args) {
		System.out.println("enter color");
		Scanner sc=new Scanner(System.in);
		String color=sc.nextLine();
		switch(color)
		{
		case "red":
		System.out.println("stop");
		break;
		case "yellow":
		System.out.println("ready");
		break;
		case "green":
				System.out.println("go");
		break;
		}
	}

}
