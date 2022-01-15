public class Muppet {
    private String naam;
    private int leeftijd;
    public Muppet next;
    

    public Muppet(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.next = null;
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

    public void print() {
        System.out.println(String.format("Naam: %s\n Leeftijd: %d\n",getNaam(),getLeeftijd()));
    
    }

    
}
