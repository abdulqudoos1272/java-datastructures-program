import java.util.*;
class HM_Node<K,V>{
    public K key;
    public V value;
    public HM_Node(K ke,V val){
        this.key=ke;
        this.value=val;
    }
}
class Imp_Man_HashMap<K,V>{
    private int Bucket_Size,Nodes;
    LinkedList<HM_Node<K,V>> Bucket[];
    Imp_Man_HashMap(){
        Bucket_Size=5;
        Nodes=0;
        Bucket=new LinkedList[Bucket_Size];
        for(int i=0;i<Bucket_Size;i++){
            Bucket[i]=new LinkedList();
        }
    }
    private int HashFunction(K key){
        int a=key.hashCode();
        return (Math.abs(a)%Bucket_Size);
    }
    private int search(int Buc_ind,K ky){
        LinkedList<HM_Node<K,V>> Li=Bucket[Buc_ind];
        for(int i=0;i<Li.size();i++){
            if(Li.get(i).key.equals(ky)){
                return i;
            }
        }
        return -1;
    }
    public void put(K key, V value){
        int Bucket_Index=HashFunction(key);
        int Search_Index=search(Bucket_Index,key);
        if(Search_Index==-1){
            Bucket[Bucket_Index].add(new HM_Node(key,value));
            Nodes++;
        }
        if(Search_Index>-1){
            HM_Node n=Bucket[Bucket_Index].get(Search_Index);
            n.value=value;
        }
        double lamda=Nodes/(double) Bucket_Size;
        if(lamda>2.0){
            Rehash();
        }
    }
    public void Delete(K key){
        int Bucket_Index=HashFunction(key);
        int Search_Index=search(Bucket_Index,key);
        if(Search_Index==-1){
            System.out.println("Key not Found for Deletion");
        }
        if(Search_Index>-1){
            HM_Node n=Bucket[Bucket_Index].remove(Search_Index);
            System.out.println("Delete Sucessfully whose vale is : "+n.value);
        }
    }
    public void Size(){
        System.out.println("Number of Nodes are : "+Nodes);
    }
    public void Get(K key){
        int Bucket_Index=HashFunction(key);
        int Search_Index=search(Bucket_Index,key);
        if(Search_Index==-1){
            System.out.println("Key is not Present");
        }
        if(Search_Index>-1){
            HM_Node<K,V> n= Bucket[Bucket_Index].get(Search_Index);
            System.out.println(n.value+" is Present for the Key");
        }
    }
    public void contain(K key){
        if(isEmpty()){
            System.out.println("HashMap is Empty");
        }
        else{
            int Bucket_Index=HashFunction(key);
            int Search_Index=search(Bucket_Index,key);
            if(Search_Index==-1){
                System.out.println("Key is not Present");
            }
            else{
                HM_Node<K,V> n= Bucket[Bucket_Index].get(Search_Index);
                System.out.println("Key is Present whose value is : "+n.value);
            }
        }
    }
    private boolean isEmpty(){
        if(Nodes==0){
            return true;
        }
        else{
            return false;
        }
    }
    private void Rehash(){
        LinkedList<HM_Node<K,V>> Old_Bucket[]=Bucket;
        Bucket_Size=Bucket_Size*2;
        Nodes=0;
        Bucket=new LinkedList[Bucket_Size];
        for(int i=0;i<Bucket.length;i++){
            Bucket[i]=new LinkedList();
        }
        for(int i=0;i<Old_Bucket.length;i++){
            for(int j=0;j<Old_Bucket[i].size();j++){
                put(Old_Bucket[i].get(j).key,Old_Bucket[i].get(j).value);
            }
        }
    } 
    public void traverse(){
        for(int i=0;i<Bucket.length;i++){
            for(int j=0;j<Bucket[i].size();j++){
                System.out.println("Key : "+Bucket[i].get(j).key);
                System.out.println("Value : "+Bucket[i].get(j).value);
                System.out.println();
            }
        }
    }
};
public class Program29{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Imp_Man_HashMap hm=new Imp_Man_HashMap();
        String key,temp;
        int n,value,result;
        System.out.println("How Much Nodes You want to add");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.println("Enter Key as a String");
            key=sc.nextLine();
            System.out.println("Enter Key as a Integer");
            value=sc.nextInt();
            hm.put(key,value);
        }
        hm.traverse();
        hm.Size();
        sc.nextLine();
        System.out.println("Enter key to Get Value");
        temp=sc.nextLine();
        hm.Get(temp);
        System.out.println("Enter key to Check HashMap contain that key or not");
        temp=sc.nextLine();
        hm.contain(temp);
        System.out.println("Enter key to Delete that key");
        temp=sc.nextLine();
        hm.Delete(temp);
        System.out.println("After Deletion our HashMap is ");
        hm.traverse();
    } 
};