public class Queue implements IMijnLijst {


      private Muppet start = null;
      private Muppet back = null;

       // class methods

    @Override
    public void print() {
        //Check als list leeg is
        Muppet muppet = this.start;
        if(this.start == null){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("=====================");
        System.out.println("        QUEUE");
        System.out.println("=====================");
        // loop door de list heen en print muppet uit
        for(int i=0;i< this.size();i++){
         System.out.println(muppet);
         muppet = muppet.next;
        }
        System.out.println(this.size());
     }

//
    @Override

      public void push(Muppet m) {
          if(m == null){
            System.err.println(" can't add to list");
        }else{
              //Voeg het muppet aan het als eerste element toe zodra het list leeg is
            m.next = null;
            if(this.start == null){
                this.start = back = m;
            }else{
                // Voeg het Muppet als laste element van de list toe (enqueue aan de achterkant)
                back.next = m;
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
            this.start = this.start.next;
        }
        else{

            System.err.println("Queue is leeg");

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
                muppet = muppet.next;
            }
        return size;

    }
}
