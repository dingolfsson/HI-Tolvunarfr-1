public class VixlaPorum {
    public static void main(String[] args) {

        int N = args.length;

        String[] A = new String[N];

        for (int i = 0; i < a.length; i++) {
            A[i] = args[i];
        }

        String tmp = "";

        for (int i = 0; i < args.length - 1; i += 2) {
            tmp = args[i];
            args[i] = args[i + 1];
            args[i + 1] = tmp;
        }
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}
