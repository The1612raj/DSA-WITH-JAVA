import java.util.*;

/**
 * Sum of array
 */
public class Sum_of_Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[5];
        // input to first array
        System.out.println("Enter the element of  first array");
        for (int i = 0; i < 5; ++i) {
            arr1[i] = sc.nextInt();

        }
        // input to sercond array
        System.out.println("Enter the element of  second array");
        for (int i = 0; i < 5; ++i) {
            arr2[i] = sc.nextInt();

        }
        // implementation of Sum of an array
         for(int i=0;i<5;++i){
            arr3[i]=arr1[i]+arr2[i];
         }
        // Ths is for output of final array
        System.out.println("element of array are");
        for (int i = 0; i < 5; ++i) {
            System.out.print(arr3[i]+" ");

        }

        sc.close();
    }
}