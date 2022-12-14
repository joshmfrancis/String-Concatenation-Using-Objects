/*
 * File: MyString.java
 * Author: Joshua Francis
 * Concentration: SD
 * Date: 09/09/2022
 * Java class description: This class is the supporting class for the Main.java 
 * file. This class is the backbone for this project. It holds 5 Methods, 3 that
 * are overloaded, and 2 that are not (concat & toString). These methods support
 * the Main.java file by holding the methods with the loops, accepting parameters
 * and manipulating those parameters to concatenate them together for some 
 * designated output.
 */

public class MyString {

    // Variables for Overloaded Method #1 
    int count = 0;

    // Variables for Overloaded Method #2 
    String string = "";

    // Variables for Overloaded Method #3 
    String s1 = "";
    String s2 = "";
    String s3 = "";
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    int times = 0;
    String string1 = "";
    String string2 = "";
    String string3 = "";

    //Variables for Most Overloaded Methods 
    String finalString = "";
    String beforeFinalString = "";

    // Overloaded Method #1 (2 Circumstances) 
    public void multiConcat(String string, int count) {
        if (count >= 2) {
            // for loop to get the string multiplied by the count if the count >= 2 
            for (int h = 0; h < count; h++) {
                finalString += string;
            }
        } // gets the original string if the count < 2 
        else {
            finalString = string;
        }
    }

    // Overloaded Method #2 
    public void multiConcat(String string) {
        for (int i = 0; i < 2; i++) {
            finalString += string;
        }
    }

    // Overloaded Method #3 
    public void multiConcat(String s1, String s2, String s3, int n1, int n2, int n3) {
        // o1 (In Lab Example)
        for (int j = 0; j < n1; j++) {
            string1 = string1 + s1;
        }
        // o2 (In Lab Example)
        for (int k = 0; k < n2; k++) {
            string2 = string2 + s2;
        }
        // o3 (In Lab Example)
        for (int l = 0; l < n3; l++) {
            string3 = string3 + s3;
        }
        // o4 (In Lab Example)
        beforeFinalString = string1 + string2 + string3;
    }

    // concat method for use in the 4th and 5th Output Example 
    // Made because Overloaded method #1 has same type parameters, but for a different outcome 
    public void concat(String beforeFinalString, int times) {
        // o5 (In Lab Example)
        for (int m = 0; m < times; m++) {
            finalString = finalString + beforeFinalString;
        }
    }

    // toString Method to get the value printed instead of the memory loacation 
    public String toString() {
        String print = (finalString);
        return print;
    }
}
