package hu.szamalk;

import java.text.Collator;

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

    public String getCim() {
        return cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public int getKiadasiEv() {
        return kiadasiEv;
    }

    public int cimRendez(Konyv o1, Konyv o2) {
        Collator collator = Collator.getInstance();
        return collator.compare(o1.getCim(),o2.getCim());
    }
    public int szerzoRendez(Konyv o1, Konyv o2) {
        Collator collator = Collator.getInstance();
        return collator.compare(o1.getSzerzo(),o2.getSzerzo());
    }
    public int kiadasRendez(Konyv o1, Konyv o2) {
        Collator collator = Collator.getInstance();
        return collator.compare(o1.getKiadasiEv(),o2.getKiadasiEv());
    }
}


