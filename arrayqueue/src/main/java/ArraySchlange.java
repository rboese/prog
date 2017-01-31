import java.util.NoSuchElementException;

class ArraySchlange {
    private final int max = 20;
    private Object schlange[] = new Object[max];
    private int kopf = 0;
    private int ende = 0;

    boolean istLeer() {
        return kopf == ende;
    }

    boolean istVoll() {
        return ((ende + 1) % max == kopf);
    }

    void durchlaufe() {
        int i = kopf;
        while (i != ende) {
            System.out.print(schlange[i] + "~");
            i = (i + 1) % max;
        }
        System.out.println();
    }

    void anfuege(Object neuesObject) {
        if (istVoll())
            throw new IllegalArgumentException
                    ("Maximalzahl �berschritten.");
        schlange[ende] = neuesObject;
        ende = (ende + 1) % max;
    }

    Object abarbeite() {
        if (istLeer())
            throw new NoSuchElementException
                    ("Leere Schlange.");
        Object ab = schlange[kopf];
        kopf = (kopf + 1) % max;
        return ab;
    }
}
