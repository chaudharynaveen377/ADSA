import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LCM {
    static int lcm(int a,int b){
        int ans=1;
        for (int i=2;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                ans=ans+i;
                a=a/i;
                b=b/i;
            };
        }
        ans=ans*a*b;
        return ans;
    }
    static boolean coprime(int x){
        for (int i=2;i<x;i++){
            return x%i==0;
        }
        return false;
    }
    static void logic(int arr[]){
        List<Integer>lt=new ArrayList<>();
        int i=0;
        int j=1;
       while (i<arr.length && j<arr.length){
                if (arr[i]!=-1 && arr[j]!=-1 && coprime(i) && coprime(j)){
                    arr[i]=lcm(arr[i],arr[j]);
                    arr[j]=-1;
                    j=i+1;
                }
                if (j>=arr.length){
                    i=i+1;
                    j=i+1;
                }
                j++;
       }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int a=6;
        int b=4;
        System.out.println(lcm(3,4));
        int arr[]={6,4,3,2,7,6,2};
logic(arr);
    }
}
