package Personalverwaltung;
import java.util.ArrayList;
import java.util.Date;

public class Personalverwaltung {

    static ArrayList<Person> PersonalListe = new ArrayList<Person>();

    public static void main(String[] args)

    {

        PersonalListe.add(new Mitarbeiter("Mitarbeiter1","Mond", new Date(), 2031.43f));
        PersonalListe.add(new Mitarbeiter("Mitarbeiter2","Mars", new Date(), 231.324f));
        PersonalListe.add(new Mitarbeiter("Mitarbeiter3","Erde", new Date(), 2431.32f));
        PersonalListe.add(new Mitarbeiter("Mitarbeiter4","Jupiter", new Date(), 5531.32f));
        PersonalListe.add(new Mitarbeiter("Mitarbeiter5","Neptun", new Date(), 893289.00f));

        PersonalListe.add(new Praktikant("Praktikant1", "Darmstadt", new Date(), new Date()));
        PersonalListe.add(new Praktikant("Praktikant2", "Frankfurt", new Date(), new Date()));
        PersonalListe.add(new Praktikant("Praktikant3", "Bremen", new Date(), new Date()));
        PersonalListe.add(new Praktikant("Praktikant4", "Rennerod", new Date(), new Date()));
        PersonalListe.add(new Praktikant("Praktikant5", "Buxtehude", new Date(), new Date()));

        PersonalListe.add(new Manager("Manager1", "Villa", new Date(), 99666699.69f, 104500f));
        PersonalListe.add(new Manager("Manager2", "Keller", new Date(), 235444.94f, 106400f));
        PersonalListe.add(new Manager("Manager3", "zu Hause", new Date(), 45254.69f, 10070f));
        PersonalListe.add(new Manager("Manager4", "In der Firma", new Date(), 64466.39f, 10030f));
        PersonalListe.add(new Manager("Manager5", "Hochhaus", new Date(), 9593499.93f, 10500f));

        for (int i=0; i<PersonalListe.size(); i++)
        {
            PersonalListe.get(i).datenAusgabe();
        }




    }

}
