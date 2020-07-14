/*
ID: ryanxp81
PROG: friday
LANG: JAVA              
*/
import java.util.*;
import java.io.*;
public class friday{
 public static int pi(String a){return Integer.parseInt(a);}
 public static void main(String[] args) throws IOException{
BufferedReader read = new BufferedReader(new FileReader("friday.in"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
int years = pi(read.readLine())+1900;
int y = 1900; int d = 13; int m = 1; int dow = 0; int[] arr = new int[7]; while (y<years){
arr[dow]+=1;
if (m==2){ 
if (y%100==0 && y%400!=0){
dow = (dow+28)%7; }
else if (y%4==0){
dow= (dow+29)%7; //leap year
}
else
dow = (dow+28)%7;
}
else if (m==4||m==6||m==9||m==11){
dow= (dow+30)%7;}
else{
dow = (dow+31)%7;
}

m+=1; if (m>12){
m = 1; y+=1;
}

}
out.println(Arrays.toString(arr).replaceAll("[\\[\\],]","")); out.close();
System.exit(0);

}
}