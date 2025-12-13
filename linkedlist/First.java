class Node{
    int data;
    Node next;
    Node (int d){
        this.data=d;
        this.next=null;
    }
}
class First{
    static  Node head=null;
    static void insertatbegin(int v){
        if(head==null){
            head=new  Node(v);
        }
        else{
            Node newnode = new Node(v);
            newnode.next=head;
            head=newnode;
        }
    }
    static void insertatend(int v){
        if(head==null){
            head=new Node(v);
        }
        else{
            Node newnode=new Node(v);
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newnode;
        }
    }
    static void detelebeg(){
        head=head.next;
    }
    static void deleteend(){
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
    }
    static void print(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    public static void main(String[] args){
        int[] a={7,9,7,5,0};
        for(int i=0;i<a.length;i++){
            insertatbegin(a[i]);
        }
        print();
        System.out.println();
        for(int i=0;i<a.length;i++){
            insertatend(a[i]);
        }
        print();
        System.out.println();
        deleteend();
        print();
    }
}