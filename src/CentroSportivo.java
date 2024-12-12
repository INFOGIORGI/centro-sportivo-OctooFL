import java.util.ArrayList;
import java.util.HashMap;

public class CentroSportivo {
    private HashMap<String,Socio> soci;
    private HashMap<String,Istruttore> istruttori;
    private ArrayList<Attivita> attivita;



    public CentroSportivo() {
        this.soci = new HashMap<>();
        this.istruttori = new HashMap<>();
        this.attivita = new ArrayList<>();
    }

    public boolean aggiungiSocio(String nome, String cognome, String codiceSocio){
        if(soci.containsKey(codiceSocio)) return false;
        Socio s = new Socio(nome,cognome,codiceSocio);
        soci.put(codiceSocio, s);
        return true;

    }

    public boolean rimuoviSocio(String codiceSocio){
        if(!soci.containsKey(codiceSocio) || soci.get(codiceSocio).getIstruttoreAppartenente() != null) return false;
        soci.remove(codiceSocio);
        return true;
    }
    
    public Socio getSocio(String codiceSocio){
        return soci.get(codiceSocio);
    }



    public boolean aggiungiIstruttore(String nome, String cognome, String codiceIstruttore){
        if(istruttori.containsKey(codiceIstruttore)) return false;
        Istruttore is = new Istruttore(nome,cognome,codiceIstruttore);
        istruttori.put(codiceIstruttore, is);
        return true;

    }

    public boolean rimuoviIstruttore(String codiceIstruttore){
        if(!soci.containsKey(codiceIstruttore) || soci.get(codiceIstruttore).getIstruttoreAppartenente() != null) return false;
        soci.remove(codiceIstruttore);
        return true;
    }
    
    public Socio getIstruttore(String codiceIstruttore){
        return soci.get(codiceIstruttore);
    }


    public boolean assegnaIstruttore(String codiceSocio, String codiceIstruttore){
        Socio s = soci.get(codiceSocio);
        Istruttore is = istruttori.get(codiceIstruttore);

        if(!soci.containsKey(codiceSocio) || !istruttori.containsKey(codiceIstruttore) || s.getIstruttoreAppartenente() == is){
            return false;
        }
        s.assegnaIstruttore(is);
        return true;
    }

    public boolean rimuoviaAssegnazione(String codiceSocio, String codiceIstruttore){
        Socio s = soci.get(codiceSocio);
        Istruttore is = istruttori.get(codiceIstruttore);

        if(!soci.containsKey(codiceSocio) || !istruttori.containsKey(codiceIstruttore) || s.getIstruttoreAppartenente() != is){
            return false;
        }
        is.rimuoviaAssegnazione(s);
        return true;
    }


    public String getSoci(String codiceIstruttore){
        Istruttore is = istruttori.get(codiceIstruttore);
        return is.getSoci();
    }

    public boolean aggiungiAttivita(String codiceSocio, String codiceIstruttore, String data, String orInizio, String orFine){
        Socio s = soci.get(codiceSocio);
        Istruttore is = istruttori.get(codiceIstruttore);
        if(s.getIstruttoreAppartenente() != is) return false;
            Attivita a = new Attivita(data,orInizio,orFine);
            attivita.add(a);
    
    return true;
}
}