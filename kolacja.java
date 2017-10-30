import java.util.Vector;

/**
 * Created by huber on 30.10.2017.
 */
class kolacja extends builderdanie{

    @Override
    public void opis() {
        danie.setOpis("Ostatni posiłek wieczorny. W Polsce i w innych krajach europejskich kolację je się zazwyczaj w godzinach 18-21. W Hiszpanii kolacja jest spożywana dużo później – w godzinach od 21 do północy.");
    }

    @Override
    public void nazwa_dania() {
        danie.setNazwa_dania("Kolacja");
    }

    @Override
    public void skladniki() {
        Vector<String> vec = new Vector<>();
        vec.add("Ser");
        vec.add("Szynka");
        vec.add("Chleb");
        vec.add("Herbata");
        vec.add("Masło");
        vec.add("Parówki");
        danie.setSkladniki(vec);
    }

    @Override
    public void cena() {
        danie.setCena(20);
    }

}
