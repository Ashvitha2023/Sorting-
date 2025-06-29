import java.util.*;
public class bubblesort {
    static int[] bub(int[]arr){
        boolean swapped=false;
         for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                 if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                 }
            }
            if(swapped==false){
                break;
            }
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
        int []a=bub(arr);
        System.out.print(Arrays.toString(a));
    }
}
