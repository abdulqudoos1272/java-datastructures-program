import java.util.Scanner;

class Sorting_Technique{
    public void Bubble_Sort(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<(arr.length-1);j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public void Selection_Sort(int []arr){
        for(int i=0;i<(arr.length-1);i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public void Insertion_Sort(int []arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public void display(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
};
public class Program22 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Sorting_Technique s1=new Sorting_Technique();
        System.out.println("Enter Maxsize of array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter data at index "+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Sorting Your Array is : ");
        s1.display(arr);
        //s1.Bubble_Sort(arr);
        //s1.Selection_Sort(arr);
        s1.Insertion_Sort(arr);
        System.out.println("After Sorting Your Array is : ");
        s1.display(arr);
    }
}