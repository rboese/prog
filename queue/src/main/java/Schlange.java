import java.util.NoSuchElementException;

class Schlange {
    private ListElement kopf;
    private ListElement ende;

    boolean istLeer() {
        return kopf == null;
    }

    void durchlaufe() {
        ListElement aktuell = kopf;
        while (aktuell != null) {
            // bearbeite aktuelles Element, z.B.
            System.out.print(aktuell.getDaten() + " ");
            // gehe ein Element weiter
            aktuell = aktuell.getNaechstes();
        }
        System.out.println();
    }

    void anfuege(Object neuesObject) {
        if (istLeer()) {
            kopf = new ListElement(neuesObject);
            ende = kopf;
        } else {
            ende.setNaechstes(new ListElement(neuesObject));
            ende = ende.getNaechstes();
        }
    }

    Object abarbeite() {
        if (istLeer())
            throw new NoSuchElementException("Schlange ist leer");
        Object zuBearbeiten = kopf.getDaten();
        kopf = kopf.getNaechstes();
        return zuBearbeiten;
    }
}
