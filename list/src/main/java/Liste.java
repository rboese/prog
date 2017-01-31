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
            // bearbeite aktuelles Element, z.B.
            System.out.print(elem.getDaten() + " ");
            // gehe ein Element weiter
            elem = elem.getNaechstes();
        }
        System.out.println();
    }

    int zaehleElemente() {
        ListElement elem = kopf;
        int count = 0;
        while (elem != null) {
            count++;
            elem = elem.getNaechstes();
        }

        return count;
    }


    boolean finde(Object einObject) {
        if (einObject == null)
            throw new IllegalArgumentException("finde: Parameter einObject gleich null");

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
        aktuell = kopf;
        vorgaenger = null;
        while (aktuell != null && aktuell.getNaechstes() != null) {
            vorgaenger = aktuell;
            aktuell = aktuell.getNaechstes();
        }
    }


    Object getAktuelleDaten() {
        // aktuelles Element muss vorhanden sein
        if (aktuell == null)
            throw new NullPointerException("getAktuelleDaten: kein aktuelles Element vorhanden");

        return aktuell.getDaten();
    }

    Object getKopfDaten() {
        if (kopf != null) {
            return kopf.getDaten();
        }
        return null;
    }

    Object getEndeDaten() {
        findeEnde();
        return getAktuelleDaten();
    }


    void einfuegeKopf(Object neuesObject) {
        if (neuesObject == null)
            throw new IllegalArgumentException("einfuegeKopf: Parameter neuesObject gleich null");

        ListElement neu =
                new ListElement(neuesObject, kopf);
        kopf = neu;
    }

    void einfuegeHinter(Object neuesObject) {
        if (neuesObject == null)
            throw new IllegalArgumentException("einfuegeHinter: Parameter neuesObject gleich null");

        // aktuelles Element muss vorhanden sein
        if (aktuell == null)
            throw new NullPointerException("einfuegeHinter: kein aktuelles Element vorhanden");

        // Einfuegen hinter Element aktuell
        ListElement neu =
                new ListElement(neuesObject, aktuell.getNaechstes());
        aktuell.setNaechstes(neu);
    }

    void einfuegeVor(Object neuesObject) {
        if (neuesObject == null)
            throw new IllegalArgumentException("einfuegeVor: Parameter neuesObject gleich null");

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
        findeEnde();
        if (aktuell == null) {
            einfuegeKopf(neuesObject);
        } else {
            einfuegeHinter(neuesObject);
        }
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
        if (kopf == null) {
            throw new NullPointerException("loescheKopf: liste leer");
        }

        kopf = kopf.getNaechstes();
    }

    void loescheEnde() {
        findeEnde();
        if (aktuell == null) {
            throw new NullPointerException("loescheEnde: liste leer");
        }

        loescheElement();
    }

    public ListElement getKopf() {
        return kopf;
    }

    public void setKopf(ListElement kopf) {
        this.kopf = kopf;
    }

    void konkateniere(Liste l) {
        findeEnde();
        if (aktuell == null) {
            kopf = l.getKopf();
        } else {
            aktuell.setNaechstes(l.getKopf());
        }
    }

    void spiegeln() {
        aktuell = kopf;
        vorgaenger = null;
        while (aktuell != null) {
            ListElement elem = aktuell.getNaechstes();
            aktuell.setNaechstes(vorgaenger);
            vorgaenger = aktuell;
            aktuell = elem;
        }

        if (vorgaenger != null) {
            kopf = vorgaenger;
        }
    }


    boolean vergleiche(Liste l) {
        if (zaehleElemente() != l.zaehleElemente()) {
            return false;
        }

        boolean areEqual = true;


        aktuell = getKopf();
        ListElement lAktuell = l.getKopf();

        do {
            if (aktuell == null && lAktuell == null) {
                break;
            }

            if (aktuell == null || lAktuell == null || !aktuell.getDaten().equals(lAktuell.getDaten())) {
                areEqual = false;
            } else {
                aktuell = aktuell.getNaechstes();
                lAktuell = lAktuell.getNaechstes();
            }
        } while (areEqual);


        return areEqual;
    }

}
