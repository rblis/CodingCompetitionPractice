/*
 ID: ryanxp81
 LANG: JAVA
PROG: barn1
 */
import java.util.*;
import java.io.*;
//import static java.lang.System.*;
public class barn1{
public static int pi(String a){return Integer.parseInt(a);}
public static void main(String[] args) throws IOException{
BufferedReader read = new BufferedReader(new FileReader("barn1.in"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("barn1.out")));
String[] stuff = read.readLine().split(" ");
int boards = pi(stuff[0]);
int tot = pi(stuff[1]);
int stallsC = pi(stuff[2]);
ArrayList<Integer> stalls = new ArrayList<Integer>();
for (int n = 0; n<stallsC; n++){
stalls.add(pi(read.readLine()));
}
Collections.sort(stalls);
tot = stalls.get(stalls.size()-1)-stalls.get(0);
ArrayList<Integer> gaps = new ArrayList<Integer>();
for (int n = 0; n<stallsC-1; n++){
if (stalls.get(n)==(stalls.get(n+1)-1))
continue;
else
gaps.add(stalls.get(n+1)-stalls.get(n));
}

Collections.sort(gaps); Collections.reverse(gaps);
int what = boards;
if (boards<stallsC){
while (boards>1){
//out.println(tot+" "+gaps+" "+boards);
try{tot -= gaps.get(0); gaps.remove(0); boards-=1;} catch (Exception E){}
}out.println(tot+what);}
else{
tot = stallsC;
out.println(tot);
}

out.close();
System.exit(0);

}
} 