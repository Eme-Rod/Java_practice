import java.util.Scanner;

public class CircularAnagram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstStr = input.nextLine();
        String secondStr = input.nextLine();

        System.out.println(isCircularAnagram(firstStr, secondStr));
    }

    public static boolean isCircularAnagram(String firstStr, String secondStr) {
        boolean circularAnagram = false;
        String noCaseFirst = firstStr.toUpperCase();
        String noCaseSecond = secondStr.toUpperCase();

        // Checks:
        // Both strings same length
        // Amount of each char is the same for both strings
        // both words spell the same, no matter from which character you start (cat, tca, atc -> spells cat)

        if ((noCaseFirst.length() == noCaseSecond.length()) && (sameAmountOfChars(noCaseFirst, noCaseSecond))) {
            for (int j = 0; j < noCaseSecond.length(); j++) {
                if (noCaseFirst.charAt(0) == noCaseSecond.charAt(j)) {
                    circularAnagram = true;
                    int count = 1;

                    while (circularAnagram && (count != noCaseFirst.length())) {
                        if (j + count >= noCaseSecond.length()) {
                            int locSecondChr = Math.abs(noCaseSecond.length() - count - j);
                            circularAnagram = noCaseFirst.charAt(count) == noCaseSecond.charAt(locSecondChr);
                        } else {
                            circularAnagram = noCaseFirst.charAt(count) == noCaseSecond.charAt(j + count);
                        }
                        count++;
                    }

                    if (circularAnagram) {
                        break;
                    }
                }
            }
        }

        return circularAnagram;
    }

    public static boolean sameAmountOfChars(String firstStr, String secondStr) {
        boolean sameQuantity = true;

        for (int i = 0; i < firstStr.length(); i++) {
            int charY = 0;
            int charJ = 0;

            for (int y = 0; y < firstStr.length(); y++) {
                if (firstStr.charAt(i) == firstStr.charAt(y)) {
                    charY++;
                }
            }

            for (int j = 0; j < secondStr.length(); j++) {
                if (firstStr.charAt(i) == secondStr.charAt(j)) {
                    charJ++;
                }
            }

            if (charY != charJ) {
                sameQuantity = false;
                break;
            }
        }

        return sameQuantity;
    }
}