import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProblemE 
{
	public static void main(String[] args) 
	{
	Scanner console = new Scanner (System.in);
	while(true)
	{	
		int i = console.nextInt();
	//int i = Integer.parseInt(console.nextLine());
		if (i == 0)
			System.exit(0);
		String[] list = new String[i];
		for(int k =0; k<i; k++){
			list[k] = console.next();
	}
	int maxC = 0;
	String maxCount = "";
	for(int k =0; k < i; k++){
		String word = list[k];
		if(word.length() >1){
			int count=0;
			char a,b;
			for(int j =0; j<word.length()-1; j++){
				a = word.charAt(j);b = word.charAt(j+1);
				if(isVowel(a) && a==b){
					count++;
				}
				if(count>maxC){
					maxCount = word;
					maxC = count;
				}
			}
		}
	}
	System.out.println(maxCount);
	maxC = 0;
	maxCount = "";
	}
	
	}
	
	public static boolean isVowel(char a){
		char[] vowels = {'a','e','i','o','u','y'};
		for(char vowel: vowels)
		{	
			if(vowel == a) 
				return true;
		}
		return false;
	}
	}
	/*	
	while(i != 0)
	{
		vowelCountMax = 0;
		ArrayList<String> StringList = new ArrayList<String>();
		char[] vowels = {'a','e','i','o','u','y'};
		i = console.nextInt();
		if (i == 0)
			break;
		String maxVowelWord = "";
		for(int k = 0; k < i; k++)
		{
			StringList.add(console.next());
		}
		for(String word: StringList)
		{
			vowelCountTemp = 0;
			for(int k = 1; k < word.length(); k++)
			{
				lastCharVowel = false;
			    currentCharVowel = false;	
				for(char vowel: vowels)
				{	
					if(vowel == word.charAt(k)) 
						currentCharVowel = true;
				}
				for(char vowel: vowels)
				{
					if(vowel == word.charAt(k-1)) 
						lastCharVowel = true;
				}
				if((currentCharVowel==true && lastCharVowel == true) && word.charAt(k) == word.charAt(k-1) )
				{
					vowelCountTemp++;
					if(vowelCountMax < vowelCountTemp)
					{
						vowelCountMax = vowelCountTemp;
						maxVowelWord = word;
					}
				}
			}
			lastCharVowel = false;
		    currentCharVowel = false;	
				
		}
			System.out.println(maxVowelWord);
		}
		*/
