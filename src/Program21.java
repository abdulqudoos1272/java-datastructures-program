import java.util.Scanner;
class Circular_Queue{
    int []arr;
    int Maxsize,front,rear;
    public Circular_Queue(int n){
        front=-1;
        rear=-1;
        this.Maxsize=n;
        arr=new int[n];
    }
    public void En_Queue(int data){
        if(this.isFull()){
            System.out.println("Queue is full");
            return;
        }
        else{
            if(this.front==-1 && this.rear==-1){
                this.front++;
                this.rear++;
                arr[rear]=data;
            }
            else{
                this.rear=(this.rear+1)%this.Maxsize;
                arr[this.rear]=data;
            }
        }
    }
    public int De_Queue(){
        if(this.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            else{
                int re=this.arr[this.front];
                if(this.front==this.rear){
                    this.front=-1;
                    this.rear=-1;
                }
                this.front=(front+1)%Maxsize;
                return re;
            }
        }
    }
    public int Peek(){
        if(this.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            return arr[front];
        }
    }
    public void display(){
        if(this.isEmpty()){
            System.out.println("Empty");
            return;
        }
        else{
            int a=this.front;
            do{
                System.out.print(arr[a]+" ");
                a=(a+1)%Maxsize;
            }
            while(a!=((this.rear+1)%this.Maxsize));
        }
        System.out.println();
    }
    public boolean isEmpty(){
        if(this.front==-1 && this.rear==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if((this.rear+1)%Maxsize==this.front){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Program21 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Maxsize of Queue : ");
        int n=sc.nextInt();
        Circular_Queue cq1=new Circular_Queue(n);
        cq1.En_Queue(98);cq1.En_Queue(40);cq1.En_Queue(83);cq1.En_Queue(86);cq1.En_Queue(90);cq1.En_Queue(22);cq1.En_Queue(39);
        System.out.println("Data in Queue is ");
        cq1.display();
        System.out.println("DeQueue from queue : "+cq1.De_Queue());
        System.out.println("DeQueue from queue : "+cq1.De_Queue());
        System.out.println("After Deletion queue is : ");
        cq1.display();
        cq1.En_Queue(99);
        cq1.display();

    }    
}
