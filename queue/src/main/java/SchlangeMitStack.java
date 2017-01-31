/*
    SchlangeMitStack (Schlange implementiert mit Stack)
    Die Klasse SchlangeMitStack verwendet intern weder ein Feld noch eine Liste,
    sondern einen Stack.
*/

public class SchlangeMitStack {
    private Stack s = new Stack();


    boolean istLeer() {
        return s.isEmpty();
    }

    // anfuege() legt das einzuf?gende Element auf dem Stack s ab,
    // der intern verwendet wird.
    void anfuege(Object neuesObject) {
        s.push(neuesObject);
    }

    /*
       Eine Schlange liefert das zuerst gespeicherte Element zur?ck,
       ein Stack jedoch das zuletzt gespeicherte.
       Das von abarbeite() ben?tigte Element liegt also als unterstes Element
       auf dem Stack, der Stack gibt Ihnen jedoch nur das oberste Element.

       Sie m?ssen eine M?glichkeit finden, die Elemente, die auf dem von Ihnen
       ben?tigten Element liegen, an anderer Stelle zwischenzuspeichern.
       Benutzen Sie z.B. einen zweiten, tempor?ren Stack f?r die Zwischenspeicherung
       der Elemente.
    */
    Object abarbeite() {
        Stack buf = new Stack();

        // alle Elemente vom Stack entnehmen und im Zwischenspeicher buf ablegen

        Object tmp = s.pop();
        while (tmp != null) {
            buf.push(tmp);
            tmp = s.pop();
        }


        // das gew?nschte Element liegt zuoberst auf dem Zwischenspeicher
        Object o = buf.pop();

        // Inhalt des Zwischenspeichers wieder in s einfuegen

        tmp = buf.pop();
        while (tmp != null) {
            s.push(tmp);
            tmp = buf.pop();
        }


        return o;
    }


    // Hier haben wir das gleiche Problem, wie bei der Operation abarbeite().
    void durchlaufe() {
        Stack buf = new Stack();

        // alle Elemente vom Stack entnehmen und im Zwischenspeicher buf ablegen

        Object tmp = s.pop();
        while (tmp != null) {
            buf.push(tmp);
            tmp = s.pop();
        }


        // Inhalt des Zwischenspeichers wieder in s einf?gen und dabei
        // das gerade dem Zwischenspeicher entnommenen Objekt bearbeiten

        tmp = buf.pop();
        while (tmp != null) {
            System.out.print(tmp);
            s.push(tmp);
            tmp = buf.pop();
        }


    }


}