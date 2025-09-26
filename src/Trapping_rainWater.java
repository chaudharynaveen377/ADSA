public class Trapping_rainWater {
    static int solve(int arr[]){

        int leftMax=0;
        int rightMax=0;
        int max=0;
        int water=0;

        int leftMaxArray[]=new int [arr.length];
        int rightMaxArray[]=new int [arr.length];
        for (int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            leftMaxArray[i]=max;
        }
        max=0;
        for (int i=arr.length-1;i>=0;i--){
            max=Math.max(max,arr[i]);
            rightMaxArray[i]=max;
        }

        for (int i=1;i<arr.length-1;i++){
            if(arr[i]<Math.min(leftMaxArray[i-1],rightMaxArray[i+1])){
          water=water+Math.min(leftMaxArray[i-1],rightMaxArray[i+1])-arr[i];}
        }
return water;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(solve(arr));

double x=1;
double x1=3;
        System.out.println(x/x1);
    }
}
