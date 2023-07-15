import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstStr = input.nextLine();
        String secondStr = input.nextLine();

        System.out.println(isAnagram(firstStr, secondStr));
    }

    public static boolean isAnagram(String firstStr, String secondStr) {
        boolean anagram = false;
        String noCaseFirst = firstStr.toUpperCase();
        String noCaseSecond = secondStr.toUpperCase();

        if ((noCaseFirst.length() == noCaseSecond.length())) {
            anagram = true;
            for (int i = 0; i < noCaseFirst.length(); i++) {
                int charY = 0;
                int charJ = 0;

                for (int y = 0; y < noCaseFirst.length(); y++) {
                    if (noCaseFirst.charAt(i) == noCaseFirst.charAt(y)) {
                        charY++;
                    }
                }

                for (int j = 0; j < noCaseSecond.length(); j++) {
                    if (noCaseFirst.charAt(i) == noCaseSecond.charAt(j)) {
                        charJ++;
                    }
                }

                if (charY != charJ) {
                    anagram = false;
                    break;
                }
            }
        }

        return anagram;
    }
}
