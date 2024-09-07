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
        if(n < 3){
            return n;
        }
        int[] results = new int[n+1];
        results[0] = 0;
        results[1] = 1;
        results[2] = 2;
        for(int i = 3; i <= n; i++){
            results[i] = results[i-1] + (2 * results[i-2]) + (3 * results[i-3]);
        }
        return results[n];
    }
}
