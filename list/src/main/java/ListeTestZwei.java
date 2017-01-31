public class ListeTestZwei {

    public static void main(String[] args) {
        System.out.println("\n\nEinige Tests fuer die Methode konkateniere() :");
        Liste liste = new Liste();
        Liste liste2 = new Liste();
        liste2.einfuegeKopf(new Integer(2));
        liste2.einfuegeKopf(new Integer(1));
        liste.konkateniere(liste2);
        System.out.println("liste sollte jetzt die Elemente 1, 2 enthalten.");
        liste.durchlaufe();

        liste2 = new Liste();
        liste2.einfuegeKopf(new Integer(2));
        liste2.einfuegeKopf(new Integer(1));

        liste.einfuegeEnde(new Integer(3));
        liste.einfuegeEnde(new Integer(4));
        liste.einfuegeEnde(new Integer(5));
        liste.konkateniere(liste2);
        System.out.println("liste sollte jetzt die Elemente 1, 2, 3, 4, 5, 1, 2 enthalten.");
        liste.durchlaufe();

/*
      // Die folgenden beiden Zeilen fuehren zu einer unendlichen Schleife. Warum?
      liste.konkateniere(liste2);
      liste.durchlaufe();
*/


        System.out.println("\n\nEinige Tests fuer die Methode spiegeln() :");
        liste = new Liste();
        liste.durchlaufe();
        liste.spiegeln();
        liste.durchlaufe();

        liste.einfuegeEnde(new Integer(1));
        liste.durchlaufe();
        liste.spiegeln();
        liste.durchlaufe();

        liste.einfuegeEnde(new Integer(2));
        liste.durchlaufe();
        liste.spiegeln();
        liste.durchlaufe();
        liste.spiegeln();
        liste.durchlaufe();

        liste.einfuegeEnde(new Integer(3));
        liste.einfuegeEnde(new Integer(4));
        liste.einfuegeEnde(new Integer(5));

        liste.durchlaufe();
        liste.spiegeln();
        liste.durchlaufe();


        System.out.println("\n\nEinige Tests fuer die Methode vergleiche() :");
        liste = new Liste();
        liste2 = new Liste();
        System.out.println(liste.vergleiche(liste2));
        System.out.println();

        liste.einfuegeKopf(new Integer(111));
        System.out.println(liste.vergleiche(liste2));
        liste2.einfuegeEnde(new Integer(111));
        System.out.println(liste.vergleiche(liste2));
        System.out.println();

        liste2.einfuegeEnde(new Integer(222));
        System.out.println(liste.vergleiche(liste2));
        liste.einfuegeEnde(new Integer(222));
        System.out.println(liste.vergleiche(liste2));
        System.out.println();

        liste2.einfuegeEnde(new Integer(333));
        System.out.println(liste.vergleiche(liste2));
        liste.einfuegeEnde(new Integer(444));
        System.out.println(liste.vergleiche(liste2));
        liste.loescheEnde();
        liste.einfuegeEnde(new Integer(333));
        System.out.println(liste.vergleiche(liste2));
    }

}
