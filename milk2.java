/*
ID: ryanxp81
PROG: milk2
LANG: JAVA              
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
3
300 1000
700 1200
1500 2100
 */

public class milk2 {
	
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("milk2.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		int amt = Integer.parseInt(str.nextToken());
		int[] start = new int[amt];
		int[] end =  new int[amt];
		//str = new StringTokenizer(in.readLine());
		for(int k = 0; k<amt; k++) {
			str = new StringTokenizer(in.readLine());
			start[k] = Integer.parseInt(str.nextToken());
			end[k] = Integer.parseInt(str.nextToken());
			//System.out.println(start[k] + " " + end[k]);
		}
		for (int i=0; i<amt; i++) {
	        for (int j=i+1; j<amt; j++) {
	            if (start[i] > start[j]) {
	                
	                int temp = start[i];
	                start[i] = start[j];
	                start[j] = temp;
	                
	                temp = end[i];
	                end[i] = end[j];
	                end[j] = temp;
	            }
	        }
	    }
		for(int i = 0; i < amt;i++) {
			System.out.println(start[i] + " " + end[i]);
		}
		
		if(amt == 1) {
			out.println((end[0]-start[0]) + " " + 0);
			out.close();
			System.exit(0);
		}
		int max=0, min = 0, index = 0;int sum = end[0]-start[0],idl = 0, st = start[0], en = end[0];boolean continuos = true;
		while(index <amt-1) {
			if(en >= start[index+1] )//end greater than next start 
			{if(en<= end[index+1])en = end[index+1];sum = en-st;}//end equals is the next end, sum is the next end minus this start
			else {
				idl=start[index+1]-end[index];
				if(min<idl) min=idl;
				if(max<sum) {max = sum;sum=0;en=end[index+1];st = start[index+1];index++;continuos = false;}
			}
			
			index++;
		}
		if (continuos) {max=en-st;}
		System.out.println(max + " " + min);
		out.println(max + " " + min);
		out.close();
		System.exit(0);
	}

}
