import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class ccski {
	static int max = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		//BufferedReader in = new BufferedReader(new FileReader("ccski.in"));
		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ccski.out")));
		//StringTokenizer str = new StringTokenizer(in.readLine());
		
		long startTime = System.nanoTime();
		
		int max = Integer.MAX_VALUE;//substitute for infinity
		
		int[][] points={//I used -1 to denote non-adjacency/edges
				//0, 1, 2, 3, 4, 5, 6, 7
				{-1,20,-1,80,-1,-1,90,-1},//0
				{-1,-1,-1,-1,-1,10,-1,-1},//1
				{-1,-1,-1,10,-1,50,-1,20},//2
				{-1,-1,-1,-1,-1,-1,20,-1},//3
				{-1,50,-1,-1,-1,-1,30,-1},//4
				{-1,-1,10,40,-1,-1,-1,-1},//5
				{-1,-1,-1,-1,-1,-1,-1,-1},//6
				{-1,-1,-1,-1,-1,-1,-1,-1} //7
				};
		int [] record = new int [8];//keeps track of the distance from start to each node
		Arrays.fill(record,max);
		int sum =0;int q1 = 0;int done =0;
		ArrayList<Integer> Q1 = new ArrayList<Integer>();//nodes to transverse 
		ArrayList<Integer> Q2 = new ArrayList<Integer>();//nodes collected while transversing
		Q1.add(0);//starting point
		q1= Q1.get(0);
		while(done<9) {// <<< My Problem
			for(int q2 = 1; q2<8;q2++) {//skips over the first/starting node
				if(points[q1][q2]!=-1) {//if node is connected by an edge
					if(record[q1] == max)//never visited before
						sum=0;
					else 
						sum=record[q1];//starts from where it left off
					int total = sum+points[q1][q2];//total distance of route
					if(total < record[q2])//connected node distance
						record[q2]=total;//if smaller
					Q2.add(q2);//colleceted node
				}
			}
			done++;
			Q1.remove(0);//removes the first node because it has just been used
			if(Q1.size()==0) {//if there are no more nodes to transverse
				Q1=Q2;//Pours all the collected connecting nodes to Q1
				Q2= new ArrayList<Integer>();
				q1=Q1.get(0);
			}
			else//
				q1=Q1.get(0);//sets starting point 
		}
		
		long endTime = System.nanoTime();
		System.out.println("\nTIME: " + (endTime - startTime)/1000);
	}
	public static void print(int[] aa) {
		for(int b : aa) {
			if (b == max)
				System.out.print("MAX ");
			else 
				System.out.print(b + " ");
		}
		System.out.println();
	}

}
/*
while( done !=-1) {
			
			for(int next = 1; next < 8; next++) {
				if(record[next]!=max)
					sum = record[next];
				if(points[node][next] !=-1) {
					posQ.add(next);
					if((points[node][next]+sum)<record[next]) {
						record[next]=points[node][next]+sum;
						
						//System.out.println("FROM: " + node + " to " + next);
						print(points,record);
					}
				}
				if(node==next && points[node][next] !=-2) {
					points[node][next] =-2;
					System.out.println(" done ");
				}
				done++;
			}
			for(int next = 1; next < 8; next++) {
				if(points[node][next]>-1&&points[next][next]!=-2) {
					sum+=points[node][next];
					System.out.println("JUMP: " + node +" to " + next);
					node=next;
					break;
				}
			}
		}
 */

