package Personalverwaltung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void personTest()
    {
        Person person1 = new Person("Vorname Nachname", "Sackgasse4");

        assertEquals("Vorname Nachname", person1.getName());
        assertEquals("Sackgasse4", person1.getAnschrift());

        person1.setName("Anderer Name");
        assertEquals("Anderer Name", person1.getName());

        person1.setAnschrift("Andere Straße43");
        assertEquals("Andere Straße43", person1.getAnschrift());
    }

}