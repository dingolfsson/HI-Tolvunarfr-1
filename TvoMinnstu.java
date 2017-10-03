public class TvoMinnstu {
    public static void main(String[] args) {
        double firstMin = 20;
        double secondMin = 20;

        double[] a = new double[Integer.parseInt(args[0])];

        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random() * 40 - 20;
            if (a[i] < firstMin) { secondMin = firstMin; firstMin = a[i]; }
            if (firstMin < a[i] && a[i] < secondMin) {secondMin = a[i]; }
        }

        System.out.println(firstMin);
        System.out.println(secondMin);
        
    }
    public static void hello() {
        System.out.println("");
    }
}

