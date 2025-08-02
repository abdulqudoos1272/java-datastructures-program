import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Program5 {
    public static void Binary_Search(ArrayList<Integer> B,int k,int low,int high){
        int mid=(low+high)/2;
        if(low<=high){
        if(B.get(mid)==k){
            System.out.println(k+" Key is Present");
            return;
        }
        if(B.get(mid)>k){
            Binary_Search(B,k,low,mid-1);
        }
        if(B.get(mid)<k){
            Binary_Search(B,k,mid+1,high);
        }
        }
        else{
            System.out.println("Not Found");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> A=new ArrayList<Integer>();
        A.add(12);A.add(34);A.add(12);A.add(17);A.add(43);A.add(1);A.add(5);
        System.out.println("Our Array List is : "+A);
        Collections.sort(A);
        System.out.println("After Sorting Array List is : "+A);
        System.out.println("Enter key for Search");
        int key=sc.nextInt();
        Binary_Search(A,key,0,(A.size()-1));       
    }    
}
