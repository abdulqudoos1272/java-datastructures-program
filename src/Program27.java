import java.util.*;
public class Program27{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n,data,key;
        HashSet<Integer> hs=new HashSet<Integer>();
        System.out.println("How much Integer you want to add on Hashset");
        n=sc.nextInt();
        System.out.println("Enter Data");
        for(int i=0;i<n;i++){
            data=sc.nextInt();
            hs.add(data);
        }
        System.out.println(hs);
        System.out.println("Size of Hashset is : "+hs.size());
        System.out.println("Enter a number to check key is present or not");
        key=sc.nextInt();
        if(hs.contains(key)){
            System.out.println(key+" is present");
        }
        else{
            System.out.println(key+" is not Present");
        }
        System.out.println("Enter a number to remove from Hashset");
        key=sc.nextInt();
        if(hs.contains(key)){
            System.out.println(hs.remove(key)+" Deleted Sucessfully");
        }
        else{
            System.out.println(key+" is not in Hashset");
        }
        System.out.println("Traverse Hashset through Iterator");
        Iterator it=hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        sc.close();   
    }
}