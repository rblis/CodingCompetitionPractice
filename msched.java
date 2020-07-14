import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class msched {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("msched.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("msched.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(str.nextToken());
		ArrayList<Integer>[] nums = new ArrayList[10000];
		int[][] list = new int[2][N];
		for(int k =0; k< N;k++) {
			str = new StringTokenizer(in.readLine());
			list[0][k]= Integer.parseInt(str.nextToken());
			list[1][k]= Integer.parseInt(str.nextToken());
			//System.out.println(list[0][k] + " " + list[1][k]);
		}
		//System.out.println();
		for(int k =0;k<N;k++) {
			int low = list[1][k];
			int ind = -1;
			for(int j =k+1; j<N;j++) {
				if(list[1][j]<low) {
					ind = j;
					low = list[1][j];
				}
			}
			if(ind>-1) {
			int temp1 = list[0][k];
			list[0][k] = list[0][ind];
			list[0][ind] = temp1;
			int temp = list[1][k];
			list[1][k] = list[1][ind];
			list[1][ind] = temp;
			}
			//System.out.println(list[0][k] + " " + list[1][k]);
		}
		//Arrays.fill(nums,new ArrayList<Integer>());
		int sum = 0;
		for(int k =0; k<N;k++) {
			int one = list[0][k];
			int two = list[1][k]-1;
			if(nums[two]==null)
				nums[two]=new ArrayList<Integer>();
			nums[two].add(one);
		}//find the smallest from each time group
		for(int k =nums.length-1;k>-1;k--) {//ticks down from the end to the begining
			int high = 0;int row=-1,col=-1;
			for(int l =nums.length-1; l>= k; l--) {//goes over unlocked cow times
				if(nums[l]!=null)
					for(int j =0;j<nums[l].size();j++) {//checks for max milk
						if (nums[l].get(j) > high) {
							high = nums[l].get(j);
							row = j;col=l;
						}
						//System.out.println("smallest in: " + (l+1) + " > " + high);
					}
			}
			if(!(row ==-1))
			nums[col].remove(row);
			sum+= high;
		}
		System.out.println(sum);
		out.println(sum);
		out.close();
		System.exit(0);
	}
}
