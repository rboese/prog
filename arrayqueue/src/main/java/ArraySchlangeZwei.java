import java.util.NoSuchElementException;

class ArraySchlangeZwei {
    private final int max = 20;
    private Object schlange[] = new Object[max];
    private int kopf = 0;
    private int ende = 0;
    private int anzahl = 0;

    boolean istLeer() {
        return anzahl == 0;

    }

    boolean istVoll() {
        return anzahl == max;

    }

    void durchlaufe() {
        for (int i = 0; i < anzahl; i++) {
            System.out.print(schlange[kopf + i]);
        }

        System.out.println();
    }

    void anfuege(Object neuesObject) {
        if (istVoll())
            throw new IllegalArgumentException
                    ("Maximalzahl ?berschritten.");

        if (++ende > max) {
            ende = 0;
        }

        if (anzahl == 0 && ++kopf > max) {
            kopf = 0;
        }

        anzahl++;

        schlange[ende] = neuesObject;
    }

    Object abarbeite() {
        if (istLeer())
            throw new NoSuchElementException
                    ("Leere Schlange.");

        Object o = schlange[kopf];
        ++kopf;
        --anzahl;

        return o;
    }
}
