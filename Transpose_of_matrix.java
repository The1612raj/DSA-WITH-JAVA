import java.util.*;
class Transpose_of_matrix {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr= new int[3][3];
        //input to matrix
        System.out.println("Enter element to the matrix");
        for(int i=0;i<3;++i){
            for(int j=0;j<3;++j){
                arr[i][j]=sc.nextInt();
            }
            
        }
        //actual matrix output
        System.out.println("Actual matrix is ");
        for(int i=0;i<3;++i){
            for(int j=0;j<3;++j){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //implementation of transpose of matrix
        for(int i=0;i<3;++i){
            for(int j=0;j<i;++j){
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
            }
            
        }
        //Transpose of matrix
        System.out.println("Transpose of matrix is ");
        for(int i=0;i<3;++i){
            for(int j=0;j<3;++j){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
     }
}
