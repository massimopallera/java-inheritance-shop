public class App {
    public static void main(String[] args) throws Exception {

        Televisore tv = new Televisore("tv", "Marca poco famosa", "tanta tanta tanta iva", 11110, 1110, 012312, 312310, false);


        System.out.println(tv.getInfo());

        Cuffia cuffia = new Cuffia("Cuffia", "Marca unica", "moltta moltta iva", 1111, "rosso", true);
        System.out.println(cuffia.getInfo());

        Smartphone sp = new Smartphone("Smart ma non troppo", "Non troppo marcoso", "iva", 128, "Lungaimei", 128);
        System.out.println(sp.getInfo());
    }
}
