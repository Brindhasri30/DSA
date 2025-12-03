import java.util.*;
class Insertionsort{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;
            int f=0;
            while(j>=0 && key<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
        }
    }
}