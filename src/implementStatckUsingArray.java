public class implementStatckUsingArray {
    static int []arr;
static int i=-1;
   static int j=0;
   static class stack {
     public static void size(int n){
            arr=new int[n];
        }
      public   static void add(int x){
            i++;
            arr[i]=x;

        }
        static int pop(){
            if (i<0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[i--];
        }
        static boolean isEmpty(){
            return i==-1;
        }
        static int peek(){
            if (i<0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[i];
        }
        static int size(){
            return i+1;
        }
    }

    public static void main(String[] args) {
//        peek()--> 1st elemet
//        add()-->
        stack.size(10);
        stack.add(3);
        stack.add(31);
        stack.add(13);
        stack.add(30);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
