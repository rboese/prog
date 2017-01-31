import utilities.TastaturEingabe;

class SchlangeTest {
    public static void main(String args[]) {
        SchlangeMitListe s = new SchlangeMitListe();

        String str = TastaturEingabe.readString("Bitte Zeichenkette eingeben: ");
        int len = str.length();

        for (int i = 0; i < len; i++)
            s.anfuege(new Character(str.charAt(i)));

        System.out.println();
        s.durchlaufe();

        while (!s.istLeer()) {
            Object o = s.abarbeite();
            System.out.print(((Character) o).charValue());
        }

        System.out.println();
    }
}
