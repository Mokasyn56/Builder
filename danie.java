import java.util.Vector;

/**
 * Created by huber on 30.10.2017.
 */
public class danie{
    private String nazwa_dania;
    private String opis;
    private Vector<String> skladniki;
    private int cena;

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setSkladniki(Vector<String> skladniki) {
        this.skladniki = skladniki;
    }
    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setNazwa_dania(String nazwa_dania) {
        this.nazwa_dania = nazwa_dania;
    }
}
