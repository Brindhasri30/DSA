import java.util.*;
class Tosum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int l=a[0],r=n-1,f=0;
        while(l<r){
            int sum=a[l]+a[r];
            if(sum==t){
                System.out.println(a[l]+" "+a[r]);
                f=1;
                break;
            }
            else if(sum>t){
                r--;
            }
            else{
                l++;
            }
        }
        if(f==0){
            System.out.print("not found");
        }
    }
}