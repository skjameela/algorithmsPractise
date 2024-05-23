package org.example;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int arr[],int key)
    {
        int low=0,high=arr.length-1,mid=0;
        while(low<=high)
        {
             mid=(low+high)/2;
             if(key==arr[mid])
             {
                 return mid;
             }
             else if(key<arr[mid])
             {
                 high=mid-1;

             }
             else {
                 low=mid+1;
             }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int arr[]={10,5,3,9,1,4};
        int key= 9;
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,key));

    }
}
