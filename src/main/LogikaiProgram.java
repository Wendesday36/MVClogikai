package main;

import modell.Lada;
import nezet.CuiNezet;

public class LogikaiProgram {

    public static void main(String[] args) {
        CuiNezet cui = new CuiNezet();
        cui.leirasMegjelenito("csak egy mond igazat!");
        Lada l1 = new Lada("ezüst", "nem én rejtem a kincset", true);
        Lada l2 = new Lada("arany", "én rejtem a kincset");
        Lada l3 = new Lada("bronz", "az arany hazudik");
        cui.feladatMegjelenito( l1.getAnyag()+":" + l1.getFelirat());
        cui.feladatMegjelenito(l2.getAnyag()+":" + l2.getFelirat());
        cui.feladatMegjelenito(l3.getAnyag()+":" + l3.getFelirat());
        int valasztas = cui.valasztasMegjelenito("melyik: ");
        //cui.eredmenyMegjelenito();

    }

}
