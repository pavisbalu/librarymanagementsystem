package in.pavithra.practice;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int stars = 0;
        int spaces = 0;

        int n = in.nextInt();
        for (int line = 0; line < n; line++) {
            stars = line + 1;
            spaces = n - stars;
            display(spaces, " ");
            display(stars, "*");
            System.out.println();
        }

    }

    private static void display(int count, String str) {
        for (int i = 0; i < count; i++) {
            System.out.print(str);
        }
    }
}
