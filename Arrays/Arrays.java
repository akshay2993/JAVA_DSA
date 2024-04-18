import java.util.*;

public class Arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int n = sc.nextInt();
        System.out.println("Enter columns:");
        int m = sc.nextInt();


        int[][] numArr = new int[n][m];

        System.out.println("Enter numbers data:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numArr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(numArr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}