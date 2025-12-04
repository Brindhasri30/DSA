import java.util.*;
class noofsubarray{
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int t=sc.nextInt();
       int[] a=new int[n];
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();3
       }
       int avg=0,sum=0,c=0;
       for(int i=0;i<k;i++){
        sum+=a[i];
       }
       avg=sum/k;
       if(avg>t){
        c++;
       }
       for(int i=1;i<n-k;i++){
        sum=sum+a[i+k-1]+a[i-1];
        avg=sum/k;
        if(avg>t){
            c++;
        }
       }
       System.out.println(c);
    }
}