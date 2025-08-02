import java.util.LinkedList;
import java.util.List;
public class Program3 {
    public static void main(String[] args){
        List<Integer> L1=new LinkedList<Integer>();
        int n=10,sum=0;
        for(int i=0;i<=n;i++){
            L1.add(i);
        }
        for(int j=0;j<=n;j++){
            sum+=L1.get(j);
        }
        System.out.println("Sum of ten number is : "+sum);
    }        
};
