package com.company;

public class Rezervacija {
    private String ime;
    private String prezime;
    private String datum;
    private String vreme;
    private String odrediste;

    public Rezervacija() {
    }

    public Rezervacija(String ime, String prezime, String datum, String vreme, String odrediste) {
        this.ime = ime;
        this.prezime = prezime;
        this.datum = datum;
        this.vreme = vreme;
        this.odrediste = odrediste;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public String getOdrediste() {
        return odrediste;
    }

    public void setOdrediste(String odrediste) {
        this.odrediste = odrediste;
    }

    @Override
    public String toString() {
        return "Rezervacija{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", datum='" + datum + '\'' +
                ", vreme='" + vreme + '\'' +
                ", odrediste='" + odrediste + '\'' +
                '}';
    }
}
