import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String strInput = input.nextLine();

        if (isStrPalindrome(strInput)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isStrPalindrome(String word) {
        String firstHalf = word.substring(0, (int) Math.round(word.length() / 2.0));
        String secondHalf = word.substring(word.length() - 1);
        boolean palindrome = false;

        for (int i = word.length() - 2; i >= word.length() / 2; i--) {
            secondHalf += word.substring(i, i + 1);
        }

        if (firstHalf.equals(secondHalf)) {
            palindrome = true;
        }

        return palindrome;
    }
}
