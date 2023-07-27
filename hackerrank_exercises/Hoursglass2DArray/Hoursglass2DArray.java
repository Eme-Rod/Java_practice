import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;



public class Hoursglass2DArray {
    public static void main(String[] args) throws IOException {

        // Problem: Hourglass Sum
        // Description: Given a 6x6 2D array, find the hourglass with the maximum sum.
        // An hourglass in the array is a portion shaped like:
        // a b c
        //   d
        // e f g
        // The sum of an hourglass is the sum of all the numbers within it.
        // This program calculates and prints the largest sum among all the hourglasses in the array.

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int total = Integer.MIN_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (((i + 2) < 6) && ((j + 2) < 6)) {
                    int rowOne = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
                    int rowTwo = arr.get(i+1).get(j+1);
                    int rowThree = arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                    int hourglass = rowOne + rowTwo + rowThree;

                    if (hourglass > total) {
                        total = hourglass;
                    }
                }
            }
        }

        System.out.println(total);
    }
}
