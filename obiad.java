import java.util.Vector;

/**
 * Created by huber on 30.10.2017.
 */
class obiad extends  builderdanie{
    @Override
    public void opis() {
        danie.setOpis("Główny i zarazem najobfitszy posiłek w ciągu dnia, spożywany w Polsce najczęściej między godziną 12 a 16.");
    }

    @Override
    public void nazwa_dania() {
        danie.setNazwa_dania("Obiad");
    }

    @Override
    public void skladniki() {
        Vector<String> vec = new Vector<>();
        vec.add("Ziemniaki");
        vec.add("Frytki");
        vec.add("Ryż");
        vec.add("Kotlet schabowy");
        vec.add("Kotlet mielony");
        vec.add("Pieczony baran");
        vec.add("Półmisek warzyw");
        vec.add("Piwo");
        vec.add("Wino");
        vec.add("Sok");
        vec.add("Coca-Cola");
        danie.setSkladniki(vec);
    }

    @Override
    public void cena() {
        danie.setCena(30);
    }
}
