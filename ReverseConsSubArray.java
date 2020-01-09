//Problem Statement:
//Given array of integers reverse all subarrays with length k


public class ReverseConsSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 5;
        int n = arr.length;
        reverseK(arr, n, k);
        print(arr);
    }

    private static void reverseK(int[] arr, int n, int k) {
        int i = 0;
        while (i < n) {
            reverse(arr, i, Math.min((i + k), n));
            i = Math.min((i + k), n);
        }
    }

    static void reverse(int[] arr, int left, int right) {
        int i = left;
        int j = right - 1;

        while (i <= j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
