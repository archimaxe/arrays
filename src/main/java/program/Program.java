package program;

import arrays.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Заполните массив:");

        ArrayUtil arrayUtil = new ArrayUtil();
//        ArrayUtil.fill(scanner, array);
//        ArrayUtil.fillRandom(array);
//        ArrayUtil.toString(array);
//        ArrayUtil.evenIndexesList(array);
//        ArrayUtil.countPositive(array);
//        System.out.println(ArrayUtil.greaterNeighbours(array));
        System.out.println(ArrayUtil.max(array));

        String str = Arrays.toString(array);
        System.out.println(str);
    }



}
