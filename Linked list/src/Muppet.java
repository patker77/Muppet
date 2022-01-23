public class Muppet {
    private  String naam;
    private  int leeftijd;
    private Muppet next = null;

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
     * @return geeft de Muppet naam  van de next muppet terug
     */
    public Muppet getNext() {
        return next;
    }

    /**
     *
     * @param next  set de Muppet naam van de volgende muppet
     */
    public void setNext(Muppet next) {
        this.next = next;
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
