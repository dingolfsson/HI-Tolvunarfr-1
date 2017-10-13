public class Thorskar {
    
        // Skilar N-staka fylki me� slembiheilt�lum � bilinu [0, k-1]
        public static int thrirTorskar() {
    
            int counter = 0;
            while (true) {
                int a = 0;
                int b = 0;
                int c = 0;
                counter++;
                a = (int) (Math.random() * 2);
                if (a == 1) {
                    counter++;
                    b = (int) (Math.random() * 2);
                    if (b == 1) {
                        counter++;
                        c = (int) (Math.random() * 2);
                        if (c == 1) {
                            counter++;
                            return counter;
                        }
                    }
                }
            }
        }
    
        public static void main(String[] args) {
            
            int mean = 0;
            for (int i = 0; i < 100000 ; i++) {
                mean =+ thrirTorskar();
            }
            System.out.println(mean);
            
        } 
    } 