/*
ID: ryanxp81
PROG: ride
LANG: JAVA              
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
public class ride {
	
	public static void main(String[] args) throws IOException{
		write();
	}
	public static int multSumChar(String chars){
		int sum = 1;
		for (int k =0; k < chars.length(); k++){
			sum *= (Character.getNumericValue(chars.charAt(k))-9);
		}
		return sum;
	}
	public static String isSameMod(int sum1, int sum2){
		if ((sum1 % 47) == (sum2 % 47)) return "GO";
		else return "STAY";
	}
	public static void write() throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("ride.in"));
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		String comet, group;
		
		comet = str.nextToken ();
		str = new StringTokenizer (in.readLine());
		group = str.nextToken ();
		out.println(isSameMod(multSumChar(comet), multSumChar(group)));     
		out.close();                                  
		System.exit(0);   
	}

}