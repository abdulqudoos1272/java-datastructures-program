import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
class Pair implements Comparable<Pair>{
    public int node,weight;
    public Pair(int n,int w){
        this.node=n;
        this.weight=w;
    }
    @Override
    public int compareTo(Pair p){
        return this.weight-p.weight;
    }
};
class Und_Edge{
    public int src,des,weight;
    Und_Edge(int s,int d,int w){
        this.src=s;
        this.des=d;
        this.weight=w;
    }
};
class Und_Graph{
    private HashMap <Integer,Integer> map=new HashMap<>();
    private ArrayList<Und_Edge> arr[];
    private int Vertices;
    private int setvalue[];
    public Und_Graph(int vert){
        Vertices=vert;
        arr=new ArrayList[vert];
        setvalue=new int[vert];
        for(int i=0;i<vert;i++){
            arr[i]=new ArrayList<>();
        }
    }
    public void addEdge(int s,int d[],int w[],int i){
        for(int k=0;k<d.length;k++){
        arr[i].add(new Und_Edge(s, d[k],w[k]));
        }
        map.put(i,s);
    }
    public void MST(){
        int MST_cost=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        boolean visited[]=new boolean[Vertices];
        pq.add(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair current=pq.poll();
            if(visited[current.node]==false){
                visited[current.node]=true;
                MST_cost+=current.weight;
                for(int i=0;i<arr[current.node].size();i++){
                    int a=arr[current.node].get(i).des;
                    int b=getIndex(a);
                    if(visited[b]==false){
                        pq.add(new Pair(b,arr[current.node].get(i).weight));
                    }
                }
            }
        }
        System.out.println("MST is : "+MST_cost);
    }
    private int getIndex(int val){
        for(int i:map.keySet()){
            if(map.get(i)==val){
                return i;
            }
        }
        return -1;
    }
};
public class Program33 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n,s,des_num;
            int []destination;
            int []weight;
            System.out.println("How Much Vertices You want to add in Graph ");
            n=sc.nextInt();
            Und_Graph g=new Und_Graph(n);
            for(int i=0;i<n;i++){
                System.out.println("Enter "+(i+1)+" Source in Integer Form");
                s=sc.nextInt();
                System.out.println("How Much Destination You want to add from Source "+s);
                des_num=sc.nextInt();
                destination=new int[des_num];
                weight=new int[des_num];
                for(int j=0;j<des_num;j++){
                    System.out.println("Enter "+(j+1)+" Destination");
                    destination[j]=sc.nextInt();
                    System.out.println("Enter "+(j+1)+" Destination Weight");
                    weight[j]=sc.nextInt();
                }
                g.addEdge(s, destination, weight,i);
            }
            g.MST();
    }
};