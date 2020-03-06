import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortOfSortTest {
    @Test
    public void tester1() {
        int[] inputArray = {0};
        int[] expectedOutput = {0};

        SortOfSort testOne = new SortOfSort();
        testOne.sortOfSort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            assertEquals(expectedOutput[i], inputArray[i]);
        }

    }
    @Test
    public void tester2() {
        int[] inputArray = {3,4,5,6,2,1};
        int[] expectedOutput = {4,3,1,2,5,6 };

        SortOfSort testOne = new SortOfSort();
        testOne.sortOfSort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            assertEquals(expectedOutput[i], inputArray[i]);
        }


    }
    @Test
    public void tester3() {
        int[] inputArray = {-2,-3,-3,-4,-5,-6,13,45,-4};
        int[] expectedOutput = {-2,-3,-4,-5,-6,-4,-3,13,45 };

        SortOfSort testOne = new SortOfSort();
        testOne.sortOfSort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            assertEquals(expectedOutput[i], inputArray[i]);
        }

    }
    @Test
    public void tester4() {
        int[] inputArray = {99,100,200,400,500,900,1000};
        int[] expectedOutput = {500,400,99,100,200,900,1000 };

        SortOfSort testOne = new SortOfSort();
        testOne.sortOfSort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            assertEquals(expectedOutput[i], inputArray[i]);
        }

    }
    @Test
    public void tester5() {
        int[] inputArray = {1,1,1,1,1,1,1,1,1,1};
        int[] expectedOutput = {1,1,1,1,1,1,1,1,1,1};

        SortOfSort testOne = new SortOfSort();
        testOne.sortOfSort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            assertEquals(expectedOutput[i], inputArray[i]);
        }

    }

}
