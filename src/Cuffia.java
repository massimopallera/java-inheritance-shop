public class Cuffia extends Prodotto {

    private String colore;    
    private boolean isWireless;


    Cuffia(String nome, String marca, String iva, float prezzo, String colore, boolean isWireless){
        super(nome, marca, iva, prezzo);
        this.colore = colore;
        this.isWireless = isWireless;
    }
    
    Cuffia(String colore, boolean isWireless){
        // super(nome, marca, iva, prezzo);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    public String getColore(){
        return this.colore;
    }
    
    public String getIsWireless(){
        return this.isWireless ? "Cuffie Wireless" : "Cuffie con cavo";
    }

    @Override
    public String getInfo(){
        String str = super.getInfo();
        str += "Colore: " + this.colore + "\n";
        str += "Wireless: " + this.getIsWireless() + "\n";

        return str;
    }



}
