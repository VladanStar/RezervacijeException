package com.company;

import java.util.ArrayList;

public class SistemRezervacija {

    ArrayList<Rezervacija> rezervacijaArrayList = new ArrayList<Rezervacija>();

    public void dodajRezervaciju(Rezervacija rezervacija)throws ImeNijeValidnoException, DatumNijeValidanException{
        String treci = rezervacija.getDatum().substring(2,3);
        String peti = rezervacija.getDatum().substring(5,6);
        String crta = "-";
        if(rezervacija.getIme().length()<=2){
            throw new ImeNijeValidnoException();
        }
        else if(!treci.equals(crta)){
            throw new DatumNijeValidanException();
        }
        else if (!peti.equals(crta)) {
                throw new DatumNijeValidanException();

            }
            else{
        rezervacijaArrayList.add(rezervacija);

    }
}

}