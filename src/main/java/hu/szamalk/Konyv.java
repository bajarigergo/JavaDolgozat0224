package hu.szamalk;

public class Konyv {
    private String cim;
    private String szerzo;
    private int kiadasiEv;

    public Konyv(String cim, String szerzo, int kiadasiEv) {
        if (cim.length()<6){
            throw new NemLetezoKonyvException("Túl rövid a cím.");
        }else{
            this.cim = cim;
        }
        this.szerzo = szerzo;
        this.kiadasiEv = kiadasiEv;
    }

}


