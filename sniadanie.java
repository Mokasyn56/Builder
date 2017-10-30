import java.util.Vector;

/**
 * Created by huber on 30.10.2017.
 */
class sniadanie extends builderdanie{

    @Override
    public void opis() {
        danie.setOpis("Pierwszy posiłek dnia, najczęściej spożywany w godzinach porannych. W zależności od tradycji narodowej składa się z różnych potraw – od lekkich i prostych do bardziej sycących i skomplikowanych.");
    }

    @Override
    public void nazwa_dania() {
        danie.setNazwa_dania("Śniadanie");
    }

    @Override
    public void skladniki() {
        Vector<String> vec = new Vector<>();
        vec.add("Ser");
        vec.add("Szynka");
        vec.add("Jajka");
        vec.add("Chleb");
        vec.add("Kawa");
        vec.add("Herbata");
        vec.add("Masło");
        vec.add("Mleko");
        vec.add("Płatki śniadaniowe");
        danie.setSkladniki(vec);
    }

    @Override
    public void cena() {
        danie.setCena(15);
    }
}
