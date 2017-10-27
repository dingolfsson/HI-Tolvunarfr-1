import java.util.Scanner;

public class Hw9p2 {
    public static int stafaSumma(int n) {
        if (n == 0) 
            return 0;
        return (n % 10 + stafaSumma(n / 10));
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Sladu inn tolu: ");
        int n = reader.nextInt();
        System.out.println(stafaSumma(n));
        
    }
}