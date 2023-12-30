/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    boolean ispal(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }

    public static void main(String[] args) {
        // Example usage:
        GFG gfg = new GFG();
        
        String testString1 = "radar";
        String testString2 = "hello";

        if (gfg.ispal(testString1)) {
            System.out.println(testString1 + " is a palindrome.");
        } else {
            System.out.println(testString1 + " is not a palindrome.");
        }

        if (gfg.ispal(testString2)) {
            System.out.println(testString2 + " is a palindrome.");
        } else {
            System.out.println(testString2 + " is not a palindrome.");
        }
    }
}
