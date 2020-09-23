package segurtasuna;

import java.util.Random;

public class OrdezkatzeHiztegia {

    public String zifratu(String mezua){
        //input: mezua, alfabetoa 26 letraz osatuta dagoelarik eta gakoa, zeinak 26 digitu izan behar dituen (alabetuko letrak)
        String alfabetoa="abcdefghijklmnopqrstuvwxyz";
        StringBuilder kriptograma= new StringBuilder();
        mezua=mezua.toLowerCase();
        char letra;
        //gako bat sortu
        String gakoa="defghijklmnopqrstuvwxyzabc";

        //zifratu
        gakoa=gakoa.toLowerCase();
        int posizioa;
        for(int i=0;i<mezua.length();i++){
            letra=mezua.charAt(i);
            posizioa=alfabetoa.indexOf(letra);
            letra=gakoa.charAt(posizioa);
            kriptograma.append(letra);
        }
        return kriptograma.toString();
    }

    public String deszifratu(String kripto){
        return "";
    }

}
