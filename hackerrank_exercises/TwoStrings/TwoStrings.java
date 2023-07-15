import java.util.ArrayList;
import java.util.List;

public class TwoStrings {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>(List.of("ab","cd", "ef"));
        List<String> b = new ArrayList<>(List.of("world", "h","ef"));

        commonSubstring(a, b);
    }

    public static void commonSubstring(List<String> a, List<String> b) {
        int len;
        int extraLen = Math.abs(a.size() - b.size());

        len = Math.min(a.size(), b.size());

        for (int i = 0; i < len; i++) {
            boolean isInBoth = false;

            for (int j = 0; j < a.get(i).length(); j++) {
                String chA = a.get(i).charAt(j) + "";

                if (b.get(i).contains(chA)) {
                    isInBoth = true;
                    break;
                }
            }

            if (isInBoth) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        for (int i = 0; i < extraLen; i++) {
            System.out.println("NO");
        }
    }
}
