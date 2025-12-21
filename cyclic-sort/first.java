import java.util.*;
class First{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int l=2;
        int r=3;
        // int i=l+1;
        // while(i<=r){
        //     int ind=a[i]-1;
        //     if(a[i]!=a[ind]){
        //         int t=a[i];
        //         a[i]=a[ind];
        //         a[ind]=t;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // for(i=0;i<n;i++){
        //     if((i+1)!=a[i]){
        //         System.out.print("False");
        //     }
        // }
        // System.out.print("TRUE");
        boolean f=true;
        for(int i=0;i<n;i++){
            if(i<l|| i>r){
                if(a[i]!=i+1){
                    f=false;
                }
            }
        }
        int i=1;
        while(i<=r){
            int ind=a[i]-1;
            if(ind<l || ind>r){
                f=false;
            }
            i++;
        }
        System.out.println(f);
    }

}