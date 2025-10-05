import java.util.Scanner;
class Min_Heap{
    private int []arr;
    private int size,maxsize;
    public Min_Heap(int MS){
        this.arr=new int[MS];
        this.size=-1;
        this.maxsize=MS;
    }
    public void insert(int data){
        if(this.isFull()){
            System.out.println("Heap is Full");
            return;
        }
        else{
            this.size++;
            this.arr[size]=data;
            Heapify_Up(this.size);
        }
    }
    private void Heapify_Up(int i){
        while(i>0 && this.arr[i]<this.arr[parent(i)]){
            swap(i,parent(i));
            i=parent(i);
        }   
    }
    public void Build_Heap(int n,int []array){
        if(n>this.maxsize){
            System.out.println("This array reaches the maxsize");
        }
        else{
            this.size=n-1;
            for(int i=0;i<n;i++){
                arr[i]=array[i];            
            }
            for(int i=(this.size)/2;i>=0;i--){
                Heapify_Down(i); 
            }
        }
    }
    public int delete(){
        if(this.isEmpty()){
            System.out.println("Heap is already empty");
            return -1;
        }
        else if(this.size==0){
            int temp=this.arr[0];
            this.size--;
            return temp;
        }
        else{
            int temp=this.arr[0];
            this.arr[0]=this.arr[size];
            this.size--;
            Heapify_Down(0);
            return temp;
        }
    }
    private void Heapify_Down(int i){
        int left=Left_Child(i),right=Right_Child(i),maxindex=i;
        if(left<=this.size && this.arr[left]<this.arr[maxindex]){
            maxindex=left;
        }
        if(right<=this.size && this.arr[right]<this.arr[maxindex]){
            maxindex=right;
        }
        if(maxindex!=i){
            swap(i,maxindex);
            Heapify_Down(maxindex);
        }        
    }
    private void swap(int i,int j){
        int temp=this.arr[i];
        this.arr[i]=this.arr[j];
        this.arr[j]=temp;
    }
    private int parent(int i){
        return ((i-1)/2);
    }
    private int Left_Child(int i){
        return ((2*i)+1);
    }
    private int Right_Child(int i){
        return ((2*i)+2);
    }
    private boolean isFull(){
        if(this.size==this.maxsize-1){
            return true;
        }
        else{
            return false;
        }
    }
    private boolean isEmpty(){
        if(this.size==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void Display(){
        if(this.isEmpty()){
            System.out.println("Heap is Empty");
            return;
        }
        for(int i=0;i<=this.size;i++){
            System.out.print(this.arr[i]+"  ");
        }
        System.out.println();
    }
};
public class Program24{
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        int n,data;
        System.out.println("Enter Maxsize of Heap");
        n=sc.nextInt();
        Min_Heap h1=new Min_Heap(n);
        /*for(int i=0;i<n;i++){
            data=sc.nextInt();
            h1.insert(data);
        }*/
       int a[]=new int[6];
       a[0]=56;a[1]=34;a[2]=54;a[3]=12;a[4]=34;a[5]=5;
       h1.Build_Heap(6,a);
        System.out.println("Our Max Heap is : ");
        h1.Display();
        h1.delete();
        System.out.println("After Deleting Our Root Heap is : ");
        h1.Display();
    }
};