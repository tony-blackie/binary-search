import java.util.Arrays;

public class BinarySearch {
    public static int applySearch (int key, int[] array) {
        int middleElementIndex = array[array.length / 2];
        int lowerSearchBorder = 0;
        int upperSearchBorder = array.length - 1;

        while (lowerSearchBorder < upperSearchBorder) {
            if (array[middleElementIndex] == key) {
                return array[middleElementIndex];
            }

            if (key < array[middleElementIndex]) {
                upperSearchBorder = middleElementIndex - 1;
            }

            if (key > array[middleElementIndex]) {
                lowerSearchBorder = middleElementIndex + 1;
            }
        }

        return -1;
    }

    public static void main  (String args[]) {
        System.out.println("It's alive!");
        int[] numbers = new int[] {5, 3, 12, 9, 15, 18, 22, 12, 76, 45, 33, 11, 31, 14, 4, 18, 2};

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

//        Scanner scanner = new Scanner(System.in);
    }
}
