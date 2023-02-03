package Personalverwaltung;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void managerTest()
    {
        Date eintrittsDatum = new Date();
        Manager manager1 = new Manager("Max Mustermann","Musterstraße3", eintrittsDatum, 30230.33f, 22.34f);
        assertEquals(30252.67f, manager1.gehalt);
        assertEquals(22.34f, manager1.getPramie());
        assertEquals("Max Mustermann", manager1.getName());
        assertEquals("Musterstraße3",manager1.getAnschrift());
        assertEquals(eintrittsDatum, manager1.eintrittsDatum);

        manager1.setPraemie(55.43f);
        assertEquals(55.43f, manager1.getPramie());

        manager1.setAnschrift("Bahnhofstraße7");
        assertEquals("Bahnhofstraße7",manager1.getAnschrift());

        manager1.setName("Max Musterfrau");
        assertEquals("Max Musterfrau", manager1.getName());
    }
}