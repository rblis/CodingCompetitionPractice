import java.util.*;

public class ProblemG 
{
	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner console = new Scanner(System.in);
			int i = console.nextInt();
			int count = 0;
			if (i == 0)
				System.exit(0);
			ArrayList<String> StringList = new ArrayList<String>();
			console.nextLine();
			String Animal = console.nextLine();
			String lastWord = null;
			
			
			for( int j = 0; j < i; j++)
			{
				for(int k = Animal.length() - 1; k >= 0; k--){
					if(Animal.indexOf(" ", k) != -1){
						lastWord = Animal.substring(k + 1);
						break;
					}
					else if(k == 0)
						lastWord = Animal;
				}
				StringList.add(lastWord);
				Animal = console.nextLine();
				
			}
			Collections.sort(StringList);
			
				String[][] list = new String[2][i];
				for(int k =0; k <i;k++){
					if(false)//list[0][k].equals(Animal))
						list[1][k] = "" + (Integer.parseInt(list[1][k])+1);
				}	
				System.out.println("List 1:");
				for(int k =0; k <list.length;k++){
					System.out.println(list[0][k] + " | " +list[1][k]);
				}
		
			}
		}
	}
//}
