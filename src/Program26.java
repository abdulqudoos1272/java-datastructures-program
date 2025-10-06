import java.util.*;
import java.util.Queue;
class Binary_Search_Node{
    public int data;
    public Binary_Search_Node left;
    public Binary_Search_Node right;
    Binary_Search_Node(int val){
        this.data=val;
        this.left=null;
        this.right=null;
    }   
};
class Binary_Search_Tree{
    public Binary_Search_Node root;
    public Binary_Search_Tree(){
        this.root=null;
    }
    public void Insert(int data){
        Binary_Search_Node newnode=new Binary_Search_Node(data);
        if(this.root==null){
            this.root=newnode;
            return;
        }
        Binary_Search_Node temp=this.root;
        while(true){
        if(data<temp.data){
            if(temp.left==null){
                temp.left=newnode;
                break;
            }
            else{
                temp=temp.left;
            }
        }
        else{
            if(temp.right==null){
                temp.right=newnode;
                break;
            }
            else{
                temp=temp.right;
            }
        }
        }
    }
    public void Pre_Order_Traversal(Binary_Search_Node r){
        if(r!=null){
            System.out.print(r.data+"   ");
            Pre_Order_Traversal(r.left);
            Pre_Order_Traversal(r.right);
        }
    }
    public void In_Order_Traversal(Binary_Search_Node r){
        if(r!=null){
            In_Order_Traversal(r.left);
            System.out.print(r.data+"   ");
            In_Order_Traversal(r.right);
        }
    }
    public void Post_Order_Traversal(Binary_Search_Node r){
        if(r!=null){
            Post_Order_Traversal(r.left);
            Post_Order_Traversal(r.right);
            System.out.print(r.data+"   ");
        }
    }
    public void Level_Order_Traversal(Binary_Search_Node r){
        Queue<Binary_Search_Node> q1=new LinkedList();
        q1.add(r);
        q1.add(null);
        while(!q1.isEmpty()){
        Binary_Search_Node current=q1.remove();
        if(current==null){
            System.out.println();
            if(q1.isEmpty()){
                break;
            }
            else{
                q1.add(null);
            }
        }
        else{
            System.out.print(current.data+"   ");
            if(current.left!=null){
                q1.add(current.left);
            }
            if(current.right!=null){
                q1.add(current.right);
            }
        }
        }
    }
    public void BST(Binary_Search_Node r,int key){
        if(r==null){
            System.out.println("Absent");
            return;
        }
        if(r.data==key){
            System.out.println("Value "+key+" is present");
            return;
        }
        if(key<r.data){
            BST(r.left,key);
        }
        if(key>r.data){
            BST(r.right,key);
        }
    }
    public int Count_Nodes(Binary_Search_Node r){
        if(r==null){
            return 0;
        }
        int left=Count_Nodes(r.left);
        int right=Count_Nodes(r.right);
        return (left+right+1);
    }
    public int Find_Sum_of_Nodes(Binary_Search_Node r){
        if(r==null){
            return 0;
        }
        int left=Find_Sum_of_Nodes(r.left);
        int right=Find_Sum_of_Nodes(r.right);
        return (left+right+r.data);
    }
    public int Find_Height_of_Tree(Binary_Search_Node r){
        if(r==null){
            return 0;
        }
        int left=Find_Height_of_Tree(r.left);
        int right=Find_Height_of_Tree(r.right);
        int h=Math.max(left,right)+1;
        return h;
    }
    public Binary_Search_Node Delete(Binary_Search_Node r,int value){
        if(r==null){
            System.out.println("Value is not Present");
            return r;
        }
        if(value<r.data){
            r.left=Delete(r.left,value);           
        }
        else if(value>r.data){
            r.right=Delete(r.right,value);           
        }
        else{
            if(r.left==null && r.right==null){
                r=null;
            }
            else if(r.left==null){
                r=r.right;
            }
            else if(r.right==null){
                r=r.left;
            }
            else{
                Binary_Search_Node temp=Find_Max(r.left);
                r.data=temp.data;
                r.left=Delete(r.left,temp.data);
            }
        }
        return r;
    }
    private Binary_Search_Node Find_Max(Binary_Search_Node M){
        Binary_Search_Node N=M;
        while(N.right!=null){
            N=N.right;
        }
        return N;
    }
};
public class Program26{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Binary_Search_Tree bst1=new Binary_Search_Tree();
        int n,data,key; 
        System.out.println("How much node you want to insert ");
        n=sc.nextInt();
        System.out.println("Enter Data");
        for(int i=0;i<n;i++){
            data=sc.nextInt();
            bst1.Insert(data);  
        }
        System.out.println("Pre_Order_Traversal");
        bst1.Pre_Order_Traversal(bst1.root);
        System.out.println();
        System.out.println("In_Order_Traversal");
        bst1.In_Order_Traversal(bst1.root);
        System.out.println();
        System.out.println("Post_Order_Traversal");
        bst1.Post_Order_Traversal(bst1.root);
        System.out.println();
        System.out.println("Level_Order_Traversal");
        bst1.Level_Order_Traversal(bst1.root);
        System.out.println("Enter Key for Serch");
        key=sc.nextInt();
        bst1.BST(bst1.root,key);
        int result1=bst1.Count_Nodes(bst1.root);
        System.out.println("Number of Nodes are : "+result1);
        int result2=bst1.Find_Sum_of_Nodes(bst1.root);
        System.out.println("Sum of Nodes is : "+result2);
        int result3=bst1.Find_Height_of_Tree(bst1.root);
        System.out.println("Height of Tree is : "+result3);
        System.out.println("Enter Value for Deletion");
        int val=sc.nextInt();
        bst1.Delete(bst1.root,val);
        System.out.println("AFter Deleting Node Our Binary Tree is");
        bst1.Pre_Order_Traversal(bst1.root);
   }
};