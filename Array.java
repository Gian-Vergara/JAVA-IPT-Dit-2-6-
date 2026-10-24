package com.mycompany.ipt.assignment.vergara;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
       
        
        //----Beginner
        
        String favorite[] = {"Computer", "Cash", "GPU", "Bed", "Phone" };
    
        
            for(int i = 0; i < favorite.length; i++){
                System.out.println("Favorites " + favorite[i]);
                
            }
            
           System.out.println("\nTotal Length: " + favorite.length);
           
           
           //-------Intermediate
           
           int scores[] = {5,4,3,7,10,8,8,9};
           int sum = 0, High = 0, low = 0;
           int highest = scores[0], lowest = scores[0];
           
           double avg = 0;
           
           for(int k = 0; k < scores.length; k++){
               sum += scores[k];   
           }
           
           for(int j = 0; j < scores.length; j++){
               if (scores[j] > highest){
                   highest = scores[j];
               }
               
               if (scores[j] < lowest){
                   lowest = scores[j];
               }
           }
              avg = (double)sum / scores.length;  
              
              System.out.println("\nSum: " + sum);
              System.out.println("Average: " + avg);
              System.out.println("Highest: " + highest);
              System.out.println("Lowest: " + lowest + "\n");
              
              
  //---------------------Advanced
  
            for (int a = 0, b = 0; a < scores.length; a++){
                System.out.println("Value found: " + scores[a] +" index at: " + b++);
            }
           
            System.out.println("\n");
            
            for (int c = 0; c < scores.length; c++){
                System.out.println("Scores: " + scores[c]);
            }
            
            Arrays.sort(scores);
            
            for (int d = 0; d < scores.length; d++){
                 System.out.println("Sorted Scores: " + scores[d]);
            }
            
            /**
             Data sorting is really important for data structures especially
             * when handling the database, because arrays is one of the example of
             * storing data just like databases
             
             **/
            
     //-----------------------Expert
     
     System.out.println("\n");
     int row = 0;
     int num = 1;
     double container = 0;
   
     
     String students[] = {"Gian", "Pot", "Vincent", "Kent"};
     int Scores[][] = {{25, 10, 37, 7},
                       {27, 8, 42, 9},
                       {30, 9, 47, 10},
                       {26, 7, 45, 8}};
     
     double average = 0;
     double averages[] = new double[students.length];
    
     
     for (int stud = 0; stud < students.length; stud++){
            double SUM = 0;
            System.out.println("Name: " + students[stud]);
           
         for (row = 0; row < Scores.length; row++){
             System.out.println("Scores: " + Scores[stud][row]);
                SUM += Scores[stud][row];
                
         }    
         
         average = SUM / Scores[stud].length;
         averages[stud] = average;
         System.out.println("Average: " + average);
     }
         
        System.out.println("\n Unsorted Value");
     for (int e = 0; e < averages.length; e++){
         System.out.println("" + averages[e]);
     }
     
     for(int WHAT = 0; WHAT < averages.length - 1; WHAT++){
         for (int f = 0, g = 1; g < averages.length; f++, g++){
         if (averages[f]<averages[g]){
             double temp = averages[f];
             averages[f] = averages[g];
             averages[g] = temp; 
             
         }
        }
     }
     
     
    for(int t = 0, h = 0, i = 1; t < averages.length; t++){
        if(averages[h]==averages[i]){
                    System.out.println("Rank "+ num + ": "+ students[t] + " Average " + averages[t]);
                    }
                    System.out.println("Rank "+ num++ + ": "+ students[t] + " Average " + averages[t]);
                }
    }

}
