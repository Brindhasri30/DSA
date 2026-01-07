import java.util.*;
class Pq{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        PriorityQueue<int[]> p=new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        p.add(new int[] {0,0});
        p.add(new int[]{1,20});
        p.add(new int[] {2,2});
        while(!p.isEmpty())
        System.out.print(Arrays.toString(p.poll()));
    }
}