package hu.szamalk;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;
class GyujtemenyTest {

    @Test
    public void OtnelNagyobbKonstruktorTest() {
        Kategoria kat1 = new Kategoria("horror");
        ArrayList<Media> mediak = new ArrayList<>();

        mediak.add(new Media(125,kat1));
        mediak.add(new Media(128,kat1));
        mediak.add(new Media(126,kat1));
        mediak.add(new Media(124,kat1));
        mediak.add(new Media(120,kat1));
        mediak.add(new Media(100,kat1));


        Gyujtemeny gy = new Gyujtemeny(mediak) {
            @Override
            public Iterator iterator() {
                return null;
            }
        };
        assertEquals(0,gy.getGyujtemeny().size());
    }
    @Test
    public void VetelMaximumFerohelyEsetenTest() {
        Kategoria kat1 = new Kategoria("horror");
        ArrayList<Media> mediak = new ArrayList<>();

        mediak.add(new Media(125, kat1));
        mediak.add(new Media(128, kat1));
        mediak.add(new Media(126, kat1));
        mediak.add(new Media(124, kat1));
        mediak.add(new Media(120, kat1));

        Gyujtemeny gy = new Gyujtemeny(mediak){};

        Media m1 = new Media(200,kat1);
        gy.vetel(m1);

        assertEquals(5,gy.getGyujtemeny().size());

        }

    /*@Test
    public void EgyformaTest(){
        Kategoria kat1 = new Kategoria("horror");
        ArrayList<Media> mediak = new ArrayList<>();

        mediak.add(new Media(125, kat1));
        mediak.add(new Media(125, kat1));


        ArrayList<Konyv> konyvek = new ArrayList<>();
        konyvek.add(new Konyv("Az Almafa","Béla",2000));
        konyvek.add(new Konyv("Az Almafa","Peti",2000));
        konyvek.add(new Konyv("Kék bárányfeljő","József",1979));

        Gyujtemeny gy = new Gyujtemeny(mediak,konyvek) {
        };

        assertEquals(0,gy.getKonyvek().size());
    }*/

}