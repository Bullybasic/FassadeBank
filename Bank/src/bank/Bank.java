
package bank;

public class Bank {

    public static void main(String[] args) {
        Kunde k = new Kunde("Max");
        Hypothek h = new Hypothek();
 
        boolean geeignet = h.IstGeeignet(k, 25);
       
        if(!geeignet){
            System.out.println("Kunde bekommt kein Darlehen");
        }else{
            System.out.println("Kunde bekommt Darlehen.");
        }
                
    }

}
    

