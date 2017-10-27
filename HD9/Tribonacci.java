import java.util.Scanner;

public class Tribonacci {
    public static int triboRec(int n) {
        if (n == 1) 
            return 0;
        else if (n == 2) 
            return 0;
        else if (n == 3) 
            return 1;
        else return (triboRec(n-1)+triboRec(n-2)+triboRec(n-3));
    }

    public static int tribo(int n) {
        int a = 0,b = 0,c = 1;
        int d = a+b+c;
        System.out.print(a + " " + b + " " + c + " ");
        for(int i=5; i <= n; i++) {
            System.out.print(d + " ");
            a = b;
            b = c;
            c = d;
            d = a + b + c;
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Sladu inn tolu: ");
        int n = reader.nextInt();
        // Recusrive
        for (int i = 1; i <= n; i++) {
            System.out.print(triboRec(i) + " ");
        }
        System.out.println("");
        // Non Recursive
        System.out.println(tribo(7));
    }
}