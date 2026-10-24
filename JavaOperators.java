package com.mycompany.ipt.assignment.vergara;

public class JavaOperators {
    
    public static void main(String[] args) {
        
        //-------------------Begginer
        
        int NUM1 = 35, NUM2 =7;
        double SUM;
        
        System.out.println("Add: " + (SUM = NUM1 + NUM2)); //When you add a negative the number will go up vise versa, if both are negative the number will go down
        System.out.println("Subtract: " + (SUM = NUM1 - NUM2)); //If positive minus negative(Num++), if N minus N(Num++), and if Negative minus Positive(Num--)
        System.out.println("Multiply: " + (SUM = NUM1 * NUM2)); //N multiplied by N = P, N * P = N(Vise Versa), P * P = P
        System.out.println("Divide: " + (SUM = NUM1 / NUM2));  // P / P = P, N / P = N(Vise Versa), N / N = P
        System.out.println("Remainder/Modulus: " + (SUM = NUM1 % NUM2)); /**
         *                                                                 if both numbers are divisible it means = 0 despite being (N)
         *                                                                 if Odd
         *                                                                 P % N = P, N % P = N, N % N = N, P % P = P
                                                                         **/  
        System.out.println("");
        
        //--------------------Intermediate
        
        int average = 90;
        int Absences = 4;
        
        if((average >= 75) && (Absences <=3) || (average > 90)){
            System.out.println("PASS, Keep up the good work!");
        }else if((average >= 90) && (Absences > 3) || (average == 75)) {
            System.out.println("PASS, Need Improvements, Make sure to attend classes");
        }else if((average < 75) && (Absences > 3)) {
            System.out.println("FAILED, retake the subject");
        }
            
        
        //--------------Advanced
        
        double Balance = 5000, Interest = 0.4, AVGDiposit = 1000;
        
        Balance += 500;
        System.out.println("\n\nCurrent Balance: " + Balance);
        
        Balance += AVGDiposit;
        System.out.println("Current Balance: " + Balance);
        
        Balance *= Interest;
        System.out.println("Interest Rate: " + Balance);
        
        int Num = 37;
        
        System.out.println(Num++);
        System.out.println("Result1: " + Num);
        
        int Num2 = 37;
        
        System.out.println(++Num2);
        System.out.println("Result2: " + Num2);
        
        /**
         Num++ uses the old value before incrementing now if we switch it at the front
         like ++Num2 the Java reads it to increment first instantly then display the result
         **/
        
        
        //----------------Expert
        
        // At first I really don't know but it is true 
        int x = -5, y = 3;
        boolean result = x + 2 / 4 + 3 * 3 != y++ * 42;
       
        
        System.out.println("\n\nResult1: " + result);
        
        // my answer here is false
        int a = 1000, b = 1989;
        boolean ans = a++ < 50 && 32 * b > 72 + 3;
        
        System.out.println("Result2: " + ans);
        
        
        // Predicted outcome false
        int cash = 24242;
        boolean sagot = 11241 * 123432 * cash >= 237831236 && cash * 312378231 - cash++ % 2 > 24232;
        
        System.out.println("Result3: " + sagot);
        
        //The third expression is wrong
        /**
         because even though i put random numbers,i thought the first statement of logical and
         * is smaller than 237831236
         
         **/
        
      
    }
    
}
