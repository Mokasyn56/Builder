/**
 * Created by huber on 30.10.2017.
 */
public class Builder {
    public static void main(String[] args) {
        Menu menu = new Menu();
        builderdanie sniadanie = new sniadanie();
        builderdanie obiad = new obiad();
        menu.setBuilderdanie(sniadanie);
        menu.CreateDanie();

        danie danie = menu.getDanie();

    }
}
