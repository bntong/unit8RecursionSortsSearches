import java.util.Arrays;

public class BubbleSort
{  
    public static void bubbleSort(int[] a)
    {
        int swapped = 0;
        int j = 1;
        for (int i = 0; i < a.length; i++)
        {
            if(a[i] > a[j])
            {
                ArrayUtil.swap(a , i+1 , i);
                swapped++;
                j++;
            }
            System.out.println(Arrays.toString(a));
        }
    }   
    
    public static void main(String[] args)
    {
        int[] intArray = ArrayUtil.randomIntArray(5 , 5);
        System.out.println(Arrays.toString(intArray));
        BubbleSort.bubbleSort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
