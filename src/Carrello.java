import java.util.Scanner;

public class Carrello {

    private static Prodotto[] carrello = new Prodotto[0];
    public static void addToCart(Prodotto prodotto){
        //change array length
        Prodotto[] temp = new Prodotto[carrello.length + 1];

        for(int i = 0; i < carrello.length; i++){
            temp[i] = carrello[i];
        }

        temp[carrello.length] = prodotto;
        carrello = temp;
    }


    public static void main(String[] args) {
        
        String iva = "fjaldfjakljfal";
        Scanner in = new Scanner(System.in);
        
        while (true) {

            System.out.println("Inserire un prodotto. Se si vuole uscire dal carrello digitare 'exit'");
            System.out.print("Inserisci nome prodotto: ");

            String nomeProdotto = in.next();

            if(nomeProdotto.trim().toLowerCase().equals("exit")) break;

            System.out.print("Inserisci marca prodotto: ");
            String marca = in.next();

            System.out.print("Inserisci prezzo prodotto: ");
            float prezzo = in.nextFloat();

            System.out.print("Inserisci tipo prodotto. Smartphone, TV, Cuffie o altro: ");
            String tipo = in.next();

            Prodotto nuovoProdotto = new Prodotto();

            switch (tipo.trim().toLowerCase()) {

                case "smartphone":

                    System.out.print("Inserisci IMEI: ");
                    String imei = in.next();

                    System.out.print("Inserisci memoria in GB: ");
                    int memoria = in.nextInt();

                    nuovoProdotto = new Smartphone(nomeProdotto, marca, iva, prezzo, imei, memoria);
                    
                    break;
                
                case "televisore":
                case "tv":

                    System.out.print("Inserisci altezza: ");
                    float altezza = in.nextFloat();
                    
                    System.out.print("Inserisci lunghezza: ");
                    float lunghezza = in.nextFloat();
                    
                    System.out.print("Inserisci profondita: ");
                    float profondita = in.nextFloat();
                   
                    System.out.print("La tv e` smart? ");
                    boolean isSmart = in.next().trim().toLowerCase().equals("si") ? true : false ;

                    nuovoProdotto = new Televisore(nomeProdotto, marca, iva, prezzo, altezza, lunghezza, profondita, isSmart);

                    break;

                case "cuffia":
                case "cuffie":

                    System.out.print("Inserire colore delle cuffie: ");
                    String colore = in.next();

                    System.out.print("Le cuffie hanno il cavo? ");
                    boolean wireless = in.next().trim().toLowerCase().equals("si") ? true : false;

                    nuovoProdotto = new Cuffia(nomeProdotto, marca, iva, prezzo, colore, wireless);

                    break;

                default:

                    nuovoProdotto = new Prodotto(nomeProdotto, marca, iva, prezzo);
                    break;
            }

            addToCart(nuovoProdotto);
        }

        System.out.println("------------------------------------------");
        for (int i = 0; i < carrello.length; i++) {
            System.out.println(carrello[i].getInfo());
            System.out.println("------------------------------------------");
        }

        in.close();
    }
}
