package Sorting;

class BubbleSort {
public static void main(String[] args) {
    int[] arr = {7,8,3,1,2};
    printArr(arr);

    sort(arr);
    
}

public static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println("");
}

public static void sort (int[] arr){
    for (int i = 0; i < arr.length-1; i++) {
        for (int j = 0; j < arr.length-1-i; j++) {
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    printArr(arr);
}
    
}