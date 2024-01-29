package vezerlo;

import modell.Feladat;
import modell.Lada;
import nezet.Nezet;


public abstract class Vezerlo {
     protected Feladat modell;
     public void Vezerlo(Nezet nezet,Feladat modell){
         
     this.modell = modell;
        nezet.leirasMegjelenito("Csak 1 igaz!");
        Lada[] ladak = modell.getLadak();
        for (Lada lada : ladak) {
            String anyag = lada.getAnyag()+ ": ";
            String felirat = lada.getFelirat();
            nezet.feladatMegjelenito(anyag + felirat);
        }

        int valasztas = nezet.valasztas("melyik (0..2): ");
        Lada lada = ladak[valasztas];
        String str = "";
        if (lada.isKincs()) {
            str = "talált, a kincset a(z) ";
        } else {
            str = "nem talált, a kincset nem a(z) ";
        }
        nezet.eredmenyMegjelenito(str + lada.getAnyag() + " rejti ");
     }

}
