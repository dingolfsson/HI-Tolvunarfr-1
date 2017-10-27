public class Fibonacci {
    public static int triboRec(int n) {
        if (n == 1) 
            return 0;
        else if (n == 2) 
            return 0;
        else if (n == 3) 
            return 1;
        else return (triboRec(n-1)+triboRec(n-2)+triboRec(n-3));
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            System.out.print(triboRec(i) + " ");
        }
        System.out.println("");
    }
}