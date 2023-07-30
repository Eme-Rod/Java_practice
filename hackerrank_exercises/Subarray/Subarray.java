import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {

        /*
        Problem Statement:
        We are given an array of integers, and we need to find and count the number of
        subarrays (contiguous segments) whose elements sum up to a negative value.

        For example:
        Input:  [1, -2, 4, -5, 1]
        Output: 9
        Explanation: There are 9 subarrays with a negative sum:
                     [-2], [-2, 4, -5], [4, -5], [-5], [1, -2, 4, -5],
                     [-2, 4, -5, 1], [4, -5, 1], [-5, 1], [-2, 4, -5, 1].
        */

        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = userInput.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            if (arr[i] < 0) {
                count++;
            }
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
