package algorithms;

public class SelectionSort {
    public static void sort(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;

            for (int j = i+1; j < array.length; j++) {
                if(array[index] > array[j])
                {
                    index = j;
                }
            }

            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
