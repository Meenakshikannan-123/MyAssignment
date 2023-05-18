package Week3day3Ass;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		 //Declare a String
		String text1="stops";
		//Declare another String
		String text2="potss";
		int length1=text1.length();
		System.out.println("text1 length:"+length1);
		
		int length2=text2.length();
		System.out.println("text2 length:"+length2);
		
		if(text1.length()==text2.length()) {
		//Convert both string in to characters
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			// sort both the arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			//check both the arrays has same value
			if(Arrays.equals(charArray1, charArray2))
		    {	
			System.out.println("it is an anagram");
			}else
			{
				System.out.println("it is not an anagaram");
			}
			
			
		}
		
		
	}

}
