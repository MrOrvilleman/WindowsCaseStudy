package fact.it.oeftankbeurt;

import fact.it.oeftankbeurt.model.Tankbeurt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OefTankbeurtApplication {

    public static void main(String[] args) {
        SpringApplication.run(OefTankbeurtApplication.class, args);
        Tankbeurt tankbeurt = new Tankbeurt(12150, 12975, 55.8);

        System.out.println("Je verbruikte " + tankbeurt.getVerbruik() + " liter");

        System.exit(0);
    }

}
