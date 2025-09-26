import java.util.HashMap;
import java.util.HashSet;

public class LongetSubarray_withoutRepeatingcharacter {
    static int solve(String s){
        if (s.length()<=0){
            return 0;
        }
        int i=0;
        int j=0;
        int size=0;
        HashSet<Character> st=new HashSet<>();
        while (j<s.length()){
            char ch=s.charAt(j);
            if (!st.contains(ch)){
                st.add(ch);
                size=Math.max(size,j-i+1);
                j++;
            }
            else {
                    st.remove(s.charAt(i));
                    i++;

            }

        }
        return size;
    }

    static int usingHashmap(String s){
        if (s.length()==0){
            return 0;
        }
        int i=0;
        int j=0;
        int size=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        while (j<s.length()){
            if (!mp.containsKey(s.charAt(j))){
                mp.put(s.charAt(j),1);
                size=Math.max(size,j-i+1);
                j++;
            }
            else{
                        mp.remove(s.charAt(i));

                    i++;

            }

        }
        return size;
    }
    public static void main(String[] args) {
        String s="aaaab";
        System.out.println(solve(s));
        System.out.println(usingHashmap(s));
    }
}
