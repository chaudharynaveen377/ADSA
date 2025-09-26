import java.util.Arrays;
import java.util.Scanner;

public class CodechefNOREAD {
    static int solve(int arr[]){
       int brr[]=Arrays.copyOf(arr,arr.length);
        Arrays.sort(brr);
        if (Arrays.equals(arr, brr)){
            return -1;
        }
        int median=brr.length%2==0 ? brr[brr.length/2-1] : brr[brr.length/2];
        int i=0,j=arr.length-1;
        while (i<j){
     
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int testCase=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
}
