import java.util.HashMap;

public class PLaylist_problem_codeForces {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2,7,4,2};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for (int val:arr){
            if (!mp.containsKey(val)){
                mp.put(val,1);
            }

        }
        System.out.println(mp.size());
    }
}
