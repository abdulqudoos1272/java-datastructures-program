import java.util.Scanner;
import java.util.Stack;
class Queue{
    private Stack<Integer> s1=new Stack<>();
    private Stack<Integer> s2=new Stack<>();
    public void En_queue(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public int Peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            return s1.peek();
        }
    }
    public int De_queue(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            return s1.pop();
        }
    }
    public void Traverse(){
        System.out.println(s1);
    }
};
public class Program20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue q=new Queue();
        System.out.println("How much number you want to Enqueue in Queue");
        int n=sc.nextInt();
        int data;
        for(int i=1;i<=n;i++){
            System.out.println("Enter Integer ");
            data=sc.nextInt();
            q.En_queue(data);
        }
        System.out.println("Queue is ");
        q.Traverse();
        System.out.print("Peek form Queue ");
        System.out.println(q.Peek());
        System.out.print("Dequeue form Queue ");
        System.out.println(q.De_queue());
        System.out.println("Queue is ");
        q.Traverse();

    }   
}
