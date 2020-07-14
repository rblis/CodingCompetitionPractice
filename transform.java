/*
ID: ryanxp81
PROG: transform
LANG: JAVA              
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class transform {

	private static char[][] orig,clone,mod,clone1;
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("transform.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("transform.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		int amt = Integer.parseInt(str.nextToken());
		char[][] orig = new char[amt][amt];
		char[][] mod = new char[amt][amt];
		for(int row =0; row < amt; row++) {
			str = new StringTokenizer(in.readLine());
			String line = str.nextToken();
			for(int col= 0; col < amt; col++) {
				orig[row][col] = line.charAt(col);
				System.out.print(orig[row][col]);
			}
			System.out.println();
		}
		System.out.println();
		for(int row =0; row < amt; row++) {
			str = new StringTokenizer(in.readLine());
			String line = str.nextToken();
			for(int col= 0; col < amt; col++) {
				mod[row][col] = line.charAt(col);
				System.out.print(mod[row][col]);
			}
			System.out.println();
		}
		char[][] clone = orig;char[][] clone1= orig;
		
		if(same(rotate90(clone, amt),mod, amt)){out.println("1");out.close();System.exit(0);}
		clone = rotate90(clone, amt);
		if(same(rotate90(clone, amt),mod,amt)){out.println("2");out.close();System.exit(0);}
		clone = rotate90(clone, amt);
		if(same(rotate90(clone, amt),mod,amt)){out.println("3");out.close();System.exit(0);}
		clone = rotate90(clone, amt);
		if(same(reflect(orig, amt),mod,amt)){out.println("4");out.close();System.exit(0);}
		clone1=reflect(orig,amt);
		for (int k = 0; k < 3;k++) {
			if(same(rotate90(clone1,amt),mod,amt)){out.println("5");out.close();System.exit(0);break;}
			clone1 = rotate90(clone1, amt);
		}
		if(same(mod,orig, amt)) {out.println("6");out.close();System.exit(0);}
		out.println("7");out.close();System.exit(0);
	}
	public static char[][] rotate90(char[][]a, int amt) {
		char[][] clone = new char[amt][amt];
		System.out.println();
		for(int row =0; row < amt; row++) {
			for(int col= 0; col < amt; col++) {
				clone[row][col] = a[amt-1-col][row];
				//System.out.print(clone[row][col]);
			}
			//System.out.println();
		}
		a=clone;
		
		
		return a;
	}
	public static char[][] reflect(char[][]a,int amt){
		char[][] clone = new char[amt][amt];
		System.out.println();
		for(int row =0; row < amt; row++) {
			for(int col= 0; col < amt; col++) {
				clone[row][col] = a[row][amt-1-col];
				//System.out.print(clone[row][col]);
			}
			//System.out.println();
		}	
		return clone;

	}
	public static boolean same(char[][] a, char[][] b, int amt) {
		for(int row=0; row < amt; row++) {
			for(int col = 0; col < amt; col++) {
				if(a[row][col] != b[row][col])return false;
			}
		}
		return true;
	}

}
