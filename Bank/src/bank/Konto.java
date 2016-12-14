
package bank;


public class Konto {
    
    private int kontostand;
    
    public Konto(int ks){
        this.kontostand = ks;
    }
    
    public boolean HatGenugGuthaben(Kunde k, int betrag)
    {
        System.out.println("Prüfe Kontostand von " + k.getName());
        
        if(betrag <= kontostand){
            System.out.println("Kunde besitzt genug Mitteln");
            return true;
        }else{
            System.out.println("Kunde besitzt NICHT genug Mitteln");
            return false;
        }
      
       // return true;
    }
    
}
