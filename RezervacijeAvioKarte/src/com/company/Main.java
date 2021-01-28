package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Rezervacija rezervacija1 = new Rezervacija("Milos","Mitrovic","15-05-2021","15.30h","Katar");
        SistemRezervacija listaRezervacija = new SistemRezervacija();

        try{
            listaRezervacija.dodajRezervaciju(rezervacija1);
            System.out.println("Kraj");
        } catch (DatumNijeValidanException e) {
            e.printStackTrace();
        } catch (ImeNijeValidnoException e) {
            e.printStackTrace();
        }
    }
}
