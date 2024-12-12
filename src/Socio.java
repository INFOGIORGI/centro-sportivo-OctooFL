public class Socio {
    private String nome;
    private String cognome;
    private String codiceSocio;
    private Istruttore istruttoreAppartenente;
    private Attivita attivita;


    public Socio(String nome, String cognome, String codiceSocio) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceSocio = codiceSocio;
        this.istruttoreAppartenente = null;
        this.attivita = null;
    }

    
    public Istruttore getIstruttoreAppartenente() {
        return istruttoreAppartenente;
    }
    public String getCodiceSocio() {
        return codiceSocio;
    }

    
    public void assegnaIstruttore(Istruttore istruttore){
        this.istruttoreAppartenente = istruttore;

    }

    
    public String toString() {
        return  nome + " " + cognome + " " + codiceSocio;
    }
    
    

    
}