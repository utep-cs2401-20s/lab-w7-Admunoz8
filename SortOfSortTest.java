import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SortOfSortTest {
    @Test
    public void TestSort1(){
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
        int[] arrExpected = new int[] {6, 5, 2, 1, 3, 4, 7, 8};
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
    @Test
    public void TestSort2(){
        int[] arr = new int[] {9,9,9,9,9,9,9,9,9,9,9,9,9};
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
        int[] arrExpected = new int[] {9,9,9,9,9,9,9,9,9,9,9,9,9};
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
    @Test
    public void TestSort3(){
        int[] arr = new int[] {0};
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
        int[] arrExpected = new int[] {0};
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

}