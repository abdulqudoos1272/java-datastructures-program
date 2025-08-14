import java.util.Scanner;
class stack{
    private int []arr;
    private int current_size;
    private int maxsize;
    stack(int n){
        this.arr=new int[n];
        this.maxsize=n;
        this.current_size=0;
    }
    public void Push(int data){
        if(this.isFull()){
            System.out.println("Stack is Full");
            return;
        }
        else{
            this.arr[current_size]=data;
            this.current_size++;
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
        if(this.arr.length==0){
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
            int temp=arr[this.current_size-1];
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
            return this.arr[current_size-1];
        }
    }
    public void traverse(){
        for(int i=this.current_size-1;i>=0;i--){
            System.out.println(this.arr[i]);
        }
    }
};
public class Program14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Maxsize of Stack");
        int n=sc.nextInt();
        stack s1=new stack(n);
        for(int i=1;i<=n;i++){
            System.out.println("Enter Data for Push");
            int data=sc.nextInt();
            s1.Push(data);
        }
        s1.Push(23);
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
