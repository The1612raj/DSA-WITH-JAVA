import java.util.*;
public class Max_of_an_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[5];
        int max=0;
        // input to array
        System.out.println("Enter element to array");
        for(int i=0;i<5;++i){
        arr[i]=sc.nextInt();

        }
        // implementation of max of an array 
        for(int i=0;i<5;++i){
            if(arr[i]>max)
            max=arr[i];

        }
        System.out.println("maximum of array is "+max);
        sc.close();

    }
}
