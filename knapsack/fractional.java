import java.util.*;
class Fractional{
    public static void main(String[] args){
        int n=5;
        double profit=0;
        int W=20;
        int[] w={7,11,3,4,5};
        int[] p={40,60,40,45,70};
        // double[] pr=new double[n];
        // for(int i=0;i<n;i++){
        //     pr[i]=p[i]/w[i];
        // }
        // while(mw<w){
        //     int s=0;
        //     for(int i=0;i<n;i++){
        //         s=Math.max(s,pr[i]);
        //     }

        // }
        Integer[] ind=new Integer[n];
        for(int i=0;i<n;i++){
            ind[i]=i;
        }
        Arrays.sort(ind,(i,j)->{
                                double r1=(double)p[i]/w[i];
                                double r2=(double)p[j]/w[j];
                                return Double.compare(r2, r1);
                                });
        for(int i:ind){
            if(w[i]<W){
                profit+=p[i];
                W-=w[i];
            }
            else{
                profit+=((double)(p[i]*W)/w[i]);
                W=0;
            }
        }     
        System.out.print(profit);
    }
}