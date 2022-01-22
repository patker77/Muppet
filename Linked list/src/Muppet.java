public class Muppet {
    private  String naam;
    private  int leeftijd;
    public Muppet next = null;

    /**
     * Muppet Contructor
     * @param naam naam van de muppet
     * @param leeftijd leeftijd van de muppet
     */
    public Muppet(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    /**
     *
     * @return geeft de Muppet naam terug
     */

    public String getNaam() {
        return naam;
    }

    /**
     *
     * @param naam  set de naam van de Muppet
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     *
     * @return geeft de Muppet leeftijd terug
     */
    public int getLeeftijd() {
        return leeftijd;
    }

    /**
     *
     * @param leeftijd  set het leeftijd van de Muppet
     */
    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    /**
     *
     *@return  Geef de gegevens van de Muppet terug in een string formate
     */
    @Override
    public String toString() {
        return "{" +
                "naam='" + naam + '\'' +
                ", leeftijd=" + leeftijd +
                '}';
    }
}
