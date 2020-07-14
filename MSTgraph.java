import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class MSTgraph {
	public static void main(String[] args) throws IOException {
		System.out.println(Double.POSITIVE_INFINITY);
		BufferedReader in = new BufferedReader(new FileReader("mst.in"));
		StringTokenizer str = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(str.nextToken());
		int C = Integer.parseInt(str.nextToken());
		int[]x=new int[N], y=new int[N];
		for (int k =0; k< N;k++) {
			str = new StringTokenizer(in.readLine());
			x[k] = Integer.parseInt(str.nextToken());
			y[k] = Integer.parseInt(str.nextToken());

		}
		int[][] gap = new int[N][N];
		for(int[] g: gap)
			Arrays.fill(g,0);
		for(int k =0; k<N;k++) 
			for(int j =0; j<N;j++) {
				if(x[k]!=x[j] &&y[k]!=y[j]) {
					int distance = (int)(Math.pow(x[k]-x[j],2)+Math.pow(y[k]-y[j],2));
					if(distance>C)
						gap[k][j] = distance;
				}
			}
		ArrayList<Integer> done = new ArrayList<Integer>();
		done.add(0);
		int sum=0;
		while(done.size() < N) {
			int min=-1;int len=0,wid=0;boolean first =true;
			for(int ind : done) {//nodes to search
				for (int k = ind; k < N; k++) {//nodes that are linked to target node
					//System.out.println(ind+ " - " + k);
					
					if(first && gap[ind][k]!=0) {min =gap[ind][k];first = false;}
					if(gap[ind][k]!=0 && gap[ind][k]<=min) {
						min = gap[ind][k];
						len = ind;wid=k;
					}
				}
			}
			done.add(len);
			sum+=gap[len][wid];
			//System.out.println(wid + " " + len + " - " + gap[len][wid]);
			gap[len][wid]=0;
			//print(N,gap);
		}
		
		System.out.println(sum);
	}
	public static void print(int N, int[][] gap) {
		for(int k =0; k<N;k++) {
			for(int j =0; j<N;j++) 
				System.out.print("[ "  +gap[k][j]+ " ]");
			System.out.println();
		}
	}
	
}

