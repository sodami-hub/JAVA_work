package ch06_sorting._01_bubble_sort;

public class BubbleSortV03 {

    static void bubbleSortV03(int[] arr, int n) {
        int k=0;
        int count = 0;
        while(k<n-1) {
            int last = n-1;
            System.out.println("패스 :" +(count+1));
            for(int j = n-1 ; j>k; j--) {
                if(arr[j]<arr[j-1]) {
                    swap(arr, j, j-1);
                    last = j;
                }
            }
            k=last;
            count++;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
