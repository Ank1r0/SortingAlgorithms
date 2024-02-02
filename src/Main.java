import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.SelectionSort;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int[] array = {12,11,13,5,6};


        //BubbleSort.sort(array)
        //InsertionSort.findCloseTo(array,3);
        //InsertionSort.sort(array);
        SelectionSort.sort(array);

        for (int temp: array) {
            System.out.println(temp);
        }
    }
}