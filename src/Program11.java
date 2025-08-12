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
    public boolean Palindromic_Check(){
        if(Head==null || Head.next==null) {
            return true;
        }
        else{
            Node middle=Find_middle();
            Node part2=Find_Reverse(middle.next);
            Node part1=Head;
            while (part2!=null) {
                      if(part1.data!=part2.data){
                        return false;
            }
            part1=part1.next;
            part2=part2.next;
        }
        return true;
    }
    }
    public Node Find_Reverse(Node p){
        Node previous=null;
        Node currrent=p;
        while (currrent!=null){
            Node next=currrent.next;
            currrent.next=previous;
            previous=currrent;
            currrent=next;
        }
        return previous;
    }
    public Node Find_middle(){
        Node turtle=Head;
        Node rabbit=Head;
        while (rabbit.next!=null && rabbit.next.next!=null){
            turtle=turtle.next;
            rabbit=rabbit.next.next;
        }
        return turtle;

    }
};
public class Program11 {
    public static void main(String[] args){
        Linked_List l1=new Linked_List();
        l1.Add_First(1);l1.Add_First(2);l1.Add_First(3);l1.Add_First(2);l1.Add_First(1);
        boolean a=l1.Palindromic_Check();
        System.out.println("Is List is Palindromic : "+a);
    }
}