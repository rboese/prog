package collections;

class Liste {
    private ListElement kopf;
    private ListElement aktuell;
    private ListElement vorgaenger;


    boolean istLeer() {
        return kopf == null;
    }


    void durchlaufe() {
        // Die lokale Variable elem verweist auf das gerade betrachtete Listenelement.
        ListElement elem = kopf;
        while (elem != null) {
            // bearbeite aktuelles Element
            System.out.print(elem.getDaten() + " ");
            // gehe ein Element weiter
            elem = elem.getNaechstes();
        }
        System.out.println();
    }

    int zaehleElemente() {
        // Eine leere Liste enthaelt 0 Listenelemente.
        int anzahl = 0;
        // Die lokale Variable elem verweist auf das gerade betrachtete Listenelement.
        ListElement elem = kopf;
        while (elem != null) {
            // bearbeite aktuelles Element
            anzahl++;
            // gehe ein Element weiter
            elem = elem.getNaechstes();
        }
        return anzahl;
    }


    boolean finde(Object einObject) {
        vorgaenger = null;
        aktuell = kopf;
        while (aktuell != null) {
            if (einObject.equals(aktuell.getDaten()))
                return true;
            else {
                vorgaenger = aktuell;
                aktuell = aktuell.getNaechstes();
            }
        }
        return false;
    }

    // letztes und vorletztes Listenelement ermitteln
    void findeEnde() {
        vorgaenger = null;
        aktuell = kopf;

        // Liste leer?
        if (aktuell == null)
            return;
        // nein, Ende suchen:
        while (aktuell.getNaechstes() != null) {
            vorgaenger = aktuell;
            aktuell = aktuell.getNaechstes();
        }
        // aktuell verweist jetzt entweder auf null (wenn die Liste leer ist)
        // oder aber auf das letzte Listenelement
        // vorgaenger verweist jetzt entweder auf null (wenn die Liste leer ist
        // oder nur ein Element enthaelt) oder aber auf das vorletzte Listenelement
    }


    Object getAktuelleDaten() {
        // aktuelles Element muss vorhanden sein
        if (aktuell == null)
            throw new NullPointerException("getAktuelleDaten: kein aktuelles Element vorhanden");

        return aktuell.getDaten();
    }

    Object getKopfDaten() {
        // Listenkopf muss vorhanden sein, d.h. Liste darf nicht leer sein
        if (kopf == null)
            throw new NullPointerException("getKopfDaten: Liste ist leer");

        return kopf.getDaten();
    }

    Object getEndeDaten() {
        // letztes Listenelement ermitteln, d.h. aktuell und vorgaenger korrekt setzen
        findeEnde();

        return getAktuelleDaten();
    }


    void einfuegeKopf(Object neuesObject) {
        ListElement neu =
                new ListElement(neuesObject, kopf);
        kopf = neu;
    }

    void einfuegeHinter(Object neuesObject) {
        // Vorhandenes Element muss vorhanden sein
        if (aktuell == null)
            throw new NullPointerException("einfuegeHinter: kein aktuelles Element vorhanden");

        // Einfuegen hinter Element aktuell
        ListElement neu =
                new ListElement(neuesObject, aktuell.getNaechstes());
        aktuell.setNaechstes(neu);
    }

    void einfuegeVor(Object neuesObject) {
        // aktuelles Element muss vorhanden sein
        if (aktuell == null)
            throw new NullPointerException("einfuegeVor: kein aktuelles Element vorhanden");

        ListElement neu = new ListElement(neuesObject, aktuell);
        if (vorgaenger == null)
            kopf = neu;
        else
            vorgaenger.setNaechstes(neu);
    }

    void einfuegeEnde(Object neuesObject) {
        ListElement neu =
                new ListElement(neuesObject);

        // letztes Listenelement ermitteln, d.h. aktuell und vorgaenger korrekt setzen
        findeEnde();

        // falls aktuell == null gilt, dann ist die Liste leer und wir fuegen am Listenkopf ein
        if (aktuell == null)
            kopf = neu;
            // andernfalls wird die Nachfolger-Referenz des bisher letzten Elements auf das neue Element gesetzt
        else
            aktuell.setNaechstes(neu);
    }


    void loescheNachfolger() {
        // aktuelles Element muss vorhanden sein
        if (aktuell == null)
            throw new NullPointerException("loescheNachfolger: kein aktuelles Element vorhanden");

        // Nachfolger von aktuell muss vorhanden sein
        if (aktuell.getNaechstes() == null)
            throw new NullPointerException("loescheNachfolger: kein Nachfolger vorhanden");

        aktuell.setNaechstes(aktuell.getNaechstes().getNaechstes());
    }

    void loescheElement() {
        // aktuelles Element muss vorhanden sein
        if (aktuell == null)
            throw new NullPointerException("loescheElement: kein aktuelles Listenelement vorhanden");

        if (vorgaenger == null)
            kopf = aktuell.getNaechstes();
        else
            vorgaenger.setNaechstes(aktuell.getNaechstes());
    }

    void loescheKopf() {
        // Liste darf nicht leer sein
        if (kopf == null)
            throw new NullPointerException("loescheKopf: Liste ist leer");

        kopf = kopf.getNaechstes();
    }

    void loescheEnde() {
        // letztes Listenelement ermitteln, d.h. aktuell und vorgaenger korrekt setzen
        findeEnde();

        loescheElement();
    }


    void konkateniere(Liste l) {
        // letztes Listenelement der aktuellen Liste ermitteln
        findeEnde();

        // Falls aktuell == null gilt, dann ist die Liste leer und wir setzen
        // den Kopf der aktuellen Listen auf den Listenkopf des Arguments l.
        if (aktuell == null)
            kopf = l.kopf;
            // Andernfalls wird die Nachfolger-Referenz des bisher letzten Elements
            // auf auf den Listenkopf des Arguments l gesetzt.
        else
            aktuell.setNaechstes(l.kopf);
    }

    void spiegeln() {
        // Falls die Liste leer ist, ist nichts zu tun.
        if (kopf != null) {
            // In der Liste spiegel wird das Spiegelbild der Original-Liste aufgebaut.
            Liste spiegel = new Liste();

            // Wir durchlaufen die aktuelle Liste und fuegen Kopien
            // der Listenelemente vorne an die Liste spiegel an.
            // Die lokale Variable elem verweist auf das gerade betrachtete Listenelement.
            ListElement elem = kopf;
            while (elem != null) {
                spiegel.einfuegeKopf(elem.getDaten());
                elem = elem.getNaechstes();
            }

            // Nun noch den Kopf der aktuellen Liste
            // auf den Kopf der neu erzeugten Liste spiegel setzen.
            kopf = spiegel.kopf;

            // Auf die Listenelemente der Original-Liste koennen wir jetzt nicht mehr
            // zugreifen. Sie werden irgendwann vom garbage collector aufgesammelt.
        }
    }

    void spiegelnInSitu() {
        vorgaenger = null;
        aktuell = kopf;

        // Liste leer? falls ja, nichts zu tun
        if (aktuell == null)
            return;

        // einelementige Liste? falls ja, nichts zu tun
        if (aktuell.getNaechstes() == null)
            return;

        while (aktuell != null) {
            ListElement naechstes = aktuell.getNaechstes();
            aktuell.setNaechstes(vorgaenger);
            vorgaenger = aktuell;
            aktuell = naechstes;
        }
        // vorgaenger verweist jetzt auf den letzten Knoten der
        // Original-Liste, also auf den Kopf der gespiegelten Liste
        kopf = vorgaenger;
    }

    boolean vergleiche(Liste l) {
        // Wird der Fall 1 auch dann korrekt behandelt,
        // wenn die folgenden beiden Anweisungen auskommentiert werden?
        // Fall 1: beide Listen sind leer und somit gleich
        if (kopf == null && l.kopf == null)
            return true;

        // Fall 2: mindestens eine der Listen ist nicht leer
        // Wir durchlaufen die beiden Listen und vergleichen jeweils
        // die in den beiden Listenelementen enthaltenen Daten.
        ListElement elem = kopf, lElem = l.kopf;
        while (elem != null && lElem != null) {
            // Fall 2a: die Daten in den beiden betrachteten Listenelementen sind verschieden
            if (!elem.getDaten().equals(lElem.getDaten()))
                return false;
            // gehe zum jeweils naechsten Listenelement
            elem = elem.getNaechstes();
            lElem = lElem.getNaechstes();
        }

        // Wenn wir hierher kommen, ist mindestens eine der beiden
        // Referenzen elem bzw. lElem gleich null;
        // Fall 2b: wenn nur eine der beiden Referenzen gleich null ist,
        // dann haben die beiden Listen unterschiedliche Laengen, sind also nicht gleich
        // Fall 2c: wenn beide Referenzen gleich sind, d.h., wenn
        // elem == lElem == null gilt, dann sind die beiden Listen gleich
        return elem == lElem;
    }

}
