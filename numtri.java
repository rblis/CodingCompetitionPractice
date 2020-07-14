import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
ID: ryanxp81
PROG: numtri
LANG: JAVA              
*/
public class numtri {
	static int max=0,cMax=0,len,wid,x,y;
	static int[][] tree,chain;
	static ArrayList<Integer> xx= new ArrayList<Integer>();
	static ArrayList<Integer> yy= new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		System.out.println(Double.POSITIVE_INFINITY);
		BufferedReader in = new BufferedReader(new FileReader("numtri.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("numtri.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		len = Integer.parseInt(str.nextToken());
		wid = len*2-1;
		x=0;y=wid/2;
		tree = new int[len][wid];
		chain = new int [len][wid];
		int col=len-1;int c =col;
		for(int k =0; k< len;k++) {
			for(int j =0;j<len*2-1;j++) {
				tree[k][j]=-1;
				chain[k][j]=3;
			}
		}
		for (int row = 0; row < len; row++) {
			str = new StringTokenizer(in.readLine());
			while(str.hasMoreTokens()) {
				tree[row][c] = Integer.parseInt(str.nextToken());
				chain[row][c]=0;
				//System.out.print(tree[row][c]);
				c++;c++;
				
			}
			//System.out.println();
			col--;c=col;
			
			
		}
		dfs();
		System.out.println(max);
		out.println(max);
		out.close();
		System.exit(0);
		System.out.println(Runtime.getRuntime());
	}
	public static void dfs() {//possible errors
		boolean dive = true,done=false;
		cMax+=tree[x][y];
		while(dive) {
		dive = false;
		if(x==len-1&&y==wid-1) {
			if(cMax >max){
				max = cMax;
				System.out.println("MAX- "+ x+ " "+y+" "+max);
			}
			dive = false;
			done = true;
		}
		if(x==len-1 && !done) {
			if(cMax >max)
				{max = cMax;System.out.println("MAX- "+ x+ " "+y+" "+max);}
			for (int k =xx.size()-1;k>-1 ;k--) {
				cMax-=tree[x][y];
				x=xx.get(k);//gets last position
				y=yy.get(k);//sets to last position
				xx.remove(k);yy.remove(k);//removes last position since it is now current position
				print();
				if(chain[x][y]!=2)
					break;
				chain[x][y]=0;
			}
			dive = true;
		}
		if(chain[x][y]!=2 && !done) {//still has option to go right or left
			if(chain[x][y]==0) {//go left
				chain[x][y]=1;
				xx.add(x);yy.add(y);
				x++;y--;
				dive = true;
				print();
			}
			else if(chain[x][y]==1) {//go right
				chain[x][y]=2;
				xx.add(x);yy.add(y);
				x++;y++;
				dive = true;
				print();
			}
			
		}
		}
	}
	public static void print() {
		
		System.out.println((x*100)/(len)+ " " + (y*100)/(wid));
		/*for(int k =0; k< len;k++) {
			for(int j =0;j<wid;j++) {
				if (chain[k][j]==3) 
					System.out.print(" |   | " );	
				else {
					if(k==x&&j==y)
						System.out.print(" > " + chain[k][j]+" < " );
					else
						System.out.print(" | " + chain[k][j]+" | " );
			}}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------");*/
	}

}
