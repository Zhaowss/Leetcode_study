package day1;


import com.sun.org.apache.bcel.internal.generic.SWAP;

//选择排序
public class SelectionSort {


    public static void main(String[] args) {
     int[] arr={2,5,6,3,4,7,1};
     selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void selectionSort(int[] arr){
//        判断的条件
        if (arr ==null ||  arr.length<2){
            return;
        }
        for (int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for (int j=i+1;j<arr.length;j++){
                minIndex=arr[j]<arr[minIndex] ? j:minIndex;
            }
            swap(arr,i,minIndex);
        }
    }

    public static void swap(int[] arr,int i,int j) {
     int temp= arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
    }

}
