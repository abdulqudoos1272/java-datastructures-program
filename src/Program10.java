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
    public boolean Check_Cycle(){
        if(Head==null){
            return false;
        }
        else{
            Node turtle=Head,rabbit=Head;
            while (rabbit.next!=null && rabbit.next.next!=null){
                turtle=turtle.next;
                rabbit=rabbit.next.next;
                if(turtle==rabbit){
                return true;
            }
            }
            return false;
        }
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
public class Program10 {
    public static void main(String[] args){
        Linked_List l1=new Linked_List();
        l1.Add_First(15);l1.Add_First(14);l1.Add_First(13);l1.Add_First(12);l1.Add_First(11);
        boolean a=l1.Check_Cycle();
        System.out.println("Is List Contain a Cycle : "+a);
    }
}