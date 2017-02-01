package collections;

class SchlangeTest {
    public static void main(String args[]) {
        if (args.length == 0)
            throw new IllegalArgumentException("Ein Argument ist notwendig.");

        SchlangeMitListe q = new SchlangeMitListe();

        for (int i = 0; i < args[0].length(); i++)
            q.anfuege(new Character(args[0].charAt(i)));

        System.out.println();
        q.durchlaufe();

        while (!q.istLeer()) {
            Character c = (Character) q.abarbeite();
            System.out.print(c.charValue());
        }

        System.out.println();
    }
}
