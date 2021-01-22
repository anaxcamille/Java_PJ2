import java.io.*;
import java.util.*;

public class ArraySum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	     System.out.print("\nInput a word: ");
		 String word = in.nextLine();
		 word = word.trim();
		 String result = ""; 
	     char[] ch=word.toCharArray();  
			 for (int i = ch.length - 1; i >= 0; i--) {
				 result += ch[i];
			 }
			 String reverse = result.trim();
			if(reverse.equals(word)){
				System.out.print("yes");
			}else{
				System.out.print("No");
			} 
		 }			 
        
 }