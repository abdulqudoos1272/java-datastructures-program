import java.util.ArrayList;
import java.util.Scanner;
public class Program4 {
    public static float avg(ArrayList<Float> A2){
        float sum=0,averge=0;
        for(int i=0;i<A2.size();i++){
            sum+=A2.get(i);
        }
        averge=sum/7;
        return averge; 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Float> A1=new ArrayList<Float>();
        float data;
        for(int i=0;i<7;i++){
            System.out.println("Enter Temperature of Day : "+(i+1));
            data=sc.nextFloat();
            A1.add(data);
        }
        System.out.println(avg(A1));
    }    
};
