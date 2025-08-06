import java.util.Scanner;
class Node{
    protected int data;
    protected Node next;
    protected Node pre;
    Node(int data){
        this.data=data;
        this.next=null;
        this.pre=null;
    }
};
class Doubly_Linked_List{
    Node Head=null;
    public void Add_First(int data){
        Node newNode=new Node(data);
        if(this.Head==null){
            Head=newNode;
        }
        else{
            newNode.next=Head;
            Head.pre=newNode;
            Head=newNode;
        }
    }
    public void Add_last(int data){
        Node newNode=new Node(data);
        if(this.Head==null){
            Head=newNode;
        }
        else{
            Node p=Head;
            while (p.next!=null){
                p=p.next; 
            }
            p.next=newNode;
            newNode.pre=p;
        }
    }
    public void Add_Between(int data,int i){
        Node newNode=new Node(data);
        if(this.Head==null){
            Head=newNode;
        }
        else{
            int j=2;
            Node p=Head;
            while (j<i){
                p=p.next;
                j++; 
            }
            newNode.pre=p;
            newNode.next=p.next;
            p.next=newNode;
            p=newNode.next;
            p.pre=newNode;
        }
    }
    public int Start_Delete(){
        if(this.Head==null){
            System.out.println("Empty");
            return -1;
        }
        else if(Head.next==null && Head.pre==null){
            int temp=Head.data;
            Head=null;
            return temp;
        }
        else{
            int temp=Head.data;
            Head=Head.next;
            Head.pre=null;
            return temp;
        }
    }
    public int End_Delete(){
        if(this.Head==null){
            System.out.println("Empty");
            return -1;
        }
        else if(Head.next==Head){
            int temp=Head.data;
            Head=null;
            return temp;
        }
        else{
            Node p=Head;
            Node q=Head.next;
            while (q.next!=null){
                p=p.next;
                q=q.next;
            }
            q.pre=null;
            p.next=null;
            return q.data;
        }
    }
    public int Between_Delete(int i){
        if(Head==null){
            System.out.println("Empty");
            return -1;
        }
        if(i==1){
            return Start_Delete();
        }
        else{
            Node p=Head;
            Node q=Head.next;
            int j=2;
            while(j<i){
                p=p.next;
                q=q.next;
                j++;
            }
            q.pre=null;
            q=q.next;
            p.next=q;
            q.pre=p;
            return q.data;
        }
    }
    public void Traverse(){
        Node p=Head;
        while (p!=null) {
            System.out.print(p.data+"  ");
            p=p.next;
        }
        System.out.println();
    }
    };
public class Program8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Doubly_Linked_List l1=new Doubly_Linked_List();
        int data;
        for(int i=1;i<=3;i++){
            System.out.println("Enter element insert at start : ");
            data=sc.nextInt();
            l1.Add_First(data);
        }
        for(int i=1;i<=3;i++){
            System.out.println("Enter element insert at end : ");
            data=sc.nextInt();
            l1.Add_last(data);
        }
            System.out.println("Enter element insert at index 2 : ");
            data=sc.nextInt();
            l1.Add_Between(data,2);
            System.out.println("List is : ");l1.Traverse();
            l1.Start_Delete();
            System.out.println("After Deleting start node : ");
            l1.Traverse();
            l1.End_Delete();
            System.out.println("After Deleting Last node : ");
            l1.Traverse();
            l1.Between_Delete(2);
            System.out.println("After Deleting Index 2 node : ");
            l1.Traverse();
    }
}
