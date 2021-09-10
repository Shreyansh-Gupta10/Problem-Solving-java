package SORTING;

public class Bubble_sort {
    static void BubbleSort(int arr[]){
        int temp;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }   
    }
     public static void main(String[] args) {
        int arr[]={2,9,1,4,5,6,3,8,7};
        BubbleSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
     }
}
