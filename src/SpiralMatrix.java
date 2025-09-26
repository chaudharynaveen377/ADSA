import java.util.ArrayList;

public class SpiralMatrix {
    static ArrayList<Integer> lt = new ArrayList<>();
    static void spiral(int arr[][]) {

        int left=0;
        int right=arr[0].length;
        int top=0;
        int bottom=arr.length;

        while (left<right && top<bottom) {
            for (int i=left; i<right; i++) {
                lt.add(arr[top][i]);
            }
            top++;
            for (int i=top;i<bottom; i++) {
                lt.add(arr[i][right - 1]);
            }
            right--;
            if (top<bottom) {
                for (int i=right-1;i>=left;i--) {
                    lt.add(arr[bottom-1][i]);
                }
                bottom--;
            }
            if (left<right){
                for (int i=bottom-1; i>= top; i--) {
                    lt.add(arr[i][left]);
                }
                left++;
            }
        }

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        spiral(arr);
        System.out.println(lt);


    }
}
