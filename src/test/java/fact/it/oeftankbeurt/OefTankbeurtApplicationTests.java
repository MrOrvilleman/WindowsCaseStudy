package fact.it.oeftankbeurt;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import fact.it.oeftankbeurt.model.Tankbeurt;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class OefTankbeurtApplicationTests {


    /**
     * Test of constructor en getters
     */
    @Test
    public void testConstructorEnGetters() {

        Tankbeurt tankbeurt = new Tankbeurt(1000, 1800, 60);
        assertEquals(1000, tankbeurt.getVorigeKmstand());
        assertEquals(1800, tankbeurt.getHuidigeKmstand());
        assertEquals(60, tankbeurt.getAantalLiter(), 0.01);

    }

    /**
     * Test of setVorigeKmstand method, of class Tankbeurt.
     */
    @Test
    public void testSetVorigeKmstand() {
        Tankbeurt tankbeurt = new Tankbeurt(1000, 1800, 60);
        tankbeurt.setVorigeKmstand(1200);
        assertEquals(1200, tankbeurt.getVorigeKmstand());
    }

    /**
     * Test of setHuidigeKmstand method, of class Tankbeurt.
     */
    @Test
    public void testSetHuidigeKmstand() {
        Tankbeurt tankbeurt = new Tankbeurt(1000, 1800, 60);
        tankbeurt.setHuidigeKmstand(1900);
        assertEquals(1900, tankbeurt.getHuidigeKmstand());
    }

    /**
     * Test of setAantalLiter method, of class Tankbeurt.
     */
    @Test
    public void testSetAantalLiter() {
        Tankbeurt tankbeurt = new Tankbeurt(1000, 1800, 60);
        tankbeurt.setAantalLiter(50.2);
        assertEquals(50.2, tankbeurt.getAantalLiter(), 0.1);
    }

    /**
     * Test of getVerbruik method, of class Tankbeurt.
     */
    @Test
    public void testGetVerbruik() {
        Tankbeurt tankbeurt = new Tankbeurt(1000, 1800, 60);

        assertEquals(7.5, tankbeurt.getVerbruik(), 0.1);
    }

}
