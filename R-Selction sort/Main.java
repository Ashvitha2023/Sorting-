import java.util.*;
public class Main {
    static void sort(int[]arr,int r,int c,int max){
        if(r==1){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                 sort(arr,r,c+1,c);
            }
            else{
                sort(arr,r,c+1,max); 
            }
        }
        else{
            int temp=arr[r-1];
            arr[r-1]=arr[max];
            arr[max]=temp;
            sort(arr,r-1,0,0);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
