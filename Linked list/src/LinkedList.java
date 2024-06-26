public class LinkedList {

    private Muppet start;


    // class methods

    /**
     * Methode om alle elementen in de linkedlist te printen
     */
    public void print() {
        Muppet muppet = this.start;
        //Check als list leeg is
        if(muppet == null){
            System.out.println("[-]Linkedlist -> list is leeg");
        }else {
            System.out.println("=====================");
            System.out.println("     LINKEDLIST");
            System.out.println("=====================");
            // loop door de list heen en print muppet uit
            for (int i = 0; i < this.size(); i++) {
                System.out.println("[+] "+ muppet);
                muppet = muppet.getNext();
            }
            System.out.println(this.size());
        }

     }

     /**
      * Methode om een Muppet in een linkedlist toevoegen door de muppet en een index te geven
      * @param m muppet om toegevoegd te worden
      * @param p positie waar de muppet toegevoegd dient te worden
     */
    public void push(Muppet m, int p) {


        // check voor valide index
        if ( p < 0 || p > this.size() || m == null){
            System.err.println("[-]Linkedlist -> Muppet kan niet toegevoegd worden");
        }else {

            /*
             * push het muppet op de eerste positie van de list
             * door de muppet te pointen naar de start en de muppet wordt het nieuwe begint
             *  */
            if (p == 0) {
                m.setNext(this.start);
                this.start = m;
            } else {
                Muppet temp = this.start;
                //loop door de list heen tot een muppet voor de gewenste positie en voeg de muppet toe als de next muppet
                for (int i = 0; i < p - 1; i++) {
                    temp = temp.getNext();
                }

                m.setNext(temp.getNext());
                temp.setNext(m);
            }
        }
    }

    /**
     * Methode om een Muppet uit een linkedlist te verwijderen door een index te geven
     * @param p positie waar de muppet verwijderd dient te worden
     */
    public Muppet pop(int p){

        Muppet temp = this.start;
        Muppet muppet = null;

        // check voor valide index
        if ( p < 0 || p >= this.size()){
            System.err.println("[-]Linkedliks -> ongeldig positie");
        }else {

            //verwijderd eerste muppet uit de list als de index 0 is door de next muppet het begint te zijn
            if (p == 0) {
                muppet = this.start;
                this.start = temp.getNext();

            } else {
                /*
                 * loop door de list heen tot een muppet voor de gewenste positie en
                 * laat het muppet pointen op de next van te verwijderen muppet
                 */
                for (int i = 0; temp != null && i < p - 1; i++) {
                    temp = temp.getNext();
                }
                if (temp == null || temp.getNext() == null) {
                    System.err.println("[-]LinkedList -> Muppet niet gevonden");
                } else {
                    muppet = temp.getNext();
                    temp.setNext(temp.getNext().getNext());
                }
            }
        }
        return muppet;
    }

    /**
     * Methode om een Muppet uit een linkedlist te verwijderen door een naam te geven
     * @param s naam van de muppet die verwijderd dient te worden
     */
    public Muppet pop(String s){

        Muppet muppet = this.start;
        Muppet next = null;

        if ( muppet != null && muppet.getNaam().equals(s)){

            //verwijderd eerste muppet uit de list als de naam gelijk de naam van het  eerste muppet  door de next muppet het begint te zijn
            this.start = muppet.getNext();
        }
        else
            {
                /*
                 * loop door de list heen tot muppet naam gelijk zijn voor en
                 * laat vorige muppet pointent op de next van het te verwijderen muppet
                 */
                while (muppet != null && !muppet.getNaam().equals(s))
                {
                    next = muppet;
                    muppet = muppet.getNext();

                }
                if(muppet == null || next == null){
                    System.err.println("[-]Linkedlist -> Muppet niet gevonden");
                }else {
                    next.setNext(muppet.getNext());

                }

            }
        return muppet;
    }
    /**
     * Methode om een Muppet uit een linkedlist te bekijken door een naam te geven
     * @param s naam van de muppet bekeken dient te worden
     */
    public Muppet peek(String s){


        Muppet temp = this.start;
        
        if ( temp != null && temp.getNaam().equals(s)){
            System.out.println("[+]Linkedlist -> peek "+ temp);
        }
        else
            {
                while (temp != null && !temp.getNaam().equals(s))
                {
                    temp = temp.getNext();
                }  
                if(temp == null ) {
                    System.err.println("[-]Linkedlist -> moppet niet gevonden");
                }else {
                    System.out.println("[+]Linkedlist -> peek "+ temp);
                }

            }

        return temp;
    }

    /**
     * Methode om een Muppet uit een linkedlist te bekijken door een index te geven
     * @param p positie waar de muppet bekeken dient te worden
     */
    public Muppet peek(int p){

        if ( p < 0 || p >= this.size()){
            System.err.println("[-]Linkedlist -> ongeldig positie");
            return this.start;
        }

        Muppet temp = this.start;

        if ( p == 0 ){
            System.out.println("[+]Linkedlist -> peek "+ temp);
        }
        else
            {
                for ( int i = 0;temp != null && i<p;i++)
                {
                      temp = temp.getNext();
                }
                if(temp == null || temp.getNext() == null){
                    System.err.println("[-]Linkedlist -> moppet niet gevonden");
                }else {
                    System.out.println("[+]Linkedlist -> peek "+ temp);
                }
                
            }

        return temp;
    }

    /**
     * Methode om de size van de linkedlist te weten
     */
    public int size() {
        Muppet muppet = this.start;
        int size = 0;
        while(muppet != null)
            {
                size++;
                muppet = muppet.getNext();
            }
        return size;

    }

}
