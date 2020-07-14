import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class clocks {

	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("clocks.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("clocks.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		int[] m1 = {1,2,4,5},m2 = {1,2,3},m3 = {2,3,5,6},m4 = {1,4,7},m5 = {2,4,5,6,8},m6 = {3,6,9},m7 = {4,5,7,8},m8 = {7,8,9},m9 = {5,6,8,9};
		ArrayList<int[]> moves = new ArrayList<int[]>();
		moves.add(m1);moves.add(m2);moves.add(m3);moves.add(m4);moves.add(m5);moves.add(m6);moves.add(m7);moves.add(m8);moves.add(m9);
		int[]clock=new int[9];
		for(int k =1; k < 10; k++) {
			if(k%3==0) 
				str = new StringTokenizer(in.readLine());
			clock[k]=Integer.parseInt(str.nextToken());
		}
		for(int k =0; k < 262144; k++) {
			
		}
		
	}
	public static int[] checker(int[] clock) {
		int[] full = new int[9];
		for(int A =1; A < 10;A++) {
			if(clock[A]==12) 
				clock[A] = A;
			else
				clock[A] = 0;
		}
		return full;
	}
	public static boolean cleared(int[] clock) {
		for(int a: clock)
			if(a != 0)
				return false;
		return true;
	}

}
