/*
 * File: Main.java
 * Author: Joshua Francis
 * Concentration: SD
 * Date: 09/09/2022
 * Java class description: This class holds the main method which is designated 
 * as the driver class for this Lab. This class is responsible for making the 
 * objects, performing operations on the objects, then printing them to the console.
 * This program's goal is to show how to perform loops and string concatenation 
 * This is achieved with 3 overloaded methods and 2 other methods. (In the other
 * file) This class creates 7 MyString objects all for different circumstances 
 * with these methods. 
 */

public class Main {

    public static void main(String[] args) {

        // Concatenated MyString Objects for Printing 
        MyString String1 = new MyString();
        MyString String2 = new MyString();
        MyString String3 = new MyString();
        MyString String4 = new MyString();
        MyString String5 = new MyString();
        MyString String6 = new MyString();
        MyString String7 = new MyString();

        // Shows Overloaded Method #1 for both possible circumstances
        String1.multiConcat("hi", 4);
        String2.multiConcat("hi", 1);
        System.out.println("Overloaded Method #1 Example: (Integer Parameter >= 2) " + String1);
        System.out.println("Overloaded Method #1 Example: (Integer Parameter < 2) " + String2);

        // For Spacing 
        System.out.println();

        // Shows Overloaded Method #2
        String3.multiConcat("test");
        System.out.println("Overloaded Method #2 Example: (No Integer Parameter Given) " + String3);

        // For Spacing 
        System.out.println();

        // Shows Overloaded Method #3
        // With Multiple Loops in One Method 
        String4.multiConcat("a", "b", "c", 2, 3, 4);

        // Shows concat method 
        String5.concat(String4.beforeFinalString, 5);
        System.out.println("Overloaded Method #3 & concat Example: (Option One) " + String5);

        // Shows Alternitive Method For Overloaded Method #1 and concat method
        // Without Multiple Loops In One Method 
        String6.multiConcat("a", 2); // o1
        String6.multiConcat("b", 3); // o2
        String6.multiConcat("c", 4); // o3
        // Adds all concatenated strings together to another string
        String7.concat(String6.finalString, 5); // o4 & o5
        System.out.println("Overloaded Method #1 & concat Example: (Option Two) " + String7);
    }

}
