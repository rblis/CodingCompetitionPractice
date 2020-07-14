import java.io.*;
import java.util.*;


public class OdometerBR {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("odometer.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("odometer.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		Long start = Long.parseLong(str.nextToken());
		Long end = Long.parseLong(str.nextToken());
		Long count =0L;

		 for(Long k = start; k < end+1; k++) {
			String num = ""+k;

			char a,b = ' ';
			
			for(int j = 0; j < num.length(); j++) {
					int aa =1, bb = 0;
					a = num.charAt(j);
					boolean first = false;
					for(int i =j+1; i<num.length(); i++) {
						char c =  num.charAt(i);
						if(!first && a != c) {
							b = c;
							first = true;
						}
						if(a == c)
							aa++;
						else if(b == c)
							bb++;
						else 
							break;
					}
						if(aa ==1 ^ bb ==1) {
							count++;
							System.out.println(num);
						}
						else
							break;
						
					
					break;
					
				}
			
		}
		System.out.println(count);
		out.close();
		System.exit(0);
	}

}
