import java.util.ArrayList;
import java.util.List;

public class ReduceTheArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4));
        System.out.println(minimizeCost(arr));
    }

    public static int minimizeCost(List<Integer> arr) {
        List<Integer> arr_aux = new ArrayList<Integer>(arr);
        int totalCost = 0;

        if (arr.size() > 1) {
            while (arr_aux.size() > 1) {
                int minFirstValue = arr_aux.get(0);

                for (int i = 0; i < arr_aux.size(); i++) {
                    if (arr_aux.get(i) < minFirstValue) {
                        minFirstValue = arr_aux.get(i);
                    }
                }
                arr_aux.remove(Integer.valueOf(minFirstValue));

                int minSecondValue = arr_aux.get(0);

                for (int i = 0; i < arr_aux.size(); i++) {
                    if (arr_aux.get(i) < minSecondValue) {
                        minSecondValue = arr_aux.get(i);
                    }
                }

                arr_aux.remove(Integer.valueOf(minSecondValue));
                arr_aux.add(minFirstValue + minSecondValue);
                totalCost += minFirstValue + minSecondValue;
            }
        }

        return totalCost;
    }
}
