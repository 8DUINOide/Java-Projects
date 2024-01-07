//======================================================================================
//Filename : PAZ_Using while loop in Java.java
//Author : Al Francis B. Paz
//Description : Using while loop in Java, to find the temperature of the air affects the speed of the molecules, which in turn affects the speed of sound.
//Last modified: January 7, 2024
//======================================================================================
import java.util.Scanner;

class Cigarettes {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
    
    int degrees_input_begin;
    int degrees_input_end;
    double velocity;

    System.out.println("\nWelcome to Doppler Shift Happens!");
    System.out.println("\nPlease enter the starting temperature (degrees):");
    degrees_input_begin = scan.nextInt();
    System.out.println("\nPlease enter the ending temperature (degrees): ");
    degrees_input_end = scan.nextInt();
 
        while(degrees_input_begin <=degrees_input_end)
        {
            velocity= 331.3+0.61 * degrees_input_begin;
            System.out.println("At " + degrees_input_begin + " degrees celcius the velocity of sound is " + velocity +" m/s ");
             degrees_input_begin++;
        }
        
}
    }
