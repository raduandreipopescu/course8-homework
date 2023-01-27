package extraMile;

import java.util.Arrays;

public class Ex3TripletsFromIntArray {
    public static void main(String[] args) {
        Integer[] numbers = {8, 7, 2, 5, 3, 1, 7, 7, 9, 5, 4, 6};
        int target = 15;

        Arrays.sort(numbers);

        // In curs de rezolvare, dar sigur nu reusesc saptamana asta
        // Nu reusesc sa gasesc o metoda care sa evite dublarea perechilor formate din aceleasi numere

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] != numbers[j]) {
                    for (int k = j; k < numbers.length; k++) {
                        if (numbers[k] != numbers[j]) {
                            if (numbers[i] + numbers[j] + numbers[k] == target) {
                                System.out.printf("(%d,%d,%d)", numbers[i], numbers[j], numbers[k]);
                            }
                        }
                    }
                }
            }
        }
    }
}
