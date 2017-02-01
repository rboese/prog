package collections;

/*
    SchlangeMitListe (Schlange implementiert mit Liste)
    Eine Warteschlange ist wegen der eingeschraenkten Funktionalitaet keine Liste.
    Dennoch koennen wir den Code der Listenklasse wiederverwenden.
    Das Prinzip ist einfach: Ein Listenobjekt l wird als privates Attribut
    der Klasse SchlangeMitListe angelegt und die Operationen der Klasse
    SchlangeMitListe rufen die oeffentlichen Operationen des Listenobjekts l auf.
    Die Klasse SchlangeMitListe delegiert damit Aufgaben an die Klasse Liste,
    weswegen das Prinzip Delegation genannt wird.
*/

public class SchlangeMitListe {
    private Liste l = new Liste();

    boolean istLeer() {
        return l.istLeer();
    }

    void durchlaufe() {
        l.durchlaufe();
    }

    void anfuege(Object neuesObject) {
        l.einfuegeEnde(neuesObject);
    }

    Object abarbeite() {
        Object o = l.getKopfDaten();
        l.loescheKopf();
        return o;
    }
}