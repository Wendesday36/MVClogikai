package main;

import modell.Lada;
import nezet.CuiNezet;

public class LogikaiProgram {

    public static void main(String[] args) {
        CuiNezet nezet = new CuiNezet();
        
        nezet.leirasMegjelenito("Csak 1 igaz!");
        
        Lada arany = new Lada("arany", "én rejtem");
        Lada ezust = new Lada("ezüst", "nem én rejtem", true);
        Lada bronz = new Lada("bronz", "az arany hazudik");
        Lada[] ladak = {arany, ezust, bronz};
        for (Lada lada : ladak) {
            String anyag = lada.getAnyag() + ": ";
            String felirat = lada.getFelirat();
            nezet.feladatMegjelenito(anyag + felirat);
        }
        
        int valasztas = nezet.valasztas("melyik (0..2): ");
        Lada lada = ladak[valasztas];
        String str = "";
        if(lada.isKincs()){
            str = "talált, a kincset a(z) ";
        }else{
            str = "nem talált, a kincset nem a(z) ";
        }
        nezet.eredmenyMegjelenito(str + lada.getAnyag() + " rejti ");
    }
    
}
