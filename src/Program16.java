import java.util.Stack;
class stack{
    private Stack<Integer> s1=new Stack<>();
    public void push(int data){
        s1.push(data);
    }
    public void reverse_of_stack(){
        if(s1.isEmpty()){
            return;
        }
        else{
            int temp=s1.pop();
            reverse_of_stack();
            push_bottom(temp);
        }
    }
    private void push_bottom(int data){
        if(s1.isEmpty()){
            push(data);
            return;
        }
        else{
            int temp=s1.pop();
            push_bottom(data);
            push(temp);
        }
    }
    public void traverse(){
        System.out.println("Stack is : "+s1);
    }
};
public class Program16 {
    public static void main(String[] args){
        stack s1=new stack();
        s1.push(11);s1.push(12);s1.push(13);s1.push(14);s1.push(15);
        s1.traverse();
        s1.reverse_of_stack();
        System.out.println("After Reverse");
        s1.traverse();
    }
}