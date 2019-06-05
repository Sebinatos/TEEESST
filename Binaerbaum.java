 public class Binaerbaum
{
    // Attribute
    private Baumelement wurzel;

    // Konstruktor
    public Binaerbaum()
    {
        // Am Anfang war der leere Baum!
        wurzel = new Abschluss();
    }

    // Methoden
    public void einfuegen(Vorschlag vorschlag)
    {
        wurzel = wurzel.einfuegen(vorschlag);
    }

    public void alleElementeAusgeben()
    {
        System.out.println("Alle Elemente des Baums in alphabetischer Reihenfolge:");
        wurzel.ausgeben();
    }
    
    public Vorschlag suchen(Vorschlag v)
    {
        return wurzel.suchen(v);
    }
    
    public void liste Einfuegen(List<String> liste2)
    {
        public int leange = liste2.sitze();
        if (laenge==0)
        {}
        else is (laenge==1)
        {
             einfuegen(new Vorschlag(liste2.get(0)));
             einfuegen(new Vorschlag(liste2.get(1)));
        }
        else if (leange==2)
        {
            int mitte = liste2.size()/2;
            einfuegen (new Vorschlag(liste2.get(2)));
        }   
        
    }
   
}
