import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class nocow {
	static ArrayList<String>[] adjs;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("nocow.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("nocow.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(str.nextToken());
		int K = Integer.parseInt(str.nextToken());
		str = new StringTokenizer(in.readLine().substring(20));
		int adjCount=0;
		while(!str.nextToken().equals("cow.")){
			adjCount++;
		}
		System.out.println(adjCount);
		adjs = new ArrayList[adjCount];
		in = new BufferedReader(new FileReader("nocow.in"));
		in.readLine();
		for(int k =0; k< N;k++) {
			String sent = in.readLine();
			str = new StringTokenizer(sent.substring(19,sent.indexOf("cow.")));
			for(int j = 0; j<adjCount;j++) {
				adjs[j].add(str.nextToken());
				System.out.println(adjs[j]);
			}
		}
		
	}
	public static boolean duplicates(int k, int j) {
		
		
		return false;
		
	}
}
