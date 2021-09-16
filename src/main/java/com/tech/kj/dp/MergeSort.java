// Merge sort in Java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

class MergeSort {
static Logger logger = Logger.getLogger("Test");

    public static void main(String[] args) {
        int[] arr = {99,44,6,2,1,5,63,87,4,0};
        int[] result = mergeSort(arr);
        printArray(result);
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length ==1){
            return  arr;
        }
        int middle = arr.length / 2;
        int[] leftArray = Arrays.copyOfRange(arr,0,middle);
        int[] rightArray = Arrays.copyOfRange(arr,middle,arr.length);
        logger.info("leftArray"+ Arrays.toString(leftArray));
        logger.info("rightArray"+ Arrays.toString(rightArray));
        return merge(mergeSort(leftArray),mergeSort(rightArray));
    }

    private static int[] merge(int[] leftArray, int[] rightArray) {
        ArrayList<Integer> result = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;
        while(leftIndex < leftArray.length && rightIndex < rightArray.length){
            if(leftArray[leftIndex] < rightArray[rightIndex]){
                result.add(leftArray[leftIndex]);
                leftIndex++;
            }else {
                result.add(rightArray[rightIndex]);
                rightIndex++;
            }
        }
        for(int i=leftIndex; i<leftArray.length;i++){
            result.add(leftArray[i]);
        }
        for(int i=rightIndex; i<rightArray.length;i++){
            result.add(rightArray[i]);
        }
        int[] array = result.stream().mapToInt(i->i).toArray();
        return array ;
    }


    // Print the array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


}
