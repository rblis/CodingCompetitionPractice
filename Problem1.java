import java.util.Scanner;
import java.io.IOException;


public class Problem1 {
	public static void main (String [] args) throws IOException
	{
		Scanner console = new Scanner (System.in);
	
		int p1t = console.nextInt();
		int p1o = console.nextInt();
		int p2t = console.nextInt();
		int p2o = console.nextInt();
		int p1n, p2n;
		
		while(p1t != 0 && p1o != 0 && p2t != 0 && p2o != 0) {
			
			if (p1t > p1o)
				p1n = p1t * 10 + p1o;
			else 
				p1n = p1o * 10 + p1t;
		
			if (p2t > p2o)
				p2n = p2t * 10 + p2o;
			else 		
				p2n = p2o * 10 + p2t;	
		
		
			if( p1n == 12 || p1n == 21)//21 or 12
			{
				if(p2n == 21 || p2n == 12)
					System.out.println("Tie.");
				else
					System.out.println("Player 1 wins.");
			}
			else if(p1t == p1o)
			{
				if(p2t == p2o)
				{
					if (p1t > p2t)
						System.out.println("Player 1 wins.");
					else if (p2t > p1t)
						System.out.println("Player 2 wins.");
					else
						System.out.println("Tie.");
				}
				else
					if (p2n == 21 || p2n == 12)
						System.out.println("Player 2 wins.");
					else
						System.out.println("Player 1 wins.");
			}
			else
			{
				if(p2t == p2o)
					System.out.println("Player 2 wins.");
				else if(p2n == 21 || p2n == 12)
					System.out.println("Player 2 wins.");
				else
				{
					if(p1n > p2n)
						System.out.println("Player 1 wins.");
					else if(p2n > p1n)
						System.out.println("Player 2 wins.");
					else
						System.out.println("Tie.");
				}
			}
			p1t = console.nextInt();
			p1o = console.nextInt();
			p2t = console.nextInt();
			p2o = console.nextInt();
			
		}
	}
}
