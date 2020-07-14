import java.util.Scanner;
import java.io.IOException;

public class Beehives {

	public static void main(String[] args) {
		
		Scanner console = new Scanner (System.in);
		double[][] pos;
		int n, sour, sweet, c;
		double d;
		
		do{
			d = console.nextDouble();
			n = console.nextInt();
			
			if(d == 0 && n == 0)
				break;
			
			c = 0;
			sour = 0;
			sweet = 0;
			
			pos = new double[n][3];
			
			do{
				pos[c][0] = console.nextDouble();
				pos[c][1] = console.nextDouble();
				c++;
			}while(c < n);
			
			for(int i = 0; i < n-1 ; i++){
				for(int j = i + 1; j < n; j++){
					if ( d >= Math.sqrt(Math.pow(pos[i][0] - pos[j][0], 2) + Math.pow(pos[i][1] - pos[j][1], 2))){
						pos[i][2] = 1;
						pos[j][2] = 1;
					}	
				}
			}
			
			for(int k = 0; k < n; k++){
				if(pos[k][2] == 1)
					sour++;	
				else
					sweet++;
			}
			
			System.out.println(sour + " sour, " + sweet + " sweet");
			
			
		}while(true);

	}

}
