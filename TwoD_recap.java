import java.util.*;
/**
 * TwoD_recap**/
class TwoD_recap {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][3];
        // set
        arr[2][1]=10;
        // get
        System.out.println(arr[2][1]);
        System.out.println(arr[1][1]);
        // row count
        System.out.println(arr.length);
        // col count 
        System.out.println(arr[0].length);
        // traversal 
        for(int i=0;i<4;++i){
            for(int j=0;j<3;++j){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
     sc.close();
    }
}