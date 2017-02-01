package collections;

class ListElement {
    private Object daten;
    private ListElement naechstes;

    ListElement(Object daten, ListElement naechstes) {
        this.daten = daten;
        this.naechstes = naechstes;
    }

    ListElement(Object daten) {
        this(daten, null);
    }

    public Object getDaten() {
        return daten;
    }

    public void setDaten(Object daten) {
        this.daten = daten;
    }

    public ListElement getNaechstes() {
        return naechstes;
    }

    public void setNaechstes(ListElement naechstes) {
        this.naechstes = naechstes;
    }
}
