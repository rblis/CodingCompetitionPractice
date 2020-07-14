/*
ID: ryanxp81
PROG: beads
LANG: JAVA              
*/

import java.util.*;
import java.io.*;
public class beads{
 public static int pi(String a){return Integer.parseInt(a);}
 public static void main(String[] args) throws IOException{
BufferedReader read = new BufferedReader(new FileReader("beads.in"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
int N = pi(read.readLine());
String st = read.readLine();
st = st+st;
int max = 0;
for (int i = 0; i<2*N; i++){
int right = 0; char a = 'w'; boolean firstoccurence = true;
for (int k = i; k<2*N; k++){
if (st.charAt(k)== a|| st.charAt(k)== 'w'){
right++;
if (st.charAt(k)!='w'){
firstoccurence = false;
a = st.charAt(k);
}
}
else{
if (firstoccurence){
firstoccurence = false;
right++;
a = st.charAt(k);
}
else
break;
}
}
int left = 0; a = 'w'; firstoccurence = true;
for (int k = i-1; k>=0; k--){
if (st.charAt(k)== a|| st.charAt(k)== 'w'){
left++;
if (st.charAt(k)!='w'){
firstoccurence = false;
a = st.charAt(k);
}
}
else{
if (firstoccurence){
firstoccurence = false;
left++;
a = st.charAt(k);
}
else
break;
}
}
if (right+left>max)
max = right+left;
if (right+left>N)
max = N;
}
System.out.println(max);
out.println(max);
out.close();
System.exit(0);

}
} 