//bestcase : o(1)  worstcase : o(log n)
/*
total : n
1. n/2
2. n/2/2 => n/2^2
3. n/2^3
4. n/2^4 ..... continue didviding the array into half till only single element is left (worst case scenario).
lets say kth iteration only 1 element is left 
k. n/2^k
n/2^k =1
n=2^k
log2(n)=log2(2^k) ..... (taking log2 both sides)
log2(n)=klog2(2) ......(power of log become product)
log2(n)=k .......(log2(2)=1)
thus, worst case time complexity is o(log n)
*/
import java.util.*;     
class Binarysearch{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int l=0,r=n-1,m,x=0;
        while(l<=r){
            m=(r+l)/2;
            if(a[m]==t){
                System.out.println(m);
                x=9;
                break;
            }
            else if(a[m]>t){
                r=m-1;
            }
            else{
                l=m+1;
            }

        }
        if(x==0){
            System.out.println("not found");
        }
    }
}