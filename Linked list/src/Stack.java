public class Stack implements IMijnLijst {


    private Muppet start;

       // class methods

    @Override
       public void print() {
        //Check als list leeg is
        Muppet muppet = this.start;
        if(this.start == null){
            System.out.println("[-]Stack ->  Geen element in list");
            return;
        }
        System.out.println("=====================");
        System.out.println("        STACK");
        System.out.println("=====================");
        // loop door de list heen en print muppet uit
        for(int i=0;i< this.size();i++){
         System.out.println("[+] "+muppet);
         muppet = muppet.getNext();
        }
        System.out.println(this.size());
     }


     @Override
      public void push(Muppet m) {
         //Voeg het muppet aan het begint van de list toe als eerste element
        if(m == null){
            System.err.println("[-] Stack -> kan niet toegevoegd worden");
        }else{
            m.setNext(this.start);
            this.start = m;
        }
    }

    @Override
    public Muppet pop() {

        Muppet muppet = null;
        // Verwijderd het eerste element van de list
        if(this.start != null){
            muppet = this.start;
            this.start = this.start.getNext();
        }
        else{
          
            System.err.println("[-] Stack -> kan niet meer verwijderen");
            
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
