package main;

import modell.Feladat;
import nezet.CuiNezet;
import nezet.JopNezet;
import vezerlo.CuiVezerlo;
import vezerlo.JopVezerlo;

public class LogikaiProgram {

    public static void main(String[] args) {
        new LogikaiProgram().ini();
    }

    public void ini() {
        Feladat modell = new Feladat();
        CuiNezet nezet = new CuiNezet();
        new CuiVezerlo(nezet, modell);

//        JopNezet nezet = new JopNezet();
//        new JopVezerlo(nezet,modell);
    }

}
