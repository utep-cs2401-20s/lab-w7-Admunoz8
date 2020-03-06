import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortOfSortTester {

   // I used zero and the most smallest array you can do. I used this test to see if it can handle it.
   // Test Passed

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
    // The test is a simple array of 6 elements.The numbers are basic as well, so this will be my basic test case.
    // Test Passed
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
    // On this test case I used a bunch of negative numbers to see If my code can deal with negative numbers.
    // Test Passed
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
    // I used big numbers to see if the code can deal with it. I also did the size really big as well. The code should be able to deal with all of this.
    //Test passed
    @Test
    public void tester4() {
        int[] inputArray = {99,100,200,400,500,900,1000,12032,343243,24324543,34324,325654,324565432,56534563,3432,443,5555};
        int[] expectedOutput = {24324543,343243,12032,5555,900,500,200,100,99,400,443,1000,3432,34324,325654,56534563,324565432 };

        SortOfSort testOne = new SortOfSort();
        testOne.sortOfSort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            assertEquals(expectedOutput[i], inputArray[i]);
        }

    }
    // The test I used was to see If repeating numbers would affect the code. If properly the code shouldn't have a problem with this.
    //Test passed
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
