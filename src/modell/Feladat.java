package modell;

public class Feladat {

     Lada[] ladak;

    public Feladat() {
        Lada arany = new Lada("arany", "én rejtem");
        Lada ezust = new Lada("ezüst", "nem én rejtem", true);
        Lada bronz = new Lada("bronz", "az arany hazudik");
        ladak = new Lada[3];
        ladak[0] = arany;
        ladak[1] = ezust;
        ladak[2] = bronz;
    }

    /*EZ VALOJABAN SETTER*/
    public Lada[] getLadak() {
        return ladak;
    }

}
