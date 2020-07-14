/*
ID: ryanxp81
PROG: dualpal
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


public class dualpal {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("dualpal.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("dualpal.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(str.nextToken());
		int S = Integer.parseInt(str.nextToken())+1;
		
		while (N>0) {
			int check = 0;
			for (int j = 2; j < 11;j++) {
				
				if (pal(toBase(S, j))) {check++;}
				if(check ==2) {out.println(S);N--;break;}
		
			}
			S++;
		}
		out.close();
		System.exit(0);
	}
	public static boolean pal(String input) {
		 for(int i=0; i<input.length(); i++) {
			 if (input.charAt(i) != input.charAt(input.length()-i-1)) return false;
			 }
			 return true;
	}
	 static final char[] rep = new char[] {'0','1','2','3','4','5','6','7','8','9',
			 'A','B','C','D','E','F','G','H','I','J'};
	 private static String toBase(int i, int base) {
		 StringBuilder sb = new StringBuilder();
		 int val = i;
		 while(val >= base) {
		 sb.insert(0, rep[val%base]);
		 val = val/base;
		 }
		 return sb.insert(0, rep[val]).toString();
		 }
}
