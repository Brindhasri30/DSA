import java.util.*;
class Sortedrow{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=3;
        int m=4;
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i][0]<=target&& target<=a[i][m-1]){
                int si=0;
                int li=m-1;
                while(si<=li){
                    int mid=(si+li)/2;
                    if(a[i][mid]==target){
                        System.out.print("true");
                        return;
                    }
                    else if(a[i][mid]>=target){
                        li=mid-1;
                    }
                    else{
                        si=mid+1;
                    }
                }
            }
        }
        System.out.print("false");
    }

}