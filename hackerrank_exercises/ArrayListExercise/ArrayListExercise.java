import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {

    public static void main(String[] args) {

        /*
        Problem Description:
        You are given n lines, where each line contains zero or more integers. You need to
        answer a few queries where you have to tell the number located in the yth position
        of the xth line.
        */

        Scanner UsrInp = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        int amountRows = UsrInp.nextInt();

        for (int i = 0; i < amountRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            int amountCol = UsrInp.nextInt();

            for (int j = 0; j < amountCol; j++) {
                int num = UsrInp.nextInt();
                row.add(num);
            }

            matrix.add(row);
        }

        int queries = UsrInp.nextInt();
        for (int i = 0; i < queries; i++) {
            int x = UsrInp.nextInt() - 1;
            int y = UsrInp.nextInt() - 1;

            if ((x > amountRows || x < 0) || (y > (matrix.get(x).size() - 1) || y < 0)) {
                System.out.println("ERROR!");
            } else {
                System.out.println(matrix.get(x).get(y));
            }
        }
    }
}
