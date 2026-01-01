/*
    Day 1: Hello World (HackerRank)

    What this file shows:
    - The runtime entry point is the `main` method with signature
        `public static void main(String[] args)`.
    - On HackerRank the class is commonly required to be named `Solution`.
    - Use `System.out.println()` to print a line with a trailing newline.
    - Use `System.out.printf()` when you need formatting; `\n` adds a newline.
    - All statements in Java end with a semicolon (`;`).

    Expected output when run:
    Hello, World.
    Hello, Java.
*/

public class Solution {

        public static void main(String[] args) {
                // Entry point: print two greeting lines to standard output (STDOUT).
                // `printf` here demonstrates an explicit newline escape sequence.
                System.out.printf("Hello, World.\n");

                // `println` prints the string and appends a newline automatically.
                System.out.println("Hello, Java.");
        }
}
