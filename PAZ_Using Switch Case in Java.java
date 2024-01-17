//======================================================================================
//Filename : PAZ_Using Switch Case in Java.java
//Author : Al Francis B. Paz
//Email : afpaz@gbox.adnu.edu.ph
//Description : Using Switch Case in Java, to calculate and output how many servings your favorite food should be eaten per day to maintain the persons current weight at the specified activity level. 
//Last modified: January 17, 2024
//======================================================================================

import java.util.Scanner;

class switchCase {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          
  double age;
double weight;
double height;
double BMR=0;

System.out.println("Enter your age: ");
age=scan.nextDouble();
System.out.println("Enter [M] for male and [F] for female: ");
char gender = scan.next().charAt(0);
System.out.println("Enter weight (in kg): ");
weight=scan.nextDouble();;
System.out.println("Enter height (in cm): ");
height=scan.nextDouble();;
System.out.println("................................................" + "\n");
 
  switch (Character.toUpperCase(gender)) {
  case 'M':
     BMR=(10*weight)+(6.25*height)-(5.0*age)+5;
    System.out.println("\n BMR is "+BMR+" cal per day" + "\n");
    break;
  case 'F':
    BMR=(10*weight)+(6.25*height)-(5.0*age)-161;
    System.out.println("\n BMR is "+BMR+" cal per day"+ "\n");
    break;
 
  }
//Write another function that computes the calories required for physical activity, taking as input parameters for the intensity, weight, and minutes spent exercising.

int number_of_activity;
int minutes;
double CRPA=0;

System.out.println("................................................" + "\n");
System.out.println("Choose a daily physical activity \n");
System.out.println("[1] Running 10 mph \n");
System.out.println("[2] Running 6 mph \n");
System.out.println("[3] Basketball \n");
System.out.println("[4] Walking 1 mph \n");
System.out.println("Enter the number of the chosen activity: ");
number_of_activity=scan.nextInt();

 //CRPA= 0.0385*Intensity*weight*minutes;
switch (number_of_activity) {
  case 1:
    System.out.println("Enter minutes spent on Running 10 mph: ");
    minutes=scan.nextInt();
    CRPA= 0.0385*17*weight*minutes;
    break;
  case 2:
   System.out.println("Enter minutes spent on Running 6 mph: ");
    minutes=scan.nextInt();
    CRPA= 0.0385*10*weight*minutes;
    break;
    case 3:
    System.out.println("Enter minutes spent on Basketball: ");
    minutes=scan.nextInt();
    CRPA= 0.0385*8*weight*minutes;
    break;
  case 4:
   System.out.println("Enter minutes spent on Walking 1 mph: ");
    minutes=scan.nextInt();
    CRPA= 0.0385*1*weight*minutes;
    break;
 
  }
   
//Write a program, using these functions to calculate and output how many servings your favorite food should be eaten per day to maintain the person's current weight at the specified activity level. The computation should include the energy that is required to digest food.

  int number_of_food;
  double servings;
  double consume_calories;
  double CRDF;
 int kCal;
System.out.println("................................................"+ "\n");
System.out.println("Choose a food to be consumed \n");
System.out.println("[1] Doughnuts \n");
System.out.println("[2] Rice \n");
System.out.println("[3] Spaghetti \n");
System.out.println("[4] Chicken \n");
System.out.println("Enter the number of the chosen food: ");
number_of_food=scan.nextInt();;
System.out.println("................................................" + "\n");


 //servings=CRPA/TotalCaloriesConsumed
switch (number_of_food) {

  case 1:
  kCal=210;
  CRDF=kCal*0.1;
  consume_calories=Math.round((BMR*CRDF*0.01)+(CRPA*CRDF*0.01))+kCal-(3*CRDF)+BMR+CRPA;
    servings=consume_calories/kCal;
    System.out.println("To be just the weigh you are, you would have to consume "+consume_calories+" calories or "+ servings +" servings of your favorite Doughnuts per day. \n");
    break;
  case 2:
   kCal=225;
   CRDF=kCal*0.1;
   consume_calories=Math.round((BMR*CRDF*0.01)+(CRPA*CRDF*0.01))+kCal-(3*CRDF)+BMR+CRPA;
  servings=consume_calories/kCal;
   System.out.println("To be just the weigh you are, you would have to consume "+consume_calories+" calories or "+ servings +" servings of your favorite Rice per day. \n");
   break;
    case 3:
     kCal=190;
     CRDF=kCal*0.1;
    consume_calories=Math.round((BMR*CRDF*0.01)+(CRPA*CRDF*0.01))+kCal-(3*CRDF)+BMR+CRPA;
   servings=consume_calories/kCal;
    System.out.println("To be just the weigh you are, you would have to consume "+consume_calories+" calories or "+servings+" servings of your favorite Spaghetti per day. \n");
    break;
  case 4:
   kCal=75;
   CRDF=kCal*0.1;
  consume_calories=Math.round((BMR*CRDF*0.01)+(CRPA*CRDF*0.01))+kCal-(3*CRDF)+BMR+CRPA;
   servings=consume_calories/kCal;
    System.out.println("To be just the weigh you are, you would have to consume "+consume_calories+" calories or "+ servings +" servings of your favorite Chicken per day. \n");
    break;
 
  }
}
       
   }
     
    
