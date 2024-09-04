package app;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        ArrayList<Personne> personnes = new ArrayList<>();

        Personne personne1 = new Personne("Valentin", "Gremaud", "teste", 1784, 92);
        Personne personne2 = new Personne("Michu", "Grem", "te", 1765, 45);
        Personne personne3 = new Personne("Gui", "Gre", "testeeeee", 1829, 32);

        personnes.add(personne3);
        personnes.add(personne1);
        personnes.add(personne2);

        for (Personne personne : personnes) {
            System.out.println(personne.getNom());
        }
    }

}
