public interface IMijnLijst {
    /**
     * Methode om een muppet in de list toe te voegen
     * @param m muppet die aan de list toegevoegd dient te worden
     */
    void push(Muppet m);
    /**
     * Methode om een muppet uit te list te verwijderen
     */
    Muppet pop();
    /**
     * Methode om alle elementen in de list te printen
     */
    void print();
    /**
     * Methode om de size van de list te weten
     */
    int size();
}
