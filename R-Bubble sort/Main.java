import java.util.*;
public class Main {
    static void sort(int[]arr,int r,int c){
        if(r==0){
            return ;
        }
        if(c<r){
            int temp=arr[c];
            arr[c]=arr[c-1];
            arr[c-1]=temp;
            sort(arr,r,c+1);
        }
        else{
            sort(arr,r-1,1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr,arr.length,1);
        System.out.println(Arrays.toString(arr));
    }
}
