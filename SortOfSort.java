
public class SortOfSort {
    public static int[] sortOfSort(int[] arr) {
        int index = 0;
        int switcher = 0;
        int start = 0;
        int end = arr.length-1;
        int temp;

     //iterating
      for (int i=0;i < arr.length-1;i++){
          index = i;
          int max = Integer.MIN_VALUE;

            //Find largest
            for (int k = start; k <= end; k++)
                if (arr[k] >= max) {
                    //biggest number
                    max = arr[k];
                    //biggest number
                    index = k;
                }
            //If statement to  add elements to end
            if (switcher < 2) {

                // Swapping the largest to the end
                temp = arr[index];
                arr[index] = arr[end];
                arr[end] = temp;
                switcher++;
                end = end - 1;
            }
            else {
                // Swapping the largest with the first element for the next 2 times
                 temp = arr[index];
                arr[index] = arr[start];
                arr[start] = temp;
                start = start + 1;
                switcher++;
            }

            if (switcher == 4) {
                switcher = 0;
            }

        }
        return arr;
    }

    // Prints the array
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }
}
