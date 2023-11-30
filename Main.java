import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] array = fill(new int[7]);
        System.out.println(Arrays.toString(array));

        try {
            isTheIndexThere(array, 8);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            isItPossible(array, 0);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
    }

    public static int[] fill(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1, 22);
        }
        return array;
    }

    public static void isTheIndexThere(int[] array, int index) throws IndexOutOfBoundsException {
        try {
            System.out.println(array[index]);
        } catch (Exception e) {
            throw new IndexOutOfBoundsException("indice insesistente!");
        }
    }

    public static String isItPossible(int[] array, int divisore) throws ArithmeticException {
        try {
            for (int j : array) {
                int result = j / divisore;
                System.out.println(result);
            }
        } catch (ArithmeticException e) {
            throw new ArithmeticException("non si può dividere per zero!");
        }
        return "finito";
    }


}