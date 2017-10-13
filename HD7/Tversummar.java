public class Tversummar {
    
        public static int thversumma(int n) {
    
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    
        public static void main(String[] args) {
            System.out.println(thversumma(0));
            System.out.println(thversumma(234));
            System.out.println(thversumma(1111));
            System.out.println(thversumma(999));
        } 
    } 