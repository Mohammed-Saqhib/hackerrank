/*
  ============================================================================
  Day 1: Hello World (HackerRank)
  ============================================================================

  Part 1: Basic Output
  --------------------
  What this shows:
  - The runtime entry point is the `main` method with signature
    `public static void main(String[] args)`.
  - On HackerRank the class is commonly required to be named `Solution`.
  - Use `System.out.println()` to print a line with a trailing newline.
  - Use `System.out.printf()` when you need formatting; `\n` adds a newline.
  - All statements in Java end with a semicolon (`;`).

  Part 2: Input using Scanner
  ----------------------------
  Key Concepts:
  - `Scanner` is a utility class from java.util for parsing input.
  - `new Scanner(System.in)` creates a Scanner that reads from standard input.
  - `nextInt()` reads the next integer from the input stream.
  - Always close the Scanner after use to free resources (good practice).
  - This example reads 3 integers and prints them back out.
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // ===== PART 1: Simple Output =====
        // Entry point: print two greeting lines to standard output (STDOUT).
        // `printf` here demonstrates an explicit newline escape sequence.
        System.out.printf("Hello, World.\n");

        // `println` prints the string and appends a newline automatically.
        System.out.println("Hello, Java.");

        // ===== PART 2: Input with Scanner =====
        // Create a Scanner object to read from standard input (keyboard).
        Scanner scan = new Scanner(System.in);

        // Read three integers from user input.
        int a = scan.nextInt();  // First integer
        int b = scan.nextInt();  // Second integer
        int c = scan.nextInt();  // Third integer

        // TODO: You can perform operations here (e.g., sum, product, etc.)
        // Example: int sum = a + b + c;
        // Example: int product = a * b * c;

        // Print the three integers back out.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // TODO: Print results of any calculations here if needed.
        // Example: System.out.println("Sum: " + sum);
        // Example: System.out.println("Product: " + product);

        // Close the Scanner to release resources.
        scan.close();
    }
}