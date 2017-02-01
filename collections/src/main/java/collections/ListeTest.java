package collections;

import java.util.LinkedList;
import java.util.List;

public class ListeTest {

    public static void main(String[] args) {
        List<Integer> liste = new LinkedList<>();

        System.out.println("Die Liste sollte leer sein.");
        System.out.println(liste);
        System.out.println("Anzahl der Listenelemente = " + liste.size());

        liste.add(0, new Integer(3));
        liste.add(0, new Integer(2));
        liste.add(0, new Integer(1));
        liste.add(new Integer(4));
        liste.add(new Integer(5));
        System.out.println("Die Liste sollte jetzt die Elemente 1, 2, 3, 4, 5 enthalten.");
        System.out.println(liste);
        System.out.println("Anzahl der Listenelemente = " + liste.size());

        liste.remove(0);
        liste.remove(liste.size() - 1);
        System.out.println("Die Liste sollte jetzt die Elemente 2, 3, 4 enthalten.");
        System.out.println(liste);

        liste.remove(0);
        liste.remove(liste.size() - 1);
        System.out.println("Die Liste sollte jetzt nur noch das Element 3 enthalten.");
        System.out.println(liste);

        liste.remove(liste.size() - 1);
        System.out.println("Die Liste sollte jetzt leer sein.");
        System.out.println(liste);
/*
System.out.println("Jetzt wird eine Exception ausgeloest.");
      liste.loescheKopf();
*/

        liste.add(0, new Integer(5));
        liste.add(0, new Integer(4));
        liste.add(0, new Integer(3));
        liste.add(0, new Integer(2));
        liste.add(0, new Integer(1));
        System.out.println("Die Liste sollte jetzt die Elemente 1, 2, 3, 4, 5 enthalten.");
        System.out.println(liste);

        int index = liste.indexOf(new Integer(3));
        // liste.aktuell sollte jetzt auf das Element mit dem Inhalt 3 zeigen.
        liste.add(index + 1, new Integer(33));
        System.out.println("Die Liste sollte jetzt die Elemente 1, 2, 3, 33, 4, 5 enthalten.");
        System.out.println(liste);

        index = liste.indexOf(new Integer(33));
        // liste.aktuell sollte jetzt auf das Element mit dem Inhalt 33 zeigen.
        liste.remove(index + 1);
        System.out.println("Die Liste sollte jetzt die Elemente 1, 2, 3, 33, 5 enthalten.");
        System.out.println(liste);

        liste.remove(index + 1);
        System.out.println("Die Liste sollte jetzt die Elemente 1, 2, 3, 33 enthalten.");
        System.out.println(liste);

        // liste.aktuell sollte jetzt den Wert null haben.
        // (Knoten mit Attribut daten == Integer(5) hat keinen Nachfolger.)
        // System.out.println("Jetzt wird eine Exception ausgeloest.");

        // liste.loescheNachfolger();
    }

}
