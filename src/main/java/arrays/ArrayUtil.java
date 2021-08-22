package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayUtil {
    /**
     * Дан массив целых чисел. Заполнить данный массив с клавиатуры. Scanner подать как аргумент метода
     */

    public static void fill(Scanner scanner, int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
    }


    /**
     * Дан массив целых чисел. Заполнить данный массив числами в диапазоне от a до b
     * Для генерации случайного числа в диапазоне от a до b реализовать отдельный метод getRandomNumber
     */
    public static void fillRandom(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = getRandomNumber(1,9);
        }
    }
    public static int getRandomNumber(int a, int b){
        int rnd = a + (int) (Math.random() * b);     // не понял алгоритм с гугла. Почему именно такая формула?
        return rnd;
    }


    /**
     * Дан массив целых чисел. Преобразовать данный массив в строковое значение в формате JSON
     */
    public static void toString(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = getRandomNumber(1,9);
        }
        String arrayString = Arrays.toString(array); // не преобразует в JSON - так я не умею. Но формат вывода подходит: [5, 7, 9, 4, 9, 8, 5, 6]
        /*GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        System.out.println(arrayString);*/
    }


    /**
     * Дан массив целых чисел. Выведите все элементы массива с четными индексами. В
     * программе запрещено использовать условную инструкцию для проверки четности индексов.
     *
     * Решение оформить 2 способами:
     * -возвращать строковое представление массива в формате JSON
     * -используя ArrayList для накопления элементов, удовлетворяющих условию задачи
     */

    public static StringBuilder evenIndexes(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = getRandomNumber(1,9);
        }
        String str = Arrays.toString(array);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < array.length; i++){
            if (i % 2 == 0){
                stringBuilder.append(array[i]);
            }
        }
        /*System.out.println(str);            // [8, 4, 2, 4, 4, 4, 8, 8, 1, 4]
        System.out.println(stringBuilder);*/  // 82481 - не формат JSON
        return stringBuilder;

//      надо создать массив - какой длины? array.length/2+1 - не подходит

    }

    public static List<Integer> evenIndexesList(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = getRandomNumber(1,9);
        }
        String str = Arrays.toString(array);
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < array.length; i++){
            if (i % 2 == 0){
                arrayList.add(array[i]);
            }
        }
        /*System.out.println(str);            // [5, 8, 1, 6, 4, 4, 1, 7, 7, 8]
        System.out.println(arrayList);*/      // [5, 1, 4, 1, 7]
        return arrayList;
    }

    /**
     * Дан массив целых чисел. Выведите все четные элементы массива.
     * Для проверки четности элемента массива реализовать отдельный метод isEven, который будет проверять, является ли переданный ей элемент четным.
     *
     * Решение оформить 2 способами:
     * -возвращать строковое представление массива в формате JSON
     * -используя ArrayList для накопления элементов, удовлетворяющих условию задачи
     */


//    public static List<Integer> evenDataList(int[] array){
//        for (int i = 0; i < array.length; i++){
//            array[i] = getRandomNumber(1,9);
//        }
//    }
//
//    // как реализовать костыль в виде лишнего метода?
//    public static boolean isEvenb(int[] array){
//        for (int i = 0; i < array.length; i++){
//            if (array[i] % 2 == 0){
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }

    /**
     * Дан массив целых чисел. Определить количество положительных элементов в данном массиве.
     */

    public static int countPositive(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = getRandomNumber(-1,9);
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0){
                count++;
            }
        }
        return count;
    }

    /**
     * Дан массив целых чисел. Выведите все элементы массива, которые больше предыдущего элемента.
     *
     * Решение оформить 2 способами:
     * -возвращать строковое представление массива в формате JSON
     * -используя ArrayList для накопления элементов, удовлетворяющих условию задачи
     */
//    public static ArrayList<Integer> greatPrevList(int[] array){
//        for (int i = 0; i < array.length; i++){
//            array[i] = getRandomNumber(1,9);
//        }
//
//    }

    /**
     * Дан массив целых чисел. Если в нем есть два соседних элемента одного знака, выведите
     * эти числа. Если соседних элементов одного знака нет - не выводите ничего. Если таких
     * пар соседей несколько - выведите первую пару.
     *
     * Указание:
     * -В этой задаче нужно реализовать алгоритм линейного поиска: найти такую первую пару
     * элементов, удовлетворяющую заданному условию. Алгоритм линейного поиска реализовать при помощи цикла while.
     */
    // как через while?
    public static void sameNeighbours(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = getRandomNumber(-1,9);
        }
        for (int i = 0; i < array.length; i++){
            while(array[i] > 0){

            }
        }
    }

    /**
     * Дан массив целых чисел. Определите, сколько в этом массиве элементов, которые больше
     * двух своих соседей и выведите количество таких элементов.
     */

    public static int greaterNeighbours(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = getRandomNumber(1,9);
        }
        int count = 0;
        for (int i = 1; i < array.length-1; i++){
            if (array[i-1] < array[i] && array[i] > array[i+1]){
                count++;
            }
        }
        return count;
    }

    /**
     * Дан массив целых чисел. Выведите значение наибольшего элемента в массиве
     */

    public static int max(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = getRandomNumber(1,9);
        }
        int maximum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > maximum){
                maximum = array[i];
            }
        }
        return maximum;
    }

}
