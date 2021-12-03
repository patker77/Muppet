public class Queue {
    
    
      // class flied
      private int size;
      private Muppet start = null;
      private Muppet back = null;

       // class methods
      public void print() {
        Muppet m = start;
        if(start == null){
            System.err.println("Queue is empty");
            return;
        }
        for(int i=0;i< size();i++){
         System.out.println(String.format("Naam: %s\nLeeftijd: %d\n",m.getNaam(),m.getLeeftijd()));
         m = m.next;
        }
     }

      public void push(Muppet m) {
          Muppet n = m;
        if(n == null){
            System.err.println(" can't add to list");
        }else{
            n.next = null;
            if(start == null){
                start = back = n;
            }else{
                back.next = n;
                back = n;
            }
        }
    }

    public Muppet pop() {

        Muppet moppie= null;

        if(start != null){
            moppie = start;
            start = start.next;
            return moppie;
        }
        else{
          
            System.err.println("Queue is leeg");
            
        }
     return moppie;
    }



    public int size() {
        Muppet m = start;
        size= 0;
        while(m != null)
            {
                size++;
                m = m.next;
            }
        return size;
        
    } 
}
