package Personalverwaltung;

import java.util.Date;

public class Mitarbeiter extends Person{

    public Date eintrittsDatum;
    public float gehalt;

    public Mitarbeiter(String name, String anschrift, Date eintrittsDatum, float gehalt)
    {
        super(name,anschrift);
        this.eintrittsDatum = eintrittsDatum;
        this.gehalt = gehalt;
    }

    @Override
    public void datenAusgabe()
    {
        System.out.printf("Name: %s Anschrift: %s eintrittsDatum: %s Gehalt: %s \n",
                this.getName(), this.getAnschrift(), this.eintrittsDatum.toString(), this.gehalt);
    }

}
