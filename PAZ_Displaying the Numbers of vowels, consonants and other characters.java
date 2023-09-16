//=============================================================================================================
//Filename : PAZ_Displaying the Numbers of vowels, consonants and other characters.java
//Author : Al Francis B. Paz
//Email : afpaz@gbox.adnu.edu.ph
//Exercise Number : 2
//Description : Displaying the Numbers of vowels, consonants and other characters using java
//Last modified: August 16, 2023
//================================================================================================================


import java.util.Scanner;


public class PAZ_lab2 {

static void wordcounter(String str){
      char ch;
      int len, i, vowel=0, consonant=0, special_character = 0;
      len = str.length();
      
    for(i=0; i<len; i++)
      {
         ch = str.charAt(i);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            vowel++;
         }
        else if(str.charAt(i)>'a' && str.charAt(i)<'z'){
             consonant++;
         }
        else {
      
                special_character++;
            }
        
      }
       System.out.println("\nNumber of vowels: " +vowel);
      System.out.println("Number of consonants: " +consonant);
      System.out.println("Other characters:" +special_character);
}
     public static void main(String[] args)
   {
       
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a word: ");
      String str2=s.next();
      str2=str2.toLowerCase();
      wordcounter(str2);
   }
}

