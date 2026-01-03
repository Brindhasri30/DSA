import java.util.*;
class Listrepresentation{
    static HashMap<Integer,List<Integer>> m;
    public static void main(String[] args){
        m=new HashMap<>();
        int[][] l={{0,1},{1,2},{1,3},{0,4},{1,5},{5,1}};
        for(int i=0;i<l.length;i++){
            int u=l[i][0];
            int v=l[i][1];
            m.putIfAbsent(u,new ArrayList<>());
            m.putIfAbsent(v,new ArrayList<>());
            m.get(u).add(v);
            m.get(v).add(u);
        }
        boolean[] vis=new boolean[6];
        for(int i=0;i<6;i++)
        vis[i]=false;
        System.out.print(m);
        dfs(0,vis);
    }
    static void dfs(int start,boolean[] vis){
        vis[start]=true;
        System.out.println(start);
        for(int i:m.get(start)){
            if(vis[i]==false){
                dfs(i,vis);
            }
        }
    }

}