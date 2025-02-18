import java.util.Random;

public class Prodotto {

    private int codice;
    protected String nome, marca, iva;
    protected float prezzo;

    Prodotto(String nome, String marca, String iva, float prezzo){
        
        Random rand = new Random();

        this.codice = rand.nextInt(99999);
        
        this.nome = nome;
        this.marca = marca;
        this.iva = iva;
        this.prezzo = prezzo;
    }

    /* GETTER */
    public int getCodice(){
        return this.codice;
    }
    public String getNome(){
        return this.nome;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getIva(){
        return this.iva;
    }
    public float getPrezzo(){
        return this.prezzo;   
    }

    
    
    /* SETTER */
    public void setNome(String nome){
        if(nome == null){
            System.out.println("Nome non valido. Inserisci almeno un carattere");
        } else {
            this.nome = nome;
        }
    }
    public void setMarca(String marca){
        if(marca == null){
            System.out.println("Marca non valida. Inserisci almeno un carattere");
        } else {
            this.marca = marca;
        }
    }
    public void setIva(String iva){
        if(iva.length() == 11){
            this.iva = iva;
        } else {
            System.out.println("L'iva deve essere di 11 caratteri");
        }
    }
    public void setPrezzo(float prezzo){
        if(prezzo <= 0){
            System.out.println("Prezzo non valido");
        } else {
            this.prezzo = prezzo;
        }   
    }

}
