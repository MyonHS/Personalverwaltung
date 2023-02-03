package Personalverwaltung;

import java.util.Date;

public class Manager extends Person{

    public Date eintrittsDatum;
    public float gehalt;
    private float praemie;

    public Manager(String name, String anschrift, Date eintrittsDatum, float gehalt, float praemie)
    {
        super(name,anschrift);
        this.eintrittsDatum = eintrittsDatum;
        this.gehalt = gehalt+praemie;
        this.praemie = praemie;
    }

    public void setPraemie(float praemie)
    {
        this.praemie = praemie;
    }

    public float getPramie()
    {
        return praemie;
    }

    @Override
    public void datenAusgabe()
    {
        System.out.printf("Name: %s Anschrift: %s eintrittsDatum: %s Gehalt: %f Praemie: %f \n",
                this.getName(), this.getAnschrift(), this.eintrittsDatum.toString(), this.gehalt, this.praemie);
    }

}
