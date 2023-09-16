//=============================================================================================================
//Filename : PAZ_Simple Bank Application.java
//Author : Al Francis B. Paz
//Email : afpaz@gbox.adnu.edu.ph
//Exercise Number : 1
//Description : Simple Bank Application using java
//Last modified: August 15, 2023
//================================================================================================================


import java.util.Scanner;

public class BankTransaction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String accountName;
        double initialDeposit;
        double totalBalance = 0;
        String transactionType;
        double transactionAmount;
         String option = "yes";
         
         System.out.print("Enter account name: ");
        accountName = scan.nextLine();

        System.out.print("Enter the initial deposit: ");
        initialDeposit = scan.nextDouble();
          totalBalance += initialDeposit;
        
         while(option.equalsIgnoreCase("yes"))
        {
          
             System.out.print("\nEnter a transaction type [deposit/withdraw/inquiry]: ");
            scan.nextLine();
            transactionType = scan.nextLine();

            if (transactionType.equals("deposit")) {
                System.out.print("Amount to deposit: ");
                transactionAmount = scan.nextDouble();
                totalBalance += transactionAmount;
            } 
            else if (transactionType.equals("withdraw")) {
                System.out.print("Amount to withdraw: ");
                transactionAmount = scan.nextDouble();
                totalBalance -= transactionAmount;
            } 
            else if (transactionType.equals("inquiry")) {
                // Inquiry has no transaction amount
            } 
            else {
                System.out.println("Invalid transaction type.");
            }

            System.out.println("Total balance: " + totalBalance);
            
            System.out.print("\nDo you want to enter another number? [yes/no]:");
            option = scan.next();
        }

        System.out.println("Thank you for using our application!");

    }
}
        