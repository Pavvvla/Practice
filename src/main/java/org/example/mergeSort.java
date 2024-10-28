package org.example;

import java.util.ArrayList;

public class mergeSort {
    public static void main(String [] args){
        int[] arr ={10,22,9,5,15,11,19};
        mergeSort2(arr);

        for (int i = 0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
    public static  void mergeSort2(int[] arr){

        int n = arr.length;
        if (n==1) return;

        int mid = n/2;
        int[] m =  new  int[mid];
        int[] r = new int[n-mid];

        for (int i=0;i<mid;i++)
            m[i] = arr[i];

        for (int i=mid;i<n;i++)
            r[i-mid] = arr[i];

        mergeSort2(m);
        mergeSort2(r);
        merge(arr,m,r);
    }
    public static void merge(int[] arr,int[] m,int[]r){

int left = m.length;
int right = r.length;
int i = 0;
int j = 0;
int idx =0;

while (i<left && j<right){
    if (m[i]<r[j]) {
            arr[idx] = m[i];
            i++;
            idx++;
    } else{
        arr[idx] = r[j];
        j++;
        idx++;
    }
}

for (int ll = i; ll< left;ll++)
    arr[idx++] = m[ll];

for (int rr = j; rr< right; rr++)
    arr[idx++] = r[rr];
    }
}
