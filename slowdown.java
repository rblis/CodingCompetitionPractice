import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class slowdown {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader in = new BufferedReader(new FileReader("slowdown.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("slowdown.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		final long startTime = System.currentTimeMillis();
		int N = Integer.parseInt(str.nextToken());
		int a=0;
		ArrayList<Integer> T = new ArrayList<Integer>();
		ArrayList<Integer> D = new ArrayList<Integer>();
		while(a<N) {//initailizes T and D to two arraylists.
			str = new StringTokenizer(in.readLine());
			if(str.nextToken().equals("T")) {
				T.add(Integer.parseInt(str.nextToken()));
				a++;
			}
			else {
				D.add(Integer.parseInt(str.nextToken()));
				a++;
			}
		}
		T = sort(T);
		D = sort(D);
		int k =0,j =0,speed =1,time=0;
		double distance=0.0;
		while(distance < 1000.0) {
			time++;
			if(k<D.size() && D.get(k)==distance) {
				speed++;k++;
			}
			if(j<T.size() && T.get(j)==time) {
				speed++;j++;
			}
			
			distance+=1.0/(double)speed;
			//distance = (double)Math.round(distance);
			System.out.println(distance + " - " + time + " - 1/" + speed);
		}
		System.out.println(--time);
		final long endTime = System.currentTimeMillis();
		System.out.println("TIME: " + (endTime - startTime));
	}
	public static ArrayList<Integer> sort(ArrayList<Integer> a) {//uses selection sort for increasing order 
		for(int k =0; k<a.size();k++) {
			int low = a.get(k);int index = -1;
			for(int j =k+1; j< a.size();j++) {
				if(a.get(j)<low) {
					index = j;
					low = a.get(j);
				}
			}
			if(index!=-1) {
			int temp = a.get(index);
			a.set(index,a.get(k));
			a.set(k,temp);
			}
			System.out.println(a.get(k));
		}
		System.out.println("-----");
		return a;
	}

}
