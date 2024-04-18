public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1,3,2,8,7,11,6};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        reverse(arr);
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start< end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // int temp;
        // int n = arr.length;

        // for (int i = 0; i < n/2; i++) {
        //     temp = arr[i];
        //     arr[i] = arr[n-i-1];
        //     arr[n-i-1] = temp;
        // }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
