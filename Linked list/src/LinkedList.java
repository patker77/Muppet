public class LinkedList {

    // class flied
    private int size;
    private Muppet start;


    // class methods
    public void print() {
        Muppet m = start;
        if(start == null){
            System.err.println("Linkedlist is empty");
            return;
        }
        for(int i=0;i< size();i++){
         System.out.println(String.format("Naam: %s\nLeeftijd: %d\n",m.getNaam(),m.getLeeftijd()));
         m = m.next;
        }
     }
    public void push(Muppet m, int p) {
        if ( p < 0 || p > size()){
            System.err.println("invalide position");
            return;
        }
        Muppet n =start;
        if ( p == 0 ){
            m.next = start;
            start = m;
        }
        else
        {
           for ( int i = 0; i<p-1;i++)
           {
                 n= n.next;
           } 
           
           m.next = n.next;
           n.next = m;
        }
    }
    public Muppet pop(int p){

        if ( p < 0 || p >= size()){
            System.err.println("invalide position");
            return start;
        }

        Muppet n = start;
        Muppet moppie ;
        
        if ( p == 0 ){
            moppie = start;
           // System.out.println(String.format("Naam: %s\nLeeftijd: %d\n",moppie.getNaam(),moppie.getLeeftijd()));
            start = n.next;
            
            return moppie;
        }
        else
            {
                for ( int i = 0;n != null && i<p-1;i++)
                {
                      n = n.next;
                }  
                if(n == null || n.next == null){
                    System.err.println("moppet not found");
                }
                Muppet m = n.next.next;
                moppie = n.next;
              //  System.out.println(String.format("Naam: %s\nLeeftijd: %d\n",moppie.getNaam(),moppie.getLeeftijd()));
                
                n.next = m;
                return moppie;
        }
    }

    public Muppet pop(String s){


        Muppet n = start;
        Muppet m = null;
        Muppet moppie;
        
        if ( n != null && n.getNaam() == s ){

            moppie = start;
            System.out.println(String.format("Naam: %s\nLeeftijd: %d\n",moppie.getNaam(),moppie.getLeeftijd()));
            start = n.next;
            
            return moppie;
        }
        else
            {
                while (n != null && n.getNaam() != s)
                {
                    m = n;
                    n = n.next;
                }  
                if(n == null ){
                    System.err.println("moppet not found");
                }
                m.next = n.next;
                moppie = n;
                System.out.println(String.format("Naam: %s\nLeeftijd: %d\n",moppie.getNaam(),moppie.getLeeftijd()));
                
                return moppie;
        }
    }
    public Muppet peek(String s){


        Muppet n = start;
        Muppet moppie;
        
        if ( n != null && n.getNaam() == s ){
            moppie = start;
            System.out.println(String.format("Naam: %s\nLeeftijd: %d\n",moppie.getNaam(),moppie.getLeeftijd()));
            return moppie;
        }
        else
            {
                while (n != null && n.getNaam() != s)
                {
                    n = n.next;
                }  
                if(n == null ){
                    System.err.println("moppet not found");
                }
                moppie = n;
                System.out.println(String.format("Naam: %s\nLeeftijd: %d\n",moppie.getNaam(),moppie.getLeeftijd()));
                
                return moppie;
        }
    }
  
    public Muppet peek(int p){

        if ( p < 0 || p >= size()){
            System.err.println("invalide position");
            return start;
        }

        Muppet n = start;
        Muppet moppie ;
        
        if ( p == 0 ){
            moppie = start;
            System.out.println(String.format("Naam: %s\nLeeftijd: %d\n",moppie.getNaam(),moppie.getLeeftijd())); 
            return moppie;
        }
        else
            {
                for ( int i = 0;n != null && i<p-1;i++)
                {
                      n = n.next;
                }  
                if(n == null || n.next == null){
                    System.err.println("muppet not found");
                }
                moppie = n.next;
                System.out.println(String.format("Naam: %s\nLeeftijd: %d\n",moppie.getNaam(),moppie.getLeeftijd()));
                return moppie;
        }
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
