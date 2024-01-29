
package vezerlo;

import modell.Feladat;
import modell.Lada;
import nezet.JopNezet;

public class JopVezerlo extends Vezerlo{
     private JopNezet nezet;
   

    public JopVezerlo(JopNezet nezet, Feladat modell) {
        Vezerlo(nezet, modell);
    }

}
