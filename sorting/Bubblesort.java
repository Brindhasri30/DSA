import java.util.*;
class Bubblesort{
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] a=new int[n];
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
       }
       for(int i=0;i<n-1;i++){
        int flag=0;
        for(int j=0;j<n-1;j++){  //j<n-1-i
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                flag=9;
            }
        }
       }
       for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
       }
    }
}