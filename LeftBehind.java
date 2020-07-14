import java.util.Scanner;

public class LeftBehind {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int a = console.nextInt();
		int b = console.nextInt();
		
		while(a != 0 || b != 0) {
		
		if(a + b == 13) 
			System.out.println("Never speak again.");
		else if (a > b)
			System.out.println("To the convention.");
		else if (a == b)
			System.out.println("Undecided.");
		else if (b > a)
			System.out.println("Left beehind.");
		
		a = console.nextInt();
		b = console.nextInt();
		
		}
	}

}
