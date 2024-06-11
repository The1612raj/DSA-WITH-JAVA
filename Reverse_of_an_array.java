
import java.util.*;
public class Reverse_of_an_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        //Input to array
        System.out.println("enter array element");
        for(int i=0;i<5;++i){
            arr[i]=sc.nextInt();

        }
        //Implementation of array is
        
        for(int i=0,j=4;i<j;++i,--j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        }

         //output of array
         System.out.println("reverse of an array is ");
         for(int i=0;i<5;++i){
            System.out.print(arr[i]+" ");

        }
        sc.close();

    }
}
