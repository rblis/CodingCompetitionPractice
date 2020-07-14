import java.util.Scanner;

public class PronblemF {

	public static void main(String[] args) {
		
		Scanner console = new Scanner (System.in);
		int bestA = 0, bestB = 0;
		double bestVal = 0, a, b;
		int n = console.nextInt();
		int m = console.nextInt();		
		
		do{
			for(int k = 0; k <n ; k++) {
				a = console.nextDouble();
				b = console.nextDouble();
				
				if(!(a > m))
					if(bestVal > (b/a) || bestVal == 0) {
						bestVal = b/a;
						bestA = (int)a;
						bestB = (int)b;
					}
					else if(bestVal == b/a)
						if(a > bestA) {
							bestVal = b/a;
							bestA = (int)a;
							bestB = (int)b;
						}
			}
		
			if(bestVal != 0)
				System.out.println("Buy " + bestA + " tickets for $" + bestB);
			else
				System.out.println("No suitable tickets offered");
			
			n = console.nextInt();
			m = console.nextInt();
			bestVal = 0;
			
		}while(n != 0 || m != 0);

		
	}

}
