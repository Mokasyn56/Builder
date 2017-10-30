import java.util.Vector;

/**
 * Created by huber on 30.10.2017.
 */
class deser extends builderdanie{

    @Override
    public void opis() {
        danie.setOpis("Słodka potrawa podawana jako osobne słodkie danie na koniec posiłku (obiadu, kolacji lub przyjęcia), ale także na podwieczorek albo podczas niezobowiązującego spotkania o dowolnej porze dnia");
    }

    @Override
    public void nazwa_dania() {
        danie.setNazwa_dania("Deser");
    }

    @Override
    public void skladniki() {
        Vector<String> vec = new Vector<>();
        vec.add("Szarlotka");
        vec.add("Napoleon");
        vec.add("Kremówka");
        vec.add("Tiramisu");
        vec.add("Kawa");
        vec.add("Herbata");
        vec.add("Lody");
        danie.setSkladniki(vec);
    }

    @Override
    public void cena() {
        danie.setCena(10);
    }

}
