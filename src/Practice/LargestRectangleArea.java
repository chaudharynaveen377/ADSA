package Practice;

public class LargestRectangleArea {
static int area(int arr[],int i){
    int sum=0;
    int max=0;

for (int k=i;k>=0;k--){
    int temp=arr[k];
    for (int j=i;j>=0;j--){
        if (arr[j]>=temp){
            sum=sum+temp;

        }
        else{

            break;
        }
    }
    max=Math.max(max,sum);
    sum=0;
}

    return max;
}
    public static void main(String[] args) {
        int arr[]={2,4};
        int max=0;;

        for(int i=0;i<arr.length;i++){
                max=Math.max(max,area(arr,i));

        }
        System.out.println(max);
    }
}
