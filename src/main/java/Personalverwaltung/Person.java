package Personalverwaltung;

public class Person {

    private String name, anschrift;

    public Person (String name, String anschrift)
    {
        this.name = name;
        this.anschrift = anschrift;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public String getAnschrift()
    {
        return anschrift;
    }

    public void setAnschrift(String newAnschrift)
    {
        anschrift=newAnschrift;
    }

    public void datenAusgabe()
    {
        //stub
    }


}
