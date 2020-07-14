/*
ID: ryanxp81
PROG: gift1
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


public class gift1 {
	static int[] pplI;
	static String[] pplS;
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer str;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("gift1.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
		str = new StringTokenizer(in.readLine());
		
		int pplNum = Integer.parseInt(str.nextToken());
		pplI = new int[pplNum];
		pplS = new String[pplNum];
		
		for (int k = 0; k < pplNum; k++){
			str = new StringTokenizer(in.readLine());
			pplS[k] = str.nextToken();
		}
		boolean list = true;
		while (list){
		str = new StringTokenizer(in.readLine());
		String name = str.nextToken();
		trade(name);
		if(!in.ready())list = false;
		}
		for(int k = 0; k < pplS.length; k++)
		out.println(pplS[k] +' '+ pplI[k]);
		out.close();
		System.exit(0);
	}
	public static void trade(String name) throws IOException{
		int indexGift = find(name), indexRecieve;
		str = new StringTokenizer(in.readLine());
		int gift = Integer.parseInt(str.nextToken());
		int ppl = Integer.parseInt(str.nextToken());
		if (ppl > 0){
		//pplI[indexGift] += gift;
		
		int giftAmount = gift/ppl;
	
		for(int k =0; k < ppl; k++){
			str = new StringTokenizer(in.readLine());
			indexRecieve = find(str.nextToken());
			pplI[indexRecieve] += giftAmount;
			
		}
		pplI[indexGift] -= giftAmount*ppl;
		}
	}
	public static int find(String name){
		for (int k = 0; k < pplS.length; k++)
			if (pplS[k].equals(name))return k;
		return -1;
	}
	
	
	

}
