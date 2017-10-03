// Dæmi 5
public class SlembiEind {
   public static void main(String[] args) {


         // Búum til 2D Boolean fylki með 10 rows og 10 columns
         // Öll gildin er "false" til að byrja með
         boolean[][] a = new boolean[10][10];

         // Til að sjá fylkið tómt á skipunarlínu, má taka út
         for (int y = 0; y < a.length; y++) {
               for (int x = 0; x < a[y].length; x++) {
                     System.out.print(a[y][x] + " | ");
               }
               System.out.println();
         }

         // Fylkið er 10 x 10 => 100 reitir
         // trues er 1 því við byrjum á einum reit [4, 4]
         int trues = 1;
         // Skref frumstillt
         int steps = 0;

         // Upphafs hnitin okkar þar sem byrjum
         // Má líka vera i = 5, j = 5
         int i = 4;
         int j = 4;
         
         // Vistar hvar við stóðum, útskýrt betur f. neðan
         int iPrev = i;
         int jPrev = j;

         // Á meðan við erum ekki komin með 100 trues
         // Þá keyrir forritið endalaust
         while (trues != 100) {
               // Ef reiturinn sem við stöndum á er false, þá verður hann true og trues hækkar um 1
               if (!a[i][j]) { 
                     trues++;
                     a[i][j] = true;
               }

               // Upp/niður
               // Fáum nýtt i-hnit og plúsum það við i
               // Random skilar -1, 0 eða 1
               // Fáum nýtt hnit aftur og aftur EF nýja hnitið er út fyrir rammann
               do {
                     i += (int) (Math.random() * 3) - 1;
               } while (i < 0 || i > 9);

               // Ef i hnitið er ekki sama og gamla hnitið
               // Basically, ef manneskjan fer á nýjan stað
               // Þá hækka skrefin um eitt
               // Og nýja staðsetning fer í i
               if (i != iPrev) {
                     steps++;
                     iPrev = i;
               }

               // Nú breyttist "i", ef nýja staðsetning er false
               // ef staðsetning er false, þá verður hún true
               // og trues hækka um 1
               if (!a[i][j]) {
                     trues++;
                     a[i][j] = true;
               }
               
               // Hægri/vinstri
               // Sama og áðan
               do {
                     j += (int) (Math.random() * 3) - 1;
               } while (j < 0 || j > 9);

               // Sama og áðan
               if (j != jPrev) {
                     steps++;
                     jPrev = j;
               }
         }

         // Prentar allt fylkið og sýnir að allt sé orðið true
         for (int y = 0; y < a.length; y++) {
               for (int x = 0; x < a[y].length; x++) {
                     System.out.print(a[y][x] + " | ");
               }
               System.out.println();
         }

         // Prentar fjölda skrefa
         System.out.println("Fjoldi skrefa : " + steps);
      }
}