import java.util.*;//o(n^2)
class Threesum{
    public static void main(String[] arga){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int target=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int f=0;
    for(int i=0;i<n;i++){
        int l=i+1,r=n-1;
        while(l<r){
            int sum=a[i]+a[l]+a[r];
            if(sum==target){
                System.out.print("found:"+a[i]+" "+a[l]+" "+a[r]);
                f=9;
                break;
            }
            else if(sum<target){
                r--;
            }
            else{
                l++;
            }
        }
    }
    if(f==0){
        System.out.print("NOT FOUND");
    }
    }
}