import java.util.HashMap;

public class Istruttore {
    private String nome;
    private String cognome;
    private String codiceIstruttore;
    private HashMap<String, Socio> listaSoci;
    private Attivita attivita;


    public Istruttore(String nome, String cognome, String codiceIstruttore) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceIstruttore = codiceIstruttore;
        this.listaSoci = new HashMap<>();
        this.attivita = null;

    }

    public void rimuoviaAssegnazione(Socio s){
        listaSoci.remove(s.getCodiceSocio());
    }

    public String getSoci(){
        String retValue = "";
        for (Socio s : listaSoci.values()) {
            retValue += s + "\n";
        }
        return retValue;
    }

    

    

}