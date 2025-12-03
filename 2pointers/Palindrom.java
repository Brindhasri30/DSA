import java.util.*;
class Palindrom{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int l=0,r=n-1;
        while(l<r){
            if(a[l]==a[r]){
                l++;
                r++;
            }
            else{
                System.out.print("NOT");
                break;
            }
        }
        System.out.print("pal");
    }
}