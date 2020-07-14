/*
ID: ryanxp81
PROG: namenum
LANG: JAVA              
*/
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

//4734
public class namenum {
static ArrayList<String> names;
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("namenum.in"));
		BufferedReader dic = new BufferedReader(new FileReader("dict.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("namenum.out")));
		StringTokenizer str = new StringTokenizer(in.readLine());
		String code = str.nextToken();
		names = new ArrayList<String>();
		str = new StringTokenizer(dic.readLine());
		String temp ="";
		while((temp = dic.readLine()) != null){
			names.add(str.nextToken());
			str = new StringTokenizer(temp);
		}
		int noneCheck = 0;
		char[][]codes= {{'A','B','C'},{'D','E','F'},{'G','H','I'},{'J','K','L'},{'M','N','O'},{'P','R','S'},{'T','U','V'},{'W','X','Y'}};
		for(int k = 0; k < names.size(); k++) {
			String name = names.get(k);int count = 0;
			if(name.length() == code.length()) {
				for(int j = 0; j < name.length(); j++) {
					if(getNumber(name.charAt(j)) == Integer.parseInt(code.substring(j,j+1)))count++;
				}
				if(count == code.length()) {out.println(name);	System.out.println(name); noneCheck++;}
				}
			}
		if(noneCheck == 0)out.println("NONE");
		out.close();
		System.exit(0);
		}
	
public static int getNumber(char c) {
    switch (c) {
    case 'A':
        return 2;
    case 'B':
        return 2;
    case 'C':
        return 2;
    case 'D':
        return 3;
    case 'E':
        return 3;
    case 'F':
        return 3;
    case 'G':
        return 4;
    case 'H':
        return 4;
    case 'I':
        return 4;
    case 'J':
        return 5;
    case 'K':
        return 5;
    case 'L':
        return 5;
    case 'M':
        return 6;
    case 'N':
        return 6;
    case 'O':
        return 6;
    case 'P':
        return 7;
    case 'R':
        return 7;
    case 'S':
        return 7;
    case 'T':
        return 8;
    case 'U':
        return 8;
    case 'V':
        return 8;
    case 'W':
        return 9;
    case 'X':
        return 9;
    case 'Y':
        return 9;
    default:
        return 0;
    }
}
	

}
