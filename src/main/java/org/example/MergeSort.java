package org.example;
public class MergeSort {
    public static void conquer(int[] arr, int si, int mid, int ei) {
        int merge[] = new int[ei - si + 1];
        int left = si;
        int right = mid + 1;
        int x = 0;
        while (left <= mid && right <= ei) {
            if (arr[left] <= arr[right]) {
                merge[x++] = arr[left++];
            } else {
                merge[x++] = arr[right++];
            }
        }
        while (left <= mid) {
            merge[x++] = arr[left++];
        }
        while (right <= ei) {
            merge[x++] = arr[right++];
        }

        for (int i = 0, j = si; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }

     public static void  divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);

    }



    public static void  main(String args[])
    {
        int arr[]={4,10,1,5,8,2,6};
        int n=arr.length;
        divide(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
