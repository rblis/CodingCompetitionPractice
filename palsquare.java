/*
ID: ryanxp81
PROG: palsquare
LANG: JAVA              
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class palsquare {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("palsquare.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("palsquare.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		int base = Integer.parseInt(str.nextToken());
		for(int N = 1; N<301; N++) {
			if(pal(based(N*N,base))) {
				System.out.println(based(N,base)+ " " +based(N*N, base));
				out.println(based(N,base)+ " " +based(N*N, base));
			}
		}
		out.close();
		System.exit(0);
	}
	public static boolean pal(String str) {
		for(int k = 0; k < str.length()/2; k++) {
			if(str.charAt(k)!=str.charAt(str.length()-k-1))return false;
	}
		return true;
	}
	 private static final String symbols = "0123456789ABCDEFGHIJ";
	private static String based(int number, int base) {
		int quotient=0, remainder=0;
		String result="";
		while(number!=0) {
		quotient = number/base;
		remainder = number%base;
		if(remainder>base || remainder>=10) {
		result= symbols.charAt(remainder) + result;
		}
		else {
		result= remainder + result;
		}
		number= quotient;
		}
		return result;
		}
	
}
