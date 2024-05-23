package org.example;

public class MergeSortAlgorithm {

    public static void merge(int[] array, int start, int mid, int end) {
        int[] tempArray = new int[end - start + 1];
        int leftIndex = start;
        int rightIndex = mid + 1;
        int tempIndex = 0;

        while (leftIndex <= mid && rightIndex <= end) {
            if (array[leftIndex] <= array[rightIndex]) {
                tempArray[tempIndex++] = array[leftIndex++];
            } else {
                tempArray[tempIndex++] = array[rightIndex++];
            }
        }

        while (leftIndex <= mid) {
            tempArray[tempIndex++] = array[leftIndex++];
        }

        while (rightIndex <= end) {
            tempArray[tempIndex++] = array[rightIndex++];
        }

        for (int i = 0, j = start; i < tempArray.length; i++, j++) {
            array[j] = tempArray[i];
        }
    }

    public static void sort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        sort(array, start, mid);
        sort(array, mid + 1, end);
        merge(array, start, mid, end);
    }

    public static void main(String[] args) {
        int[] array = {4, 10, 1, 5, 8, 2, 6};
        int n = array.length;
        sort(array, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
