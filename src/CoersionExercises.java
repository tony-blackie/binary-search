
public class CoersionExercises {
    public static void main(String args[]) {
        System.out.println((1 + 2.236) / 2);
        System.out.println(1 + 2 + 3 + 4.0);
        System.out.println(4.1 >= 4);
        System.out.println(1 + 2 + "3");
        System.out.println("------");

        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = i * i;
            System.out.println(a[i]);
        }
    }
}
