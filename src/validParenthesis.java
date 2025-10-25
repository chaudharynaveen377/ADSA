public class validParenthesis {
    static boolean solve(String s){
        while (s.contains("{}") || s.contains("[]")|| s.contains("()")){
            s=s.replace("{}","");
            s=s.replace("[]","");
            s=s.replace("()","");
        }
        return s.isEmpty();
    }

    static boolean usingSatck(String s){

        for (char ch:s.toCharArray()) {
            if (ch=='[' || ch=='{' || ch=='('){

            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s="{}[]{]";
    }
}
