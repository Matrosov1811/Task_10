import java.util.Arrays;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        System.out.println("Задайте размерность матрицы по строкам и столбцам через Enter:");
        Scanner s = new Scanner(System.in);
        double[][] array = new double[s.nextInt()][s.nextInt()];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Задайте данные для элемента №" + (j + 1) + " из строки №" + (i + 1) + " массива");
                array[i][j] = s.nextDouble();
            }
        }
        double[] str = new double[array[0].length];
        for (int i = 0; i < array[0].length; i++) {
            str[i] = array[0][i] * 3;
        }
        System.out.println("Вывод первой строки массива умноженной на 3: ");
        System.out.println(Arrays.toString(str));
        System.out.println("Вывод массива: ");
        for (double[] arr : array) {
            System.out.println(Arrays.toString(arr));
        }

    }
}
