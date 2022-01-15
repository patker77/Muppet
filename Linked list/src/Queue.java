public class Queue {


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
         System.out.println(m);
         m = m.next;
        }
     }

      public void push(Muppet m) {
          if(m == null){
            System.err.println(" can't add to list");
        }else{
            m.next = null;
            if(start == null){
                start = back = m;
            }else{
                back.next = m;
                back = m;
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
        // class flied
        int size = 0;
        while(m != null)
            {
                size++;
                m = m.next;
            }
        return size;
        
    } 
}