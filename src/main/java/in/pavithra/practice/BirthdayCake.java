package in.pavithra.practice;

import java.util.Scanner;

public class
BirthdayCake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = Integer.MIN_VALUE;
        int height[] = new int[n];
        int count = 0;
        for (int height_i = 0; height_i < n; height_i++)

        {
            height[height_i] = in.nextInt();
            if ( height[height_i]>max) {
                max = height[height_i];

            }
        }
        for (int height_i = 0; height_i < n; height_i++) {
            if (height[height_i] == max) {
                count++;
            }
        }
        System.out.print(count);
        System.out.print(max);
    }
}

