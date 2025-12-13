import java.util.*;
class Minxorofallpair{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a={6,5,1,3,4,3,2};
        Arrays.sort(a);
        int m=Integer.MAX_VALUE;
        for(int i=0;i<a.length-1;i++){
            int x=a[i]^a[i+1];
            m=Math.min(m,x);
        }
            System.out.print(m);
    }
}