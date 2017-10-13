public class SlembiProfun {
    
        // Skilar N-staka fylki me� slembiheilt�lum � bilinu [0, k-1]
        public static int[] slembiFylki(int N, int k) {
    
            int[] a = new int[N];
            
            for (int i = 0; i < N; i++) {
                a[i] = (int) (Math.random() * k);
            }

            return a;
        }
    
        public static void main(String[] args) {
    
            int[] rnd = slembiFylki(20, 50);
    
            for (int i=0; i<rnd.length; i++)
                System.out.print(rnd[i] + " ");
            System.out.println();
        } 
    } 