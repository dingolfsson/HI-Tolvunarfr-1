public class Skipta {
        public static int[] skipta(int[] n) {
            int[] a = new int[n.length*2];
            for (int i = 0, j = 0; i < a.length; i+=2) {
                if (n[j] % 2 == 0) {
                    a[i] = n[j] / 2;
                    a[i+1] = n[j] / 2;
                } else {
                    a[i] = n[j] / 2;
                    a[i+1] = (n[j] / 2) + 1;
                }
                j++;
            }
            return a;
        }
    
        public static void main(String[] args) {
            int[] a = {10, 7, 11};
            int[] b = skipta(a);
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
        } 
    } 