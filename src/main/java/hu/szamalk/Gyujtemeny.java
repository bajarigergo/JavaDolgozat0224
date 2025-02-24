package hu.szamalk;

import java.util.ArrayList;

public abstract class Gyujtemeny implements Iterable {
    private int ferohely;
    private ArrayList<Media> gyujtemeny = new ArrayList<>(5);

    public Gyujtemeny(ArrayList<Media> gyujtemeny) {
        this.gyujtemeny = gyujtemeny;
        ferohely= gyujtemeny.size();
    }
    public void vetel(Media media){
        if (gyujtemeny.size()<5){
            gyujtemeny.add(media);
        }
        ferohely = gyujtemeny.size();
    }
    public void eladas(int index){
        gyujtemeny.remove(gyujtemeny.get(index));
        ferohely=gyujtemeny.size();
    }
}
