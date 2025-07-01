import java.util.*;
public class Main {
    static int find(int[]arr){
        int i=0;
        while(i<arr.length){
            int index=arr[i]-1;
            if(arr[i]>=1&&index<arr.length&&arr[i]!=arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
            else{
                i++;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int c=find(arr);
        System.out.println(c);
    }
}
