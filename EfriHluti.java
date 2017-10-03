public class EfriHluti {
    public static void main(String[] args) {
        int medaltal = 0;
        int yfir = 0;
        for (int i = 0; i < args.length; i++) {
            medaltal += Integer.parseInt(args[i]);
        } 
        medaltal /= args.length;
        for (int i = 0; i < args.length; i++) {
            if (medaltal < Integer.parseInt(args[i])) { yfir += 1; }
        } 
        System.out.println("Medaltal : " + medaltal);
        System.out.println(yfir + " yfir medaltali.");
    }
}
