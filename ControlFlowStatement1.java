package com.mycompany.ipt.assignment.vergara;
import java.util.Scanner;

public class ControlFlowStatement1 {   
    public static void main(String[] args) {
        
        //------------Beginner
        
        int score =90;
        
        if (score >= 60){
            System.out.println("PASSED");
        }
        else {
            System.out.println("FAILED");
        }
        
        System.out.println("\n");
        
        //---------Intermediate
        
        
        double purchaceAmount = 3000, Discount, DP;
        
        if (purchaceAmount >= 3000){
            Discount = purchaceAmount * 0.15;
            DP = purchaceAmount - Discount;
            System.out.println("Discounted Pirce: " + DP);
        }
        else if (purchaceAmount >= 2000){
            Discount = purchaceAmount * 0.10;
            DP = purchaceAmount - Discount;
            System.out.println("Discounted Pirce: " + DP);
        } 
        else if (purchaceAmount >= 1000){
            Discount = purchaceAmount * 0.05;
            DP = purchaceAmount - Discount;
            System.out.println("Discounted Pirce: " + DP);
        }
         else if (purchaceAmount >= 500){
            Discount = purchaceAmount * 0.02;
            DP = purchaceAmount - Discount;
            System.out.println("Discounted Pirce: " + DP);
        }
         else {
             System.out.println("No Discount: " + purchaceAmount);
         }
        
        
        
        //-------------------Advanced
        System.out.println("\n\n");
        
        String username = "Gian", password = "1233";
        char Status = 'L';
        
            if ("Gian".equals(username)){
                System.out.println("Correct Username");
                if ("123".equals(password)){
                    System.out.println("Correct Password");
                    if (Status != 'L') {
                        System.out.println("Welcome Back!"); 
                    }else {
                        System.out.println("Please Unlock your account!");
                    }
                }else {
                    System.out.println("Wrong Password! Try again");
                }
            }else {
                System.out.println("Invalid Credentials!");
            }
            
            
      //-----------------Expert
    
     
      
  
      Scanner input = new Scanner(System.in);

      
      System.out.print("\n\nEnter username: ");
      String Username = input.nextLine();

      System.out.print("Enter account Pin: ");
      int pin = input.nextInt();
      
      int Balance = 500000;
      String AccTier = "No Status";
      
      double Dailylimit = 0;
      
      if (Username.equals("Gian")){
          System.out.println("\n\nWelcome! " + Username);
          if (pin == 1234){
          }else{
              System.out.println("Wrong PIN try again!");
          }
      }else{
          System.out.println("Wrong Account User");
      }
      
      
      if (Balance >= 1000000){
          System.out.println("Account Status: Platinum");
            AccTier = "Platinum";
            Dailylimit = 500000;
      }
      else if (Balance >= 100000){		
            System.out.println("Account Status: Gold");
            AccTier = "Gold";
            Dailylimit = 300000;
      }	 
      else if (Balance >= 50000){		
            System.out.println("Account Status: Silver");
            AccTier = "Silver";
            Dailylimit = 200000;
      }
      else if (Balance >= 3000){		
            System.out.println("Account Status: Bronze");
            AccTier = "Bronze";
            Dailylimit = 100000;
      }
      else {
          System.out.println("Account Status: No Status");
      }
          
     //Withdrawal Part
     
      System.out.println("Withdrawal Value: ");
      double Withdrawal = input.nextDouble();
      double Final = 0;

      
     if(Withdrawal < Balance){
         System.out.println("Sufficient Balance!");
         if(Withdrawal <= Dailylimit){
             System.out.println("Withdrawal Approved!");
             Dailylimit = Dailylimit - Withdrawal;
             Final = Dailylimit;
             System.out.println("Remaining Limit: " + Final);
         } else {
             System.out.println("Reached the limit of withdrawal!");
         }
     } else {
         System.out.println("Insufficient Balance!");
     }
     
      
     double fee;

switch (AccTier) {
    case "Platinum":
        fee = 0.15;
        break;

    case "Gold":
        fee = 0.13;
        break;

    case "Silver":
        fee = 0.10;
        break;

    case "Bronze":
        fee = 0.06;
        break;

    default:
        System.out.println("Invalid account tier!");
        return;
}

    double Sum = Final * fee;
    double Amount = Final - Sum;

    input.nextLine();

    System.out.print("Approve Transaction? Yes or No: ");
    String Approval = input.nextLine();

    if (Approval.equals("Yes")) {
        System.out.println("Transaction has been approved!");
        System.out.println("Final Amount: " + Amount);
    }else {
    System.out.println("Transaction has been cancelled.");
    }
      
        
      
    
    }
}
