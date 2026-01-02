import java.util.*;
class Treesland{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=5; //sc.nextInt();
        int[][] a=new int[n][n];
        int t=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                // if(a[i][j]==1)
                // t++;
            }
        }
        // System.out.print(t);
        // int c=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(a[i][j]==0){
        //         c++;
        //         break;
        //         }
        //     }
        // }
        // System.out.print(t-c);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                left(i-1,j,matrix);
                right(i,j+1,matrix);
                bottom(i+1,j,matrix);
                top(i,j-1,matrix);
            }
        }
        
    }
    static void 
}