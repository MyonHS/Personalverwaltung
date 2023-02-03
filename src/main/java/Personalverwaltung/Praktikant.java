package Personalverwaltung;

import java.util.Date;

public class Praktikant extends Person{

    public Date eintrittsDatum, laufzeit;

    public Praktikant(String name, String anschrift, Date eintrittsDatum, Date laufzeit)
    {
        super(name,anschrift);
        this.eintrittsDatum = eintrittsDatum;
        this.laufzeit = laufzeit;
    }

    @Override
    public void datenAusgabe()
    {
        System.out.printf("Name: %s Anschrift: %s eintrittsDatum: %s Laufzeit: %s \n",
                this.getName(), this.getAnschrift(), this.eintrittsDatum.toString(), this.laufzeit.toString());
    }
}
