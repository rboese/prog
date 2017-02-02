class Element {

    private int zahl;                //Der zu speichernde Wert
    private char flag;                //Reihenfolge-Kennzeichen

    public Element(int i, char c)        //Konstruktor f?r neue Elemente
    {
        this.zahl = i;
        this.flag = c;
    }

    public int get_Zahl()            //R?ckgabe des Zahlenwertes
    {
        //	...
    }

    public void put_Zahl(int i)            //?berschreiben des Wertes
    {
        //	...
    }

    public char get_Flag()            //R?ckgabe des Reihenfolge-Kennzeichens
    {
        //	...
    }
}


public class Stabil {
    public static Element[] selectionsort(Element feld[]) {
        for (int i = 0; i < feld.length - 1; i++) {
            // bestimme k als Platz des kleinsten Schl?ssels im Quellteil
            int k = i;
            for (int j = i + 1; j < feld.length; j++)
                if (feld[j].get_Zahl() < feld[k].get_Zahl())
                    k = j;


            // Vertauschen der Objekte an Positionen i und k
            Element hilf = feld[k];
            feld[k] = feld[i];
            feld[i] = hilf;

            //Ausgabe des Feldes nach i-tem Lauf
            System.out.print("Feld nach dem " + (i + 1) + ".ten Durchlauf: ");
            feldAusgabe(feld);
        }

        return feld;
    }

    public static Element[] transformieren(Element feld[]) {
        for (int i = 0; i < feld.length; i++) {
            // Transformationsfunktion anwenden

        }

        System.out.print("Feld nach der Transformation:");
        feldAusgabe(feld);

        return feld;
    }

    public static Element[] ruecktransformieren(Element feld[]) {
        for (int i = 0; i < feld.length; i++) {
            // Ruecktransformation machen

        }

        return feld;
    }

    private static void feldAusgabe(Element[] feld) {
        for (int i = 0; i < feld.length; i++) {
            System.out.print(feld[i].get_Zahl() + "-" + feld[i].get_Flag());
            if (i < (feld.length - 1))
                System.out.print(" , ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Element e1 = new Element(2, 'a');
        Element e2 = new Element(2, 'b');
        Element e3 = new Element(1, 'a');
        Element a[] = {e1, e2, e3};
        System.out.println("SelSort ohne Transformation");
        selectionsort(a);
        System.out.print("Sortiertes Feld:               ");
        feldAusgabe(a);

        Element e4 = new Element(2, 'a');
        Element e5 = new Element(2, 'b');
        Element e6 = new Element(1, 'a');
        Element b[] = {e4, e5, e6};
        System.out.println("SelSort mit Transformation");
        ruecktransformieren(selectionsort(transformieren(b)));
        System.out.print("Sortiertes Feld:               ");
        feldAusgabe(b);
    }

}
