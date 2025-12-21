import java.util.*;
class Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int l=0;
        int h=n-1;
        int m=l;
        while(m<=h){
            if(nums[m]<0){
                int t=nums[m];
                nums[m]=nums[l];
                nums[l]=t;
                l++;
            }
            else if(nums[h]<nums[m]){
                int t=nums[m];
                nums[m]=nums[h];
                nums[h]=t;
                h--;
            }
            else{
            m++;
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}