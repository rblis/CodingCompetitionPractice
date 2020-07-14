/*
ID: ryanxp81
PROG: milk
LANG: JAVA              
*/
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class milk {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("milk.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		int farmFill = Integer.parseInt(str.nextToken());
		int farms = Integer.parseInt(str.nextToken());
		int[] farmPrice = new int[farms];
		int[] farmGal = new int[farms];
		int[] lows = new int[farms];
		int k =0;
		for(int l = 0; l < farms; l++) {
			str = new StringTokenizer(in.readLine());
			int price = Integer.parseInt(str.nextToken());
			farmPrice[k] = price;
			farmGal[k] = Integer.parseInt(str.nextToken());
			k++;
		}
		int i, j, first, temp; 
	    for ( i = farmPrice.length - 1; i > 0; i-- ) 
	    {
	         first = 0;   //initialize to subscript of first element
	         for(j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
	         {
	              if( farmPrice[j] > farmPrice[ first ] )         
	                first = j;
	         }
	         temp = farmPrice[ first ];   //swap smallest found with element in position i.
	         farmPrice[first] = farmPrice[ i ];
	         farmPrice[i] = temp;
	         temp = farmGal[ first ];   //swap smallest found with element in position i.
	         farmGal[first] = farmGal[ i ];
	         farmGal[i] = temp;
	     }
	    int index =0;int cents=0;
	    while(farmFill > 0) {
	    	while(farmGal[index] >0 && farmFill > 0) {
	    		//System.out.println(farmGal[index] + " "+ farmPrice[index] + " " + cents +" "+ farmFill);
	    		farmFill--;
	    		farmGal[index]--;
	    		cents+=farmPrice[index];
	    	}
	    index++;
	    }
	    //System.out.println(cents);
	    out.println(cents);
	    out.close();
	    System.exit(0);
	}

}
