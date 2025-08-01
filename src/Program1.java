import java.util.*;
public class Program1{
    public static void main(String[] args){
        List<Integer> L1=new LinkedList();
        L1.add(23);L1.add(34);L1.add(21);L1.add(67);L1.add(23);L1.add(89); //Add integer at last
        L1.add(0,67); //add integer at index that we enter
        L1.addFirst(12); //Add integer at first
        L1.addLast(31); //Add integer at Last
        System.out.println("Our List is : "+L1);
        System.out.println("Length of List is : "+L1.size());
        System.out.println("Get element at index 3 is : "+L1.get(3));
        L1.set(0,90);
        System.out.println("Replace element 12 with 90 : "+L1);
        L1.remove(2);//Remove element at index 2
        System.out.println("After deleting remaining element : "+L1);
        Collections.sort(L1);
        System.out.println("After Sorting Elements are : "+L1);
    }
};