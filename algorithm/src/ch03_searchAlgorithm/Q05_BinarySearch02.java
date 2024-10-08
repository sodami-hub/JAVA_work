package ch03_searchAlgorithm;

import java.util.Arrays;

// 이진 탐색 에서 같은 크기의 값이 나란히 있을 때 가장 앞쪽에 있는 요소를 반환하도록 한다.
public class Q05_BinarySearch02 {

    static int binSearchX(int[] arr, int n, int key) {
        int index = -1;
        int start = 0;
        int end = n-1;


        while(start <= end) {
            int mid = (start + end) /2;

            if(arr[mid] == key ) {
                index = mid;
                break;
            } else if(arr[mid] > key) {
                end = mid-1;
            } else if(arr[mid] < key) {
                start = mid+1;
            }
        }

        while(arr[index-1] == key) {
            index -= 1;
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,7,7,8,8,9,9};
        int n = arr.length;
        int index = binSearchX(arr, n, 7);

        System.out.println(index);

        // Arrays.binarySearch 메서드 사용해보기.
        index = Arrays.binarySearch(arr,6);
        System.out.println(index);
    }
}
