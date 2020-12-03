package fact.it.oeftoverspreuk.model;

public class Toverspreuk {
    private String tekst;
    private int aantalBewerkingen;

    public Toverspreuk(String tekst) {
        this.tekst = tekst;
    }

    public String getTekst() {
        return tekst;
    }

    public int getAantalBewerkingen() {
        return aantalBewerkingen;
    }

    public void echo(){
        tekst += tekst;
    }

    public void drukAf(){
        System.out.println("De tekst = " + tekst + " en er werden " + aantalBewerkingen + " op uitgevoerd");
    }

    public void vulAan(String woord){
        tekst += woord;
        aantalBewerkingen += 1;
    }

    public void vulAanOpLocatie(String woord, char locatie){
        

    }
}
