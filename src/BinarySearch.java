import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Integer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearch {
    public static int applySearch (int key, int[] array) {
        int lowerSearchBorder = 0;
        int upperSearchBorder = array.length - 1;

        while (lowerSearchBorder <= upperSearchBorder) {
            int middleElementIndex = lowerSearchBorder + ((upperSearchBorder - lowerSearchBorder) / 2);

            if (key < array[middleElementIndex]) {
                upperSearchBorder = middleElementIndex - 1;
            }

            if (key > array[middleElementIndex]) {
                lowerSearchBorder = middleElementIndex + 1;
            }

            if (array[middleElementIndex] == key) {
                return middleElementIndex;
            }
        }

        return -1;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]) {
        int[] numbers = new int[] {5, 3, 12, 9, 15, 18, 22, 12, 76, 45, 33, 11, 31, 14, 4, 18, 2};

        printArray(numbers);

        Arrays.sort(numbers);

        printArray(numbers);

        int elementToFind = inputElement();

        int elementIndex = applySearch(elementToFind, numbers);

        if (elementIndex == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Index of your element is: " + elementIndex);
        }

    }

    public static int inputElement() {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        int number = 0;
        System.out.println("Please, input the integer element: ");

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                input = bufferedReader.readLine();
                number = Integer.parseInt(input);
            } catch (IOException error) {
                System.out.println(error);
            }

        } catch (NumberFormatException ex) {
            System.out.println("Not a number !");
        }

        return number;
    }
}
