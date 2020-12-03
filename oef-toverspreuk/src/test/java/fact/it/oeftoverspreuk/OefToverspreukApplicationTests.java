package fact.it.oeftoverspreuk;

import fact.it.oeftoverspreuk.model.Toverspreuk;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class OefToverspreukApplicationTests {


    /**
     * Test of constructor en getters
     */
    @Test
    public void testConstructor() {

        Toverspreuk toverspreuk = new Toverspreuk("hallo");
        assertEquals("hallo", toverspreuk.getTekst());
        assertEquals(0, toverspreuk.getAantalBewerkingen());

    }

    /**
     * Test of echo method, of class Toverspreuk.
     */
    @Test
    public void testEcho() {
        Toverspreuk toverspreuk = new Toverspreuk("hallo");
        toverspreuk.echo();
        assertEquals("hallohallo", toverspreuk.getTekst());
        assertEquals(1, toverspreuk.getAantalBewerkingen());
    }

    /**
     * Test of vulAan method, of class Toverspreuk.
     */
    @Test
    public void testVulAan_String() {
        Toverspreuk toverspreuk = new Toverspreuk("hallo");
        toverspreuk.vulAan("nieuw");
        assertEquals("hallonieuw", toverspreuk.getTekst());
        assertEquals(1, toverspreuk.getAantalBewerkingen());
    }

    /**
     * Test of vulAan method achteraan, of class Toverspreuk.
     */
    @Test
    public void testVulAan_String_chara() {
        Toverspreuk toverspreuk = new Toverspreuk("hallo");
        toverspreuk.vulAanOpLocatie("nieuw", 'a');
        assertEquals("hallonieuw", toverspreuk.getTekst());
        assertEquals(1, toverspreuk.getAantalBewerkingen());
    }

    /**
     * Test of vulAan method vooraan, of class Toverspreuk.
     */
    @Test
    public void testVulAan_String_charv() {
        Toverspreuk toverspreuk = new Toverspreuk("hallo");
        toverspreuk.vulAanOpLocatie("nieuw", 'v');
        assertEquals("nieuwhallo", toverspreuk.getTekst());
        assertEquals(1, toverspreuk.getAantalBewerkingen());
    }

    /**
     * Test of vulAan method beide, of class Toverspreuk.
     */
    @Test
    public void testVulAan_String_charb() {
        Toverspreuk toverspreuk = new Toverspreuk("hallo");
        toverspreuk.vulAanOpLocatie("nieuw", 'b');
        assertEquals("nieuwhallonieuw", toverspreuk.getTekst());
        assertEquals(1, toverspreuk.getAantalBewerkingen());
    }

    /**
     * Test of drukAf method, of class Toverspreuk.
     */
    @Test
    public void testDrukAf() {
        Toverspreuk toverspreuk = new Toverspreuk("hallo");
        toverspreuk.echo();
        toverspreuk.vulAan("n");
        toverspreuk.vulAanOpLocatie("m", 'a');
        toverspreuk.vulAanOpLocatie("o", 'v');
        toverspreuk.vulAanOpLocatie("p", 'b');
        toverspreuk.drukAf();
        PrintStream defaultSO = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String result;
        System.setOut(new PrintStream(baos));
        try {
            toverspreuk.drukAf();
            BufferedReader br = new BufferedReader(new StringReader(baos.toString()));
            result = br.readLine();
            assertEquals("De tekst = pohallohallonmp en er werden 5 bewerkingen op uitgevoerd", result);
            br.close();
        } catch (Exception e) {
            System.setOut(defaultSO);
            System.out.println("Error while redirection System.out");
        }
        System.setOut(defaultSO);
    }

}
