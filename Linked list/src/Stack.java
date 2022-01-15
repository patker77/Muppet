public class Stack {
    

      // class flied
      private int size;
      private Muppet start;

       // class methods
       public void print() {
        Muppet m = start;
        if(start == null){
            System.err.println("stack is empty");
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
            m.next = start;
            start = m;
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
          
            System.err.println("stack is leeg");
            
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
