//==========================================================================================================
//Filename : PAZ_Using the math in Java.java
//Author : Al Francis B. Paz
//Email : afpaz@gbox.adnu.edu.ph
//Description : Using the math in Java, to Calculate the release angles and speeds for shooting a basketball into the rim.
//Last modified: January 20, 2024
//==========================================================================================================

import java.util.Scanner;

class Basketball {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
    double distance;
    double initial_ball_speed;
    double height;
   double g=9.8;
   double optimal_angle;
    double smallest_angle;
   double largest_angle;
    double maximum_height;
    double optimal_angle_deg;

//Prompt the user for the following inputs:

   System.out.println("Enter the distance of the shooting hand of the robot from the center of the basketball rim (in meters): ");
    distance = scan.nextDouble(); //user input
    System.out.println("Enter the initial ball speed (in meters/second): ");
    initial_ball_speed = scan.nextDouble(); //user input
    System.out.println("Enter the height of the ceiling (in meters): ");
    height = scan.nextDouble();

//compute and display the optimal angle (in degrees) for releasing the ball, such that it shoots at the center of the rim
     optimal_angle= (Math.asin(g* distance/(initial_ball_speed*initial_ball_speed))/2)*180.0/3.14159265359;
     System.out.println("The optimal angle to launch the ball is " +  optimal_angle + " degrees. ");

//compute and display the smallest angle (in degrees) that will still make the ball go into the rim
     smallest_angle=(Math.asin(g*(distance-(0.45/2))/(initial_ball_speed*initial_ball_speed))/2)*180/3.14159265359;
    System.out.println("Smallest angle to make the shot is "+ smallest_angle + " degrees. ");

//compute and display the largest angle (in degrees) that will still make the ball go into the rim
    largest_angle=(Math.asin(g*(distance+(0.45/2))/(initial_ball_speed*initial_ball_speed))/2)*180/3.14159265359;
     System.out.println("Largest angle to make the shot is "+largest_angle + " degrees. ");

//compute and display the maximum height (in meters)
    optimal_angle_deg=optimal_angle*3.14159265359/180.0;
     maximum_height=(Math.pow(initial_ball_speed,2.0)*Math.pow(Math.sin(optimal_angle_deg),2.0))/(2*g);
     System.out.println("The basketball will reach a maximum height of " + maximum_height +" meters ");

//determine whether or not the basketball will hit the ceiling when thrown at the optimal angle
    if(maximum_height<height)
    {
         System.out.println("The basketball will not hit the ceiling.");
    }
    else
    {
         System.out.println("The basketball will hit the ceiling.");
    }
}
    }
