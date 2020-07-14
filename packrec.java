/*
ID: ryanxp81
PROG: packrec
LANG: JAVA              
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class packrec {

	static int lx,ly;
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("packrec.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("packrec.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		ArrayList<Integer> x = new ArrayList<Integer>(), y = new ArrayList<Integer>();
		x.add(Integer.parseInt(str.nextToken()));
		y.add(Integer.parseInt(str.nextToken()));
		while(in.ready()) {
			str = new StringTokenizer(in.readLine());
			x.add(Integer.parseInt(str.nextToken()));
			y.add(Integer.parseInt(str.nextToken()));
		}
		int area = totalArea(x,y);
		x.clear();y.clear();
		for(int k =1;k<=area;k++) {
			if((area/k>=lx && k >=ly && area/k * k==area)||((area/k>=ly && k >=lx && area/k * k==area))) {
				x.add(area/k);
				y.add(k);
			}
		}
		System.out.println(area);
		out.println(area);
		for (int k =x.size()-1;k>-1;k--) {
			if(x.get(k)<=y.get(k)){
			out.println(x.get(k)+ " " + y.get(k));
			System.out.println(x.get(k)+ " " + y.get(k));
			}
		}
		out.close();
		System.exit(0);
	}
	public static int totalArea(ArrayList<Integer> x, ArrayList<Integer> y) {
		int sum =0, xx = x.get(0), yy = y.get(0);
		for(int k = 0; k < x.size(); k++) {
			sum+=x.get(k)*y.get(k);
			if(x.get(k)>xx)xx=x.get(k);
			if(y.get(k)>yy)yy=y.get(k);
		}
		lx=xx;ly=yy;
		//System.out.println(lx+" "+ly);
		return sum;
	}
	

}
