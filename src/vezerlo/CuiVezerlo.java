package vezerlo;

import modell.Feladat;
import modell.Lada;
import nezet.CuiNezet;


public class CuiVezerlo extends Vezerlo{

    private CuiNezet nezet;
    

    public CuiVezerlo(CuiNezet nezet, Feladat modell) {
        Vezerlo(nezet, modell);
    }

}
