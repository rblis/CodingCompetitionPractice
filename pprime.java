/*
ID: ryanxp81
PROG: pprime
LANG: JAVA              
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;


public class pprime {
public static void main(String[] args) throws IOException {
	//Date date = new Date();
	//SimpleDateFormat ft = new SimpleDateFormat ("S");
	//int a = Integer.parseInt(ft.format(date));
	//System.out.println(isPrime(121));
		BufferedReader in = new BufferedReader(new FileReader("pprime.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("pprime.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		List<Integer> pal = new ArrayList<Integer>();
		int start = Integer.parseInt(str.nextToken());
		int end = Integer.parseInt(str.nextToken());
		if (start%2==0) 
		for (int n = start+1; n<= end; n+=2) {
			if(isPal(n))
				pal.add(n);}
		else 
			for (int n = start; n<= end; n+=2) {
				if(isPal(n))
					pal.add(n);
			}
		
		for(int k =0; k< pal.size(); k++) {
			if (isPrime(pal.get(k))) {
				out.println (pal.get(k));
				//System.out.println(pal.get(k));
			}
		}
		//date = new Date();
		//int b = Integer.parseInt(ft.format(date));
		//System.out.println("Time " + (b-a));
		out.close();
		System.exit(0);
}
static boolean isPrime(int n) {
    if(n < 2) return false;
    if(n == 2 || n == 3) return true;
    if(n%2 == 0 || n%3 == 0) return false;
    int sqrtN = (int)Math.sqrt(n)+1;
    for(int i = 6; i <= sqrtN; i += 6) {
        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
    }
    return true;
}
static boolean isPal(int n) {
	String pal = "" + n;
	for (int k =0; k< pal.length()/2; k++) {
		if(pal.charAt(k) != pal.charAt(pal.length()-k-1))
			return false;
	}
	return true;
}
}