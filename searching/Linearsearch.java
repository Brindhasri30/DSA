import java.util.*;   // bestcase =o(1)  worstcase=o(n)
class Linearsearch{
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x=0;
        for(int i=0;i<n;i++){
            if(a[i]==t){
                System.out.println(i);
                x=9;
                break;
            }
        }
        if(x==0)
        System.out.println("element not found");
    }
}