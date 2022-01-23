public class Queue implements IMijnLijst {


      private Muppet start = null;
      private Muppet back = null;

       // class methods

    @Override
    public void print() {
        //Check als list leeg is
        Muppet muppet = this.start;
        if(this.start == null){
            System.out.println("[-]Queue -> Geen element in list");
            return;
        }
        System.out.println("=====================");
        System.out.println("        QUEUE");
        System.out.println("=====================");
        // loop door de list heen en print muppet uit
        for(int i=0;i< this.size();i++){
         System.out.println("[+] "+muppet);
         muppet = muppet.getNext();
        }
        System.out.println(this.size());
     }

//
    @Override

      public void push(Muppet m) {
          if(m == null){
            System.err.println("[-]Queue -> kan niet toegevoegd worden");
        }else{
              //Voeg het muppet aan het als eerste element van de list toe zodra het list leeg is
            m.setNext(null);
            //check als list leeg is? zo ja, zet het muppet als een en laste element
            if(this.start == null){
                this.start = back = m;
            }else{
                // Voeg het Muppet als laste element van de list toe (enqueue aan de achterkant)
                back.setNext(m);
                back = m;
            }
        }
    }

    @Override

    public Muppet pop() {

        Muppet muppet= null;

        if(this.start != null){
            // Verwijderd het eerste element van de list (Dequeue aan de voorkant)
            muppet = this.start;
            this.start = this.start.getNext();
        }
        else{

            System.err.println("[-] Queue -> kan niet meer verwijderen");

        }
     return muppet;
    }



    @Override
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
