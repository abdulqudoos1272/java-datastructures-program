import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Stack{
    int maxsize;
    List<Integer> l1=new ArrayList<>();
    Stack(int n){
        this.maxsize=n;
    }
    public void Push(int data){
        if(this.isFull()){
            System.out.println("Stack is Full");
            return;
        }
        else{
            l1.addFirst(data);
        }
    }
    private boolean isFull(){
        if(l1.size()>=maxsize){
            return true;
        }
        else{
            return false;
        }
    }
    public int Pop(){
        if(this.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return l1.removeFirst();
        }
    }
    public int Peek(){
        if(isEmpty()){
            System.out.println("Nill");
            return -1;
        }
        else{
            return l1.get(0);
        }
    }
    public void traverse(){
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
    private boolean isEmpty(){
        if(l1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
};
public class Program13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Maxsize of Stack");
        int n=sc.nextInt();
        Stack s1=new Stack(n);
        for(int i=1;i<=n;i++){
            System.out.println("Enter Data for Push");
            int data=sc.nextInt();
            s1.Push(data);
        }
        s1.Push(23);
        s1.Push(26);
        System.out.println("Stack is ");
        s1.traverse();
        System.out.print("Peek form stack ");
        System.out.println(s1.Peek());
        System.out.print("Pop form stack ");
        System.out.println(s1.Pop());
        System.out.println("Stack is ");
        s1.traverse();
    }
}
