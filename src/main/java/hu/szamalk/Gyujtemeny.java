package hu.szamalk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public abstract class Gyujtemeny implements Iterable{
    private int ferohely;
    private ArrayList<Media> gyujtemeny = new ArrayList<>(5);

    public Gyujtemeny(ArrayList<Media> gyujtemeny) {
        setGyujtemeny(gyujtemeny);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gyujtemeny that = (Gyujtemeny) o;
        return Objects.equals(gyujtemeny, that.gyujtemeny);
    }

    @Override
    public Iterator iterator() {
        return null;
    }


    public void setGyujtemeny(ArrayList<Media> gyujtemeny) {
        if (gyujtemeny.size()<6 && !equals(gyujtemeny)){
            this.gyujtemeny = gyujtemeny;
        } else {
            this.gyujtemeny = new ArrayList<>();
            //throw new RuntimeException("Túl sok média van a gyüjteményben.");
        }
    }

    public ArrayList<Media> getGyujtemeny() {
        return new ArrayList<>(gyujtemeny);
    }
}
