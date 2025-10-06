import java.util.*;
public class Program28{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("A",234);hm.put("B",536);hm.put("C",421);hm.put("D",678);hm.put("E",425);hm.put("F",776);
        System.out.println(hm);
        System.out.println("Size of HashMap is : "+hm.size());
        System.out.println("Value at key D is : "+hm.get("D"));
        System.out.println("Key E remove from HashMap whoose value is : "+hm.remove("E"));
        if(hm.containsKey("A")){
            System.out.println("Key A is present whoose value is : "+hm.get("A"));
        }
        else{
            System.out.println("Key A is Not Present");
        }
        System.out.println("Iterate Manually");
        for(Map.Entry<String,Integer> h:hm.entrySet()){
            System.out.println("Key : "+h.getKey()+" Value : "+h.getValue());
        }        
    }
};