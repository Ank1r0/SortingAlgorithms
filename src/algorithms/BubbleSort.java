package algorithms;

public class BubbleSort<T> {
    public static int[] sort(int[] array)
    {
        if(array.length == 0)
        {
            return null;
        }

        for (int j = 0; j < array.length-1; j++)
        for (int i = 0,k = 0; i < array.length-1-j; i++) {
            if(array[i] > array[i+1])
            {
                k = array[i+1];
                array[i+1] = array[i];
                array[i] = k;
            }


        }
        return array;
    }

}
