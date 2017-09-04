
package in.pavithra.practice;

import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int
             arr_i = 0; arr_i < 5; arr_i++) {

            arr[arr_i] = in.nextInt();
        }

        for (int indexToSkip = 0; indexToSkip < arr.length; indexToSkip++) {
            int sum = sumOf(arr, indexToSkip);
            if (sum < min) min = sum;
            if (sum > max) max = sum;
        }

        System.out.println(min + "  " + max);

    }

    private static int sumOf(int[] arr, int indexToSkip) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == indexToSkip) continue;
            sum += arr[i];
        }
        return sum;
    }
}
