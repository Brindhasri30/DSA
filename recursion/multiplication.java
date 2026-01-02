import java.util.*;
class Multiplication{
    public static void  func(int n,int i){
        if(i==0){
            return;
        }
        func(n,i-1);
        System.out.print(n*i+" ");
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        func(n,10);
    }
}