import java.util.Currency;

class Node{
    protected int data;
    protected Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
};
class Linked_List{
    Node Head=null;
    public void Add_First(int data){
        Node newNode=new Node(data);
        if(this.Head==null){
            Head=newNode;
        }
        else{
            newNode.next=Head;
            Head=newNode;
        }
    }
    public void Reverse_of_linked_List(){
        Node previous=Head;
        Node current=Head.next;
        while (current!=null) {
            Node next=current.next;
            current.next=previous;
            previous=current;
            current=next;   
        }
        Head.next=null;
        Head=previous;
    }
    public void Traverse(){
        Node p=Head;
        while (p!=null){
            System.out.print(p.data+"  ");
            p=p.next; 
        }
        System.out.println();
    }
};
public class Program9 {
    public static void main(String[] args){
        Linked_List l1=new Linked_List();
        l1.Add_First(15);l1.Add_First(14);l1.Add_First(13);l1.Add_First(12);l1.Add_First(11);
        System.out.println("Before Reversing our Linked List is");
        l1.Traverse();
        l1.Reverse_of_linked_List();
        System.out.println("After Reversing our Linked List is");
        l1.Traverse();
    }
}