import java.util.Scanner;

import javafx.scene.shape.Ellipse;

public class Hw9p3 {
    public static double recPow(double x, double n) {
        n = Math.floor(n);
        if (n < 2) 
            return x;
        if (n % 2 == 0) {
            return (recPow(x, n/2) * recPow(x, n/2));
        }
        else
            return (recPow(x, ((n-1)/2)) * recPow(x, n-1)/2) * x;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Base: ");
        int n = reader.nextInt();
        System.out.print("Expo: ");
        int x = reader.nextInt();

        System.out.println(recPow(x, n));
    }
}