package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListeTestZwei {

    public static void main(String[] args) {
        System.out.println("\n\nEinige Tests fuer die Methode konkateniere() :");
        List<Integer> liste = new LinkedList<>();
        List<Integer> liste2 = new LinkedList<>();
        liste2.add(0, new Integer(2));
        liste2.add(0, new Integer(1));
        liste.addAll(liste2);
        System.out.println("liste sollte jetzt die Elemente 1, 2 enthalten.");
        System.out.println(liste);

        liste2 = new LinkedList<>();
        liste2.add(0, new Integer(2));
        liste2.add(0, new Integer(1));

        liste.add(new Integer(3));
        liste.add(new Integer(4));
        liste.add(new Integer(5));
        liste.addAll(liste2);
        System.out.println("liste sollte jetzt die Elemente 1, 2, 3, 4, 5, 1, 2 enthalten.");
        System.out.println(liste);

/*
      // Die folgenden beiden Zeilen fuehren zu einer unendlichen Schleife. Warum?
      liste.konkateniere(liste2);
      liste.durchlaufe();
*/


        System.out.println("\n\nEinige Tests fuer die Methode spiegeln() :");
        liste = new LinkedList<>();
        System.out.println(liste);

        Collections.reverse(liste);
        System.out.println(liste);

        liste.add(new Integer(1));
        System.out.println(liste);

        Collections.reverse(liste);
        System.out.println(liste);

        liste.add(new Integer(2));
        System.out.println(liste);
        Collections.reverse(liste);
        System.out.println(liste);
        Collections.reverse(liste);
        System.out.println(liste);

        liste.add(new Integer(3));
        liste.add(new Integer(4));
        liste.add(new Integer(5));

        System.out.println(liste);
        Collections.reverse(liste);
        System.out.println(liste);


        System.out.println("\n\nEinige Tests fuer die Methode vergleiche() :");
        liste = new LinkedList<>();
        liste2 = new LinkedList<>();
        System.out.println(liste.equals(liste2));
        System.out.println();

        liste.add(0, new Integer(111));
        System.out.println(liste.equals(liste2));
        liste2.add(new Integer(111));
        System.out.println(liste.equals(liste2));
        System.out.println();

        liste2.add(new Integer(222));
        System.out.println(liste.equals(liste2));
        liste.add(new Integer(222));
        System.out.println(liste.equals(liste2));
        System.out.println();

        liste2.add(new Integer(333));
        System.out.println(liste.equals(liste2));
        liste.add(new Integer(444));
        System.out.println(liste.equals(liste2));
        liste.remove(liste.size() - 1);
        liste.add(new Integer(333));
        System.out.println(liste.equals(liste2));
    }

}

