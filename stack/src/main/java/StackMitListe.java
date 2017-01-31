/*
    StackMitListe (Stack implementiert mit Liste)
    Ein Stack ist wegen der eingeschraenkten Funktionalitaet keine Liste.
    Dennoch koennen wir den Code der Listenklasse wiederverwenden.
    Das Prinzip ist einfach: Ein Listenobjekt l wird als privates Attribut
    der Klasse StackMitListe angelegt und die Operationen der Klasse
    StackMitListe rufen die oeffentlichen Operationen des Listenobjekts l auf.
    Die Klasse StackMitListe delegiert damit Aufgaben an die Klasse Liste,
    weswegen das Prinzip Delegation genannt wird.
*/

public class StackMitListe {
    private Liste l = new Liste();

    boolean isEmpty() {
        return l.istLeer();
    }

    void durchlaufe() {
        l.spiegeln();
        l.durchlaufe();
        l.spiegeln();
    }

    void push(Object newObject) {
        l.einfuegeEnde(newObject);
    }

    Object pop() {
        l.findeEnde();
        Object elem = l.getAktuelleDaten();
        l.loescheElement();
        return elem;
    }
}