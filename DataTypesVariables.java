package com.mycompany.ipt.assignment.vergara;


public class DataTypesVariables {
    public static void main(String[] args) {
        
        // ---------------Beginner
        
        int age = 19;
        double height = 1.73;
        char initial = 'G';
        boolean Sstatus = true;
        
        String name = "Gian Patrick S. Vergara";
        
        
        System.out.println(" Hi Iam " + name + "\n age:  " + age + "\n Height:  " + height + "\n Initial:  " + initial + "\n Student Status:  " + Sstatus);
        
        // ------------Intermediate
        
        
        int Quantity = 5;
        double unitprice = 17.25, TotalCost;
        String storename = "Amazon";
        
        TotalCost = Quantity * unitprice;
        
        System.out.println(" \n\nStorename: " + storename + "\nQuantity:  " +  Quantity + "\nUnitprice: " + unitprice+ "\nTotal:  " + TotalCost);
        
        /**
         TotalCost cannot be an int because unit price includes
         centavos which is a double or float, when you multiply it
         the decimal also included in the computation and you will see the 
         exact value of it when printed
         **/   
        
        // -----------------Advanced
        
        
        double cm = 173;
        float meters = (float)cm/100;
        
        int Meter = 173;
        double Meters = Meter; // Java automatically detects the convertion becasue double covers the range of int 
        
        double centimeters = 200.23;
        int CentiM = (int) centimeters; // the two decimal was removed which is .23 while the java compiles it into integer
        
        System.out.print("\n\nMeters: " + meters);
        System.out.print("\nMeter: " + Meters);
        System.out.print("\nCentimeters: " + CentiM);
        
        
        // ------------------Expert
        
        
        short num = 32767;
        num++;
        
        System.out.println("\n\nshort: "+num + "\n");
        
        
        String World1 = new String("World");
        String World2 = new String("World");
        String World3 = "World";
        
        
        System.out.println("\n" + (World1 == World1));
        System.out.println(World1.equals(World1));
        System.out.println(World1 == World2);
        System.out.println(World1 == World3);
        System.out.println(World1.equals(World2));
        System.out.println(World1.equals(World3));
        System.out.println(World2 == World3);
        System.out.println(World2.equals(World3));
        
        
        /**
         Apparently double equal operator not just compare two numbers but also a word
         using the "==" operator compares the 2 variable if they are the same object
         that is why when World1==World1 true while World1==World2 is false.
         **/
        
        
        String List[] = {"Apple","Banana","Coconut"};
        String List2[] = List;
        
        List2[0] = "Apricot";
        
        System.out.println("\n\n" + List[0]);
        System.out.println(List2[0]);
       
    }
}
