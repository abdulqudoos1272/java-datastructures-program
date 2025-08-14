import java.util.Scanner;
class queue{
    private int []arr;
    private int current_size;
    private int maxsize;
    queue(int n){
        this.arr=new int[n];
        this.maxsize=n;
        this.current_size=0;
    }
    public void Enqueue(int data){
        if(this.isFull()){
            System.out.println("Queue is Full");
            return;
        }
        else{
            this.arr[current_size]=data;
            this.current_size++;
        }
    }
    public int Dequeue(){
        if(this.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            int temp=arr[0];
            for(int i=0;i<current_size-1;i++){
                arr[i]=arr[i+1];
            }
            this.current_size--;
            return temp;
        }
    }
    public int Peek(){
        if(isEmpty()){
            System.out.println("Nill");
            return -1;
        }
        else{
            return this.arr[0];
        }
    }
    public void traverse(){
        for(int i=0;i<this.current_size;i++){
            System.out.println(this.arr[i]);
        }
    }
    private boolean isFull(){
        if(this.current_size==this.maxsize){
            return true;
        }
        else{
            return false;
        }
    }
    private boolean isEmpty(){
        if(this.current_size==0){
            return true;
        }
        else{
            return false;
        }
    }
};
public class Program18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Maxsize of Queue");
        int n=sc.nextInt();
        queue s1=new queue(n);
        for(int i=1;i<=n;i++){
            System.out.println("Enter Data for EnQueue");
            int data=sc.nextInt();
            s1.Enqueue(data);
        }
        s1.Enqueue(23);
        System.out.println("Queue is ");
        s1.traverse();
        System.out.print("Peek form Queue ");
        System.out.println(s1.Peek());
        System.out.print("Dequeue form Queue ");
        System.out.println(s1.Dequeue());
        System.out.println("Queue is ");
        s1.traverse();
    }
}
