public class OddaJofn {
    public static void main(String[] args) {
        
        // Stofnum int fylk med 25 sætum
        int[] A = new int[25];
        // Stofnum int breytu sem telur oddatölurteljara
        int teljaOdda = 0;

        for (int i = 0; i < A.length ; i++) {
            // Gefum öllum sætum í A random tölu [1, 20]
            A[i] = (int) (Math.random() * 20) + 1;
            if (A[i] % 2 == 1) {
                // Af talan sem A var að fá er oddatala
                // Hækkum oddatöluteljara
                teljaOdda++;
            }
        }

        // Finnum hvað það eru margar sléttar tölur
        int slettarTolur = A.length - teljaOdda;

        // EF það eru fleiri odda en sléttar
        if (teljaOdda > slettarTolur) {
            // Segja að það séu fleiri odda
            System.out.println("Fleiri oddatölur");
        } else {
            // Annars fleiri sléttar
            System.out.println("Fleiri sléttar");
        }
    }
}