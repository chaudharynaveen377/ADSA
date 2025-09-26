package Practice;

public class reverseLL {
    static node solve(node a ,node b){
        node x=new node(0);
        return x;
    }
    static class node{
        int data;
        node next;
        node(){}
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        node a=new node(1);
        a.next=new node(2);
        a.next.next=new node(2);

        a.next.next.next=new node(3);
        a.next.next.next.next=new node(4);
        a.next.next.next.next.next=new node(5);
        a.next.next.next.next.next.next=new node(6);

        node b=new node(1);
        b.next=new node(22);
        b.next.next=new node(2);
        b.next.next.next=new node(3);
        b.next.next.next.next=new node(4);
        b.next.next.next.next.next=new node(5);
        b.next.next.next.next.next.next=new node(6);

        System.out.println((double) 4/333);
    }
}
