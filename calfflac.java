import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class calfflac {

	public static void main(String[] args) throws IOException {
		String pal= "";
		BufferedReader in = new BufferedReader(new FileReader("calfflac.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("calfflac.out")));
		while(in.ready()) {
			pal+=in.readLine();
		}
		String mod = pal;
		System.out.println(pal);
		for(int k = 0; k < mod.length()-1; k++) {
			if(mod.charAt(k) == ' ' || mod.charAt(k) == ':' ||mod.charAt(k) == '.' || mod.charAt(k) == ',' || mod.charAt(k) == '\\') {
				
			}
		}
	}

}
