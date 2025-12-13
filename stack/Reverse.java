import java.util.*;
class Reverse{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s=new Stack<>();
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            s.push(a[i]);
        }
        // for(int i=0;i<n;i++)
        while(!s.empty())
            System.out.print(s.pop()+" ");
    }
}