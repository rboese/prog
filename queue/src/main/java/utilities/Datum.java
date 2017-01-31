package utilities;

public class Datum
        implements Comparable {
    private short jahr;   // Jahr vierstellig
    private byte monat;  // Monat von 1 bis 12
    private byte tag;    // Tag von 1 bis 31

    public Datum() {
        // eigentlich soll hier das aktuelle Datum genommen werden
        tag = 1;
        monat = 1;
        jahr = 2000;
    }

    public Datum(int tag, int monat, int jahr) {
        setzeDatum(tag, monat, jahr);
    }

    private static int ultimo(int mo, int jh) {
        // Vorbedingung: 0<=mo<=12 && 1800<=jh
        if (mo == 1 || mo == 3 || mo == 5 || mo == 7 || mo == 8 || mo == 10 || mo == 12)
            return 31;
        if (mo == 4 || mo == 6 || mo == 9 || mo == 11)
            return 30;
        if (jh % 4 != 0)
            return 28;
        if (jh % 100 == 0 && jh % 400 != 0)
            return 28;
        return 29;
    }

    public void setzeDatum(int tag, int monat, int jahr) {
        checkDatum(tag, monat, jahr);
        this.tag = (byte) tag;
        this.monat = (byte) monat;
        this.jahr = (short) jahr;
    }

    private void checkDatum(int t, int m, int j) {
        if (t < 0)
            throw new IllegalArgumentException
                    ("Tag darf nicht negativ sein.");
        if (m < 0)
            throw new IllegalArgumentException
                    ("Monat darf nicht negativ sein.");
        if (j < 1800)
            throw new IllegalArgumentException
                    ("Jahreszahlen unter 1800 sind nicht zugelassen.");
        if (m > 12)
            throw new IllegalArgumentException
                    ("Monat darf nicht gr��er als 12 sein.");
        if (t > 31)
            throw new IllegalArgumentException
                    ("Tag darf nicht gr��er als 31 sein.");
        if (t > ultimo(m, j))
            throw new IllegalArgumentException
                    (t + "." + m + "." + j + " ist kein reales Datum.");
    }

    public String toString() {
        return (tag + "." + monat + "." + jahr);
    }

    public int gibJahr() {
        return jahr;
    }

    public int gibMonat() {
        return monat;
    }

    public int gibTag() {
        return tag;
    }

    public boolean frueherAls(Datum vergleichDatum) {
        if (jahr < vergleichDatum.jahr)
            return true;
        if (jahr == vergleichDatum.jahr) {
            if (monat < vergleichDatum.monat)
                return true;
            if (monat == vergleichDatum.monat)
                if (tag < vergleichDatum.tag)
                    return true;
        }
        return false;
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        Datum d = (Datum) o;
        return jahr == d.gibJahr()
                && monat == d.gibMonat()
                && tag == d.gibTag();
    }

    public int compareTo(Object einObject) {
        Datum einDatum = (Datum) einObject;
        if (frueherAls(einDatum))
            return -1;
        else if (equals(einDatum))
            return 0;
        else
            return 1;
    }

}

