import java.util.*;
class Undiected_Edge{
    public int src,des,weight;
    Undiected_Edge(int s,int d,int w){
        this.src=s;
        this.des=d;
        this.weight=w;
    }
};
class Undiected_Graph{
    private ArrayList<Undiected_Edge> arr[];
    Undiected_Graph(int vert){
        arr=new ArrayList[vert];
        for(int i=0;i<vert;i++){
            arr[i]=new ArrayList<>();
        }
    }
    public void addEdge(int s,int d[],int w[],int i){
        for(int k=0;k<d.length;k++){
        arr[i].add(new Undiected_Edge(s, d[k],w[k]));
        }
    }
    protected void Traverse(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].size();j++){
                System.out.println("Source "+arr[i].get(j).src+" Destination "+arr[i].get(j).des+" Weight "+arr[i].get(j).weight);
            }
        }
    }
};
public class Program30 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n,s,des_num;
            int []destination;
            int []weight;
            System.out.println("How Much Vertices You want to add in Graph ");
            n=sc.nextInt();
            Undiected_Graph g=new Undiected_Graph(n);
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
            g.Traverse();
    }
};