//======================================================================================
//Filename : PAZ_Using for loops in Java.java
//Author : Al Francis B. Paz
//Email : afpaz@gbox.adnu.edu.ph
//Description : Using for loops in Java, to print all of the prime numbers between 1 and 1000
//Last modified: January 17, 2024
//======================================================================================

class primeNumbers {
    public static void main(String[] args) {
        
   for(int j=2;j<2050;j++){
       int i;
       boolean is_prime=true;
       for(i=2;i<=j/2;i++){
           if(j%i==0)
           {
               is_prime = false;
               break;
           }

       }
       if(is_prime){
          System.out.println(j+",");
       }
       }
       
   }
     
    }
