import java.util.ArrayList;
import java.util.Scanner;
class Directed_Edge{
    public int source;
    public int destination;
    public int weight;
    public Directed_Edge(int s,int d,int w){
        this.source=s;
        this.destination=d;
        this.weight=w;
    }
};
class Directed_Graph{
    private int vertices;
    private ArrayList<Directed_Edge> arr[];
    Directed_Graph(int v){
        this.vertices=v;
        arr=new ArrayList[v];
        for(int i=0;i<v;i++){
            arr[i]=new ArrayList<>();
        }
    }
    public void Insert_Edge(int sou,int des[],int wei[],int i){
        for(int j=0;j<des.length;j++){
        arr[i].add(new Directed_Edge(sou, des[j],wei[j]));
        }
    }
    public void TA(){
        for(int i=0;i<vertices;i++){
            System.out.print("Vertex "+i+" is connected to : ");
            for(Directed_Edge edge:arr[i]){
                System.out.print(" -> "+edge.destination+" (Weight : "+edge.weight+")");
            }
            System.out.println();
        }
    }  
    public void Traverse(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].size();j++){
                 System.out.println("Source "+arr[i].get(j).source+" Destination "+arr[i].get(j).destination+" Weight "+arr[i].get(j).weight);
            }
        }
    } 
};
public class Program31 {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        int n,sou,num;
        int des[],wei[];
        System.out.println("How Much vertices You Want In Your Directed Graph ?");
        n=sc.nextInt();
        Directed_Graph dg=new Directed_Graph(n);
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" Vertex Source");
            sou=sc.nextInt();
            System.out.println("How much destination you want to add for source "+sou);
            num=sc.nextInt();
            des=new int[num];
            wei=new int[num];
            for(int j=0;j<num;j++){
                System.out.println("Enter "+(j+1)+" Destination");
                des[j]=sc.nextInt();
                System.out.println("Enter Weight for Edge "+sou+" to "+des[j]);
                wei[j]=sc.nextInt();
        }
        dg.Insert_Edge(sou, des, wei,i);
    }
    dg.Traverse();
        sc.close();
    }
}