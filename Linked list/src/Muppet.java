public class Muppet {
    private String naam;
    private int leeftijd;
    public Muppet next = null;
    

    public Muppet(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }
    
    public String getNaam() {
        return naam;
    }
    public int getLeeftijd() {
        return leeftijd;
    }
    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Muppet{" +
                "naam='" + naam + '\'' +
                ", leeftijd=" + leeftijd +
                '}';
    }
}
