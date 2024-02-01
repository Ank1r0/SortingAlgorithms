import algorithms.BubbleSort;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int[] array = {35,1,3,5,5,8,1};

        BubbleSort.sort(array);
        for (int temp: array) {
            System.out.println(temp);
        }
    }
}