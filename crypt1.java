/*
ID: ryanxp81
PROG: crypt1
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


public class crypt1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("crypt1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("crypt1.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		int count =0;
		int num = Integer.parseInt(str.nextToken());
		int[] nums = new  int[num];
		str = new StringTokenizer(in.readLine());
		for(int k =0; k < num; k++) {
			nums[k] = Integer.parseInt(str.nextToken());
		}
		int mult,yi,er,sum1,sum2,sum3;String m ="";
		for(int a =0; a < num; a++) {
			m+=nums[a];
			for(int b =0; b < num; b++) {
				m+=nums[b];
				for(int c =0; c < num; c++) {
					m+=nums[c];
					for(int d =0; d < num; d++) {
						er=nums[d];
						for(int e =0; e < num; e++) {
							yi=nums[e];
							mult = Integer.parseInt(m);
							sum1 = mult*yi;
							sum2 = mult*er*10;
							sum3 = sum1+sum2;
							if(sum1<1000 && sum1>99 && sum2<1000 && sum2>99 && sum3<10000 && sum3>999) {
								count++;
							}
							
						}
					}
					m ="";
				}
			}
		}
		System.out.println(count);
	}

}
