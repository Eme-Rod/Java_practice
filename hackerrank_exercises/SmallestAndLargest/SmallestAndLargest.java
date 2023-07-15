import java.util.Scanner;

public class SmallestAndLargest {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "z".repeat(k);
        String largest = "A".repeat(k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int i = 0; i <= s.length() - k; i++) {
            String currentStr = s.substring(i, i + k);

            if (currentStr.compareTo(smallest) < 0) {
                smallest = currentStr;
            }
            if (currentStr.compareTo(largest) > 0) {
                largest = currentStr;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
