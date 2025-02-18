public class Smartphone extends Prodotto{

    String imei;
    int memoria;

    Smartphone(String nome, String marca, String iva, float prezzo, String imei, int memoria){
        super(nome, marca, iva, prezzo);
        this.imei = imei;
        this.memoria = memoria;
    }

    public String getImei(){
        return this.imei;
    }

    public int getMemoria(){
        return this.memoria;
    }

    @Override
    public String getInfo(){
        
        String str = super.getInfo();

        str += "IMEI: " + this.imei + "\nMemoria: " + this.memoria + "GB";

        return str;
    }

}
