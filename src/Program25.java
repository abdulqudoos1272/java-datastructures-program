import java.util.Scanner;
class Binary_Node{
    public int data;
    public Binary_Node left;
    public Binary_Node right;
    public Binary_Node(int val){
        this.data=val;
        this.left=null;
        this.right=null;
    }
};
class Binary_Tree{
    public Binary_Node root;
    public Binary_Tree(){
        this.root=null;
    }
    public void Insert(int data){
        Binary_Node newnode=new Binary_Node(data);
        if(this.root==null){
            root=newnode;
            return;
        }
        Binary_Node temp=this.root;
        while(temp.left!=null && temp.right!=null){
            if(temp.left!=null){
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
        }
        if(temp.left==null){
            temp.left=newnode;
        }
        else{
            temp.right=newnode;
        }
    }
    public void Pre_Order_Traversal(Binary_Node r){
        if(r!=null){
        System.out.print(r.data+"  ");
        Pre_Order_Traversal(r.left);
        Pre_Order_Traversal(r.right);
        }
    }
};
public class Program25{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Binary_Tree bt1=new Binary_Tree();
        int n,data;
        System.out.println("How much node you want to insert ");
        n=sc.nextInt();
        System.out.println("Enter Data");
        for(int i=0;i<n;i++){
            data=sc.nextInt();
            bt1.Insert(data);
        }
        System.out.println("Our Binary Tree is : ");
        bt1.Pre_Order_Traversal(bt1.root);
    }
}