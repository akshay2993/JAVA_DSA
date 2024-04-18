public class ResizeArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,6,9};
        ResizeArray rA = new ResizeArray();

        rA.printArr(arr);
        System.out.println(arr.length);

        arr = rA.resize(arr, arr.length*2);
        rA.printArr(arr);
        System.out.println(arr.length);
    }
    
    public int[] resize(int[] arr, int size) {
        int[] temp = new int[size];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
