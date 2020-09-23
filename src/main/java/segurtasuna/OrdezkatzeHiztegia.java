package segurtasuna;

import java.util.Random;

public class OrdezkatzeHiztegia {

    public String zifratu(String mezua){
        //input: mezua, alfabetoa 26 letraz osatuta dagoelarik.
        //output: mezua zifratuta
        String alfabetoa="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String gakoa="ZXCVBNMASDFGHJKLQWERTYUIOP";
        StringBuilder kriptograma= new StringBuilder();
        mezua=mezua.toUpperCase();
        char letra;
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
        //input: kriptograma, alfabetoa 26 letraz osatuta dagoelarik.
        //output: mezua deszifratuta.
        String alfabetoa="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String gakoa="ZXCVBNMASDFGHJKLQWERTYUIOP";
        StringBuilder mezua= new StringBuilder();
        kripto=kripto.toUpperCase();
        char letra;
        int posizioa;

        for(int i=0;i<kripto.length();i++){
            letra=kripto.charAt(i);
            posizioa=gakoa.indexOf(letra);
            letra=alfabetoa.charAt(posizioa);
            mezua.append(letra);
        }
        return mezua.toString();
    }

}
