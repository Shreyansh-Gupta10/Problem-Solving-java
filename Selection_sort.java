package SORTING;

public class Selection_sort {
    static void SelectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minIdx=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={64,25,12,22,11};
        SelectionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
