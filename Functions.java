import java.util.*;

public class Functions {
    static int n1=0, n2=1, n3=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.print(n1+" "+n2);
        printFibb(n-2);
    }
    
    public static void printFibb(int n) {
        if(n>0){
            n3= n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibb(n-1);
        }

    }
}