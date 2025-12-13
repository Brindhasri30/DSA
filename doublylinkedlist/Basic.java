import java.util.*;
class Basic{
    static Node head=null;
    static Node tail=null;
    static  void insertatbegin(int v){
            if(head==null){
                head=new Node(v);
                tail=head;
            }
            else{
                Node newnode=new Node(v);
                newnode.next=head;
                head.prev=newnode;
                head=newnode;
            }
        }
        static void insertatend(int val){
            if(head==null){
                head=new Node(val);
                tail=head;
            }
            else{
                Node newnode=new Node(val);
                newnode.prev=tail;
                tail.next=newnode;
                tail=newnode;
            }
        }
        static void deteleatbegin(){
            head=head.next;
            head.prev=null;
        }
        static void deleteatend(){
            tail=tail.prev;
            tail.next=null;
        }
        static void printing(){
            Node c=head;
            while(c!=null){
                System.out.print(c.data);
                 c=c.next;
            } 
        }
        static void insertatpos(int pos,int v){
            Node newnode= new Node(v);
            Node c=head;
            for(int i=0;i<pos-1;i++){
                c=c.next;
            }
            newnode.next=c.next;
            c.next.prev=newnode;
            newnode.prev=c;
            c.next=newnode;

        }
        static void deteleval(int val){
            // Node c=head;
            // while(c.data==val){
            //     c.prev.next=c.next;
            //     c.next.prev=c.prev;
            // }
            // c=c.next;
            Node dummy=new Node(0);
            dummy.next=head;
            Node c=dummy;
            while(c.next!=null){
            if(c.next.data==val){
                c.next=c.next.next;
                if(c.next==null){
                    tail=c;
                }
                else{
                    c.next.prev=c;
                }
            }
             else
                c=c.next;
            }
            head=dummy.next;
        }
        static void reversell(){
            Node c=head;
            while(c!=null){
                Node t=c.next;
                c.next=c.prev;
                c.prev=t;
                c=c.prev;
            }
            Node t=head;
            head=tail;
            tail=temp;
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,3,4,5,6};
        for(int i:a){
            insertatbegin(i);
        }
        printing();
        System.out.println();
       deleteatend();
       printing();
       System.out.println();
       insertatpos(2,6);
       printing();
       System.out.println();
       deteleval(6);
        printing();
        System.out.println();
        reversell();
         printing();


    }
}
class Node{
    int data;
    Node prev;
    Node next;
    Node(int val){
        this.data=val;
        this.prev=null;
        this.next=null;
    }
}