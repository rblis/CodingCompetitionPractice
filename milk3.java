/*
ID: ryanxp81
PROG: milk3
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
import static java.lang.Math.min;
import static java.lang.Math.max;



public class milk3 {

	static int A,B,C;
	static boolean ABcheck[][]= new boolean[21][21];
	static boolean Cnote[] = new boolean[21];
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("milk3.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk3.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		A=Integer.parseInt(str.nextToken());
		B=Integer.parseInt(str.nextToken());
		C=Integer.parseInt(str.nextToken());
		milk(0,0,C);
		String abc = "";
		for(int k =0; k<21;k++) 
			if(Cnote[k]) {abc+=k+" ";
			
		}
		System.out.println(abc);
		out.println(abc.substring(0, abc.length()-1));
		out.close();
		System.exit(0);
	}
	public static void milk(int a, int b, int c) {
		System.out.println(a+" "+b+" "+c);
		if(ABcheck[a][b]) {System.out.println("-");return;}
		ABcheck[a][b]=true;
		if(a==0)Cnote[c]=true;
		if(c>0 && b<B)
			milk(a,b+min(B-b,c),c-min(B-b,c));
		if(c>0 && a<A)
			milk(a+min(A-a,c),b,c-min(A-a,c));
		if(b>0 && c<C)
			milk(a,b-min(C-c,b),c+min(C-c,b));
		if(b>0 && a<A)
			milk(a+min(A-a,b),b-min(A-a,b),c);
		if(a>0 && b<B)
			milk(a-min(B-b,a),b+min(B-b,a),c);
		if(a>0 && C>c)
			milk(a-min(C-c,a),b,c+min(C-c,a));
	}

}
