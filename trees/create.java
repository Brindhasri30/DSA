import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
   Node (int data){
    this.data=data;
    this.left=null;
    this.right=null;
   }
}
class Create{

    public static void main(String[] args){
        Node root=new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
         root.left.left=new Node(4);
         root.left.right=new Node(5);
         root.right.left=new Node(6);
         root.right.right=new Node(7);
        dfs_inorder(root);
        bfs_levelorder(root);
    }
       public static void dfs_inorder(Node root){
        if(root==null) return ;
    dfs_inorder(root.left);
    System.out.print(root.data);
    dfs_inorder(root.right);

}
public static  void dfs_preorder(Node root){
    if(root==null) return ;
    System.out.print(root.data);
    dfs_preorder(root.left);
    dfs_preorder(root.right);

}
public static void dfs(Node root){
    if(root==null) return ;
    dfs(root.left);
    dfs(root.right);
    System.out.print(root.data);

}
public static void bfs_levelorder(Node root){
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    Node x;
    while(!q.isEmpty()){
        x=q.poll();
        System.out.print(x.data+" ");
        if(x.left!=null)
            q.add(x.left);
        if(x.right!=null)
            q.add(x.right);
    }
}
}