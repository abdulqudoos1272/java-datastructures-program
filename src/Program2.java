import java.util.*;
public class Program2 {
    public static void main(String[] args){
        List<Integer> A=new ArrayList<>();
        A.add(23);A.add(34);A.add(21);A.add(67);A.add(23);A.add(89); //Add integer at last
        A.add(0,67); //add integer at index that we enter
        A.addFirst(12); //Add integer at first
        A.addLast(31); //Add integer at Last
        System.out.println("Our ArrayList is : "+A);
        System.out.println("Length of ArrayList is : "+A.size());
        System.out.println("Get element at index 3 is : "+A.get(3));
        A.set(0,90);
        System.out.println("Replace element 12 with 90 : "+A);
        A.remove(2);//Remove element at index 2
        System.out.println("After deleting remaining element : "+A);
        Collections.sort(A);
        System.out.println("After Sorting Elements are : "+A);
    }
};
