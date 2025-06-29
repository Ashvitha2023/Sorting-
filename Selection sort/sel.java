import java.util.*;
public class sel{
    static void swap(int[]arr,int a,int last){
        int temp=arr[a];
        arr[a]=arr[last];
        arr[last]=temp;
    }
    static int max(int[]arr,int start,int end){
        int max=arr[start];
        int c=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
                c=i;
            }
        }
        return c;
    }
    static int[] sort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=max(arr,0,last);
            swap(arr,maxIndex,last);
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int []a=sort(arr);
        System.out.print(Arrays.toString(a));
    }
}