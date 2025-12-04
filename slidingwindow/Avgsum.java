import java.util.*;
class Avgsum{
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int[] a=new int[n];
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
       }
       int sum=0;
       for(int i=0;i<k;i++){
        sum+=a[i];
       }
       double m=sum;
       for(int i=1;i<n-k+1;i++){
        sum=sum+a[i+k-1]-a[i-1];
        if(m<sum){
            m=sum;
        }
       }
       System.out.print(m/k);
    }
}