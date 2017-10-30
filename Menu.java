/**
 * Created by huber on 30.10.2017.
 */
public class Menu {
    private builderdanie builderdanie;
    public void setBuilderdanie(builderdanie b){
        builderdanie = b;
    }

    public danie getDanie(){
        return builderdanie.getbuilderdanie();
    }

    public void CreateDanie(){
        builderdanie.setbuilderdanie();
        builderdanie.skladniki();
        builderdanie.opis();
        builderdanie.nazwa_dania();
        builderdanie.cena();
    }
}
