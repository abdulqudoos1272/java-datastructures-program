import java.util.Scanner;
import java.util.Stack;
public class Program12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s1=new Stack<>();
        System.out.println("How much number you want to push in Stack");
        int n=sc.nextInt();
        int data;
        for(int i=1;i<=n;i++){
            System.out.println("Enter Integer ");
            data=sc.nextInt();
            s1.push(data);
        }
        if(s1.isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Stack is "+s1);
            System.out.println("Top of Stack is : "+s1.peek());
            System.out.println("Pop From Stack : "+s1.pop());
            System.out.println("Stack is "+s1);
        }
               
    }
}