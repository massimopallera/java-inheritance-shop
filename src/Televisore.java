public class Televisore extends Prodotto{

    private float altezza;
    private float lunghezza;
    private float profondita;
    private boolean isSmart;



    Televisore(String nome, String marca, String iva, float prezzo, float altezza, float lunghezza, float profondita, boolean isSmart){
        super(nome, marca, iva, prezzo);
        this.altezza = altezza;
        this.lunghezza = lunghezza;
        this.profondita = profondita;
        this.isSmart = isSmart;
    }

    Televisore(float altezza, float lunghezza, float profondita, boolean isSmart){
        // super(nome, marca, iva, prezzo);
        this.altezza = altezza;
        this.lunghezza = lunghezza;
        this.profondita = profondita;
        this.isSmart = isSmart;
    }

    public String getDimesioni(){
        
        String str = "Altezza: " + this.altezza + "cm\nLunghezza: " + this.lunghezza + "cm\nProdondità: " + this.profondita + "cm";
        
        return str;
    }

    public String getIsSmart(){
        return this.isSmart ? "Tv Smart" : "Tv NON Smart";
    }

    @Override
    public String getInfo(){
        String str = super.getInfo();
        str += this.getDimesioni() + "\n";
        str += "Smart: " + this.getIsSmart() + "\n";

        return str;
    }

}
