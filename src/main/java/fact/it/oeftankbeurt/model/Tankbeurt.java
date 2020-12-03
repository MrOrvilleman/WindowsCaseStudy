package fact.it.oeftankbeurt.model;

public class Tankbeurt {
    private int vorigeKmstand, huidigeKmstand;
    private double aantalLiter;

    public Tankbeurt(int vorigeKmstand, int huidigeKmstand, double aantalLiter) {
        this.vorigeKmstand = vorigeKmstand;
        this.huidigeKmstand = huidigeKmstand;
        this.aantalLiter = aantalLiter;
    }

    public int getVorigeKmstand() {
        return vorigeKmstand;
    }

    public void setVorigeKmstand(int vorigeKmstand) {
        this.vorigeKmstand = vorigeKmstand;
    }

    public int getHuidigeKmstand() {
        return huidigeKmstand;
    }

    public void setHuidigeKmstand(int huidigeKmstand) {
        this.huidigeKmstand = huidigeKmstand;
    }

    public double getAantalLiter() {
        return aantalLiter;
    }

    public void setAantalLiter(double aantalLiter) {
        this.aantalLiter = aantalLiter;
    }

    public double getVerbruik() {
        return (aantalLiter / (huidigeKmstand - vorigeKmstand)) * 100;
    }
}
