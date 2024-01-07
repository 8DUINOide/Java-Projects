//=============================================================================================================
//Filename : PAZ_Basic inputs and outputs in Java.java
//Author : Al Francis B. Paz
//Email : afpaz@gbox.adnu.edu.ph
//Description : Basic cin and cout in Java, to display the Cigarettes Sold, Profit, and Nicotine Consumed 
//Last modified: January 7, 2024
//================================================================================================================
import java.util.Scanner;

class Cigarettes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nicotine = 12;
        int cigarettes_in_a_pack = 20;
        double profit = 13.5;
        int year = 365;
        float cigarettes_sold_per_day;
        float cigarette_packs_sold_per_year;
        double profit_per_day;
        double profit_per_year;
        float nicotine_consumed;

        System.out.println("On average, how many cigarettes does your store sell in a day?");
        cigarettes_sold_per_day = scan.nextInt();
        cigarette_packs_sold_per_year = cigarettes_sold_per_day / cigarettes_in_a_pack * year;
        System.out.println("\nNumber of packs sold per year: " + Math.round(cigarette_packs_sold_per_year));
        profit_per_day = cigarettes_sold_per_day / cigarettes_in_a_pack * profit;
        System.out.println("\nProfit per day (Php): " + String.format("%.3f", profit_per_day));
        profit_per_year = profit_per_day * year;
        System.out.println("\nProfit per year (Php): " + String.format("%.3f", profit_per_year));
        nicotine_consumed = cigarettes_sold_per_day * nicotine * year;
        System.out.println("\nNicotine consumed by customers in a year(mg): " + String.format("%.3f",nicotine_consumed));
    }
}
