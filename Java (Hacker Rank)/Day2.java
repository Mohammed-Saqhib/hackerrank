 /*
     * PROBLEM: Weird or Not Weird
     * Determine whether a given integer N is "Weird" or "Not Weird" based on:
     * - If N is odd: print "Weird"
     * - If N is even and 2 <= N <= 5: print "Not Weird"
     * - If N is even and 6 <= N <= 20: print "Weird"
     * - If N is even and N > 20: print "Not Weird"
     */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
            if (N%2!=0){
                System.out.println("Weird");
            }
            else if (N>=2 && N<=5){
                System.out.println("Not Weird");
            }
            else if (N>=6 && N<=20){
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }
            
        
        scanner.close();
    }
}
