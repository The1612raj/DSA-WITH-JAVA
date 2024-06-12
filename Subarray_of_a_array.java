import java.util.*;
/**
 * subarray_of_an_array
 */
class Subarray_of_a_array {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    //Input to array
    System.err.println("Enter array element");
    for(int i=0;i<5;++i){
        arr[i]=sc.nextInt();
    }
    //Subarray print 
    System.err.println("Subarrays are");
    for(int i=0;i<5;++i){
        for(int j=i;j<5;++j){
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
        
    }
    sc.close();
}
}