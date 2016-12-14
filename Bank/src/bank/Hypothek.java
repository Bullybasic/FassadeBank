
package bank;

public class Hypothek {
    private Konto _konto = new Konto(50);
    private Darlehen _darlehen = new Darlehen();
    private Kreditkarte _kreditkarte = new Kreditkarte();
 
    public boolean IstGeeignet(Kunde k, int betrag)
    {
        //Console.WriteLine("{0} möchte ein Darlehen über {1:C} haben", k.Name, betrag);
        System.out.println(k.getName() + " Kunde möchte ein Darlehen über " + betrag + " haben");
 
        boolean geeignet = true;
 
        // Prüfe kreditwürdigkeit des Kunden
        if (!_konto.HatGenugGuthaben(k, betrag))
        {
            geeignet = false;
        }
        else if (_darlehen.HatDarlehen(k))
        {
            geeignet = false;
        }
        else if (!_kreditkarte.HatNichtUeberzogen(k))
        {
            geeignet = false;
        }
 
        return geeignet;
    }
}
