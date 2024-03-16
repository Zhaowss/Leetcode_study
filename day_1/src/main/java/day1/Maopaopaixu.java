package day1;


//冒泡排序
// arr={2,5,6,3,4,7,1};
// arr={2,5,3,4,6,1,7};
// arr={2,5,6,3,4,7,1};

public class Maopaopaixu
{


    public static void main(String[] args) {
        int[] arr={2,5,6,3,4,7,1};
        Maopaopaixu1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


    public static void Maopaopaixu1(int[] arr){
//        判断的条件
        if (arr ==null ||  arr.length<2){
            return;
        }
        for (int e=arr.length-1;e>0;e--){
            for (int i = 0; i < e; i++) {
                if (arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }

    public static void swap(int[] arr,int i,int j) {
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
