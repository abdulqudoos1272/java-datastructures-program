import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Program19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q1=new LinkedList<Integer>();
        System.out.println("How much number you want to Enqueue in Queue");
        int n=sc.nextInt();
        int data;
        for(int i=1;i<=n;i++){
            System.out.println("Enter Integer ");
            data=sc.nextInt();
            q1.add(data);
        }
        if(q1.isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Queue is "+q1);
            System.out.println("Top of Queue is : "+q1.peek());
            System.out.println("Dequeue From Queue : "+q1.remove());
            System.out.println("Queue is "+q1);
        }        
    }
}
