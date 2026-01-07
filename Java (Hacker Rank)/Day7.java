// Problem: 30 Days of Code - Day 5: Loops
// Task: Given an integer N, print its first 10 multiples in the format "N x i = result" where i ranges from 1 to 10.
// Each multiple should be printed on a new line.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read the integer N from input
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        // Loop from 1 to 10 to print the multiplication table
        for(int i=1; i<=10; i++) {
            // Print the multiplication in the required format
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        bufferedReader.close();
    }
}
