// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        // TODO: Implement the recursive function
        if(n >= 3){
            return fRecursive(n-1) + (2 * fRecursive(n-2)) + (3 * fRecursive(n-3));
        }
        return n;
    }

    public static int fIterative(int n) {
        // TODO: Implement the iterative function
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else if (n == 2){
            return 2;
        }
        int a = 0;
        int b = 1;
        int c = 2;
        for(int i = 3; i <= n; i++){
            int temp = a + (2 * b) + (3 * c);
            a = b;
            b = c;
            c = temp;
        }
        return c;
    }
}
