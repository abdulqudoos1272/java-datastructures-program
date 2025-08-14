import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
class Queue{
    int maxsize;
    List<Integer> l1=new LinkedList<>();
    Queue(int n){
        this.maxsize=n;
    }
    public void En_Queue(int data){
        if(this.isFull()){
            System.out.println("Queue is Full");
            return;
        }
        else{
            l1.addLast(data);
        }
    }
    public int De_Queue(){
        if(this.isEmpty()){
            System.out.println("Queue is Empty");
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
    private boolean isFull(){
        if(l1.size()>=maxsize){
            return true;
        }
        else{
            return false;
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
public class Program17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Maxsize of Queue");
        int n=sc.nextInt();
        Queue s1=new Queue(n);
        for(int i=1;i<=n;i++){
            System.out.println("Enter Data for Enqueue");
            int data=sc.nextInt();
            s1.En_Queue(data);
        }
        s1.En_Queue(23);
        s1.En_Queue(26);
        System.out.println("Queue is ");
        s1.traverse();
        System.out.print("Peek form Queue ");
        System.out.println(s1.Peek());
        System.out.print("Dequeue form Queue ");
        System.out.println(s1.De_Queue());
        System.out.println("Queue is ");
        s1.traverse();
    }
}
