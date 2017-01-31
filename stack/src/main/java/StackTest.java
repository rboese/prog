import utilities.TastaturEingabe;

class StackTest {
    public static void main(String a1rgs[]) {
        StackMitListe s = new StackMitListe();

        String str = TastaturEingabe.readString("Bitte Zeichenkette eingeben: ");
        int len = str.length();

        for (int i = 0; i < len; i++)
            s.push(new Character(str.charAt(i)));

        System.out.println();
        s.durchlaufe();

        while (!s.isEmpty()) {
            Object o = s.pop();
            System.out.print(((Character) o).charValue());
        }

        System.out.println();
    }
}
