
package com.mycompany.ipt.assignment.vergara;
import java.util.Scanner;

public class ControlFlowStatement2 {

    public static void main(String[] args) {
        
    //---------------Begenner
    
    for(int i = 0; i <= 10; i++){
        System.out.println("Number: " + i + " Square Root: " + (i * i));
    }
    
    //----------------Intermediate
    
    System.out.println("\n");
    int Num = 0, Num2 = 0;
    
   
    while(Num >= 0){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer: ");
        Num = input.nextInt();
        
        if(Num >=0){
            Num2 = Num2 + Num;
        }
        
    }
        System.out.println("Total: " + Num2);
   
    //-----------------Advanced
    
    
    for(int row = 0; row < 5; row++){
        
        if(row == 2){ //When the condition meets the 2nd row will be removed
           continue;
           }
       for(int clm = 0; clm < 5; clm++){
           System.out.print(" *");
           
           if (clm == 3){ //When the condition meets the final column won't print
               break;
           }
       }
        System.out.println(" ");
        
       }
    
    //-------------Expert
    
    int warehouse[][] = {{1,3,5},{6,7,-1}}; 
   
    
    
    
        Scanner input = new Scanner(System.in);
        int pick = 0;
        
        
        
        do{
            System.out.println("1. Check Inventory");
            System.out.println("2. Restock");
            System.out.println("3. Exit");
            
            System.out.print("Choose: ");
            pick = input.nextInt();
            
            switch(pick){
            case 1:
                int Total = 0;
                System.out.println("Checking inventory");
                
                for(int m = 0; m < warehouse.length * warehouse[0].length; m++){
                    
                     int r = m / warehouse[0].length;
                     int c = m % warehouse[0].length;
                    
                     if(warehouse[r][c] < 0){
                     System.out.println("Damage Shelft Detected!");
                     continue;
                    
                }
                  Total += warehouse[r][c];  
            }
            System.out.println("Inventory value: " + Total);
        
                
                break;
      case 2:
            System.out.println("Restocking");

            search:
            for(int rows = 0; rows < warehouse.length; rows++){
                for(int columns = 0; columns < warehouse[rows].length; columns++){

                    if (warehouse[rows][columns] == -1){
                        System.out.println("Damaged Shelf: " + warehouse[rows][columns]);
                        continue;
                    }

                    while(warehouse[rows][columns] <= 2){

                        System.out.println("Critical Shelf Detected!");

                        int amount = Restock(input);
                        warehouse[rows][columns] += amount;

                        System.out.println("New Stock: " + warehouse[rows][columns]);

                        break search;
                    }
                }
            }

            break;
            case 3:
                System.out.println("Exit Finished Restocking");
                break;
            default:
                System.out.println("Please choose the right number");
        }
                    }while(pick != 3);
  
    }
        
    static int Restock(Scanner input) {
    while (true) {
        System.out.print("Enter amount to restock: ");
        int amount = input.nextInt();
        if (amount >= 1 && amount <= 100) {
            return amount;     
        }
        System.out.println("Invalid amount. Try again.");
    }
}
}
    

