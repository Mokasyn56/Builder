import java.util.Vector;

/**
 * Created by huber on 30.10.2017.
 */
abstract class builderdanie {

    public danie danie;

    public abstract void opis();

    public abstract void nazwa_dania();

    public abstract void skladniki();

    public abstract void cena();

    public danie getbuilderdanie(){
        return danie;
    }

    public void setbuilderdanie(){
        danie = new danie();
    }

}
