import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

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
    public void BFS(){
        boolean visited[]=new boolean[Vertices];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int current=q.poll();
            if(visited[current]==false){
                System.out.println(getValue(current));
                visited[current]=true;
                for(int i=0;i<arr[current].size();i++){
                    int a=arr[current].get(i).des;
                    int b=getIndex(a);
                    if(visited[b]==false){
                        q.add(b);
                    }
                }
            }
        }
    }
    public void DFS(){
        boolean visited[]=new boolean[Vertices];
        Stack<Integer> s=new Stack<>();
        s.push(0);
        while (!s.isEmpty()) {
            int current=s.pop();
            if(visited[current]==false){
                System.out.println(getValue(current));
                visited[current]=true;
                for(int i=0;i<arr[current].size();i++){
                    int a=arr[current].get(i).des;
                    int b=getIndex(a);
                    if(visited[b]==false){
                        s.push(b);
                    }
                }
            }
        }  
    }
    private int getValue(int i){
        return map.get(i);
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
public class Program32 {
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
                System.out.println("Breath First Search");
                g.BFS();
                System.out.println("Depth First Search");
                g.DFS();
    }
};