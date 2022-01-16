public class LinkedList {

    private Muppet start;


    // class methods

    /*
        Methode om een puppet in de array te pushen door de muppet en een index te geven
    */
    public void print() {
        Muppet m = start;
        
        if(start == null){
            System.err.println("Linkedlist is empty");  //Check als de start node gelijk aan null is / leeg
            return;
        }
        for(int i=0;i< size();i++){
         System.out.println(m); // Loop het lijst door langs alle noden en printen de gegevens uit
         m = m.next;
        }
     }

     /*
        Methode om een puppet in de array te pushen door de muppet en een index te geven
     */
    public void push(Muppet m, int p) {
        
        if ( p < 0 || p > size()){
            System.err.println("invalide position");    // check voor valide index
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

     /*
        Methode om een puppet van de lijst te verwijderen door een index te geven
     */
    public Muppet pop(int p){

        if ( p < 0 || p >= size()){
            System.err.println("invalide position");
            return start;
        }

        Muppet n = start;
        Muppet moppie ;
        
        if ( p == 0 ){
            moppie = start;
            start = n.next;

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
                assert n != null;
                Muppet m = n.next.next;
                moppie = n.next;
                n.next = m;
            }
        return moppie;
    }

    public Muppet pop(String s){

        Muppet n = start;
        Muppet m = null;
        Muppet moppie;
        
        if ( n != null && n.getNaam().equals(s)){

            moppie = start;
            System.out.println(moppie);
            start = n.next;

        }
        else
            {
                while (n != null && !n.getNaam().equals(s))
                {
                    m = n;
                    n = n.next;
                }  
                if(n == null ){
                    System.err.println("moppet not found");
                }
                assert m != null;
                assert n != null;
                m.next = n.next;
                moppie = n;
                System.out.println(moppie);

            }
        return moppie;
    }
    public Muppet peek(String s){


        Muppet n = start;
        Muppet moppie;
        
        if ( n != null && n.getNaam().equals(s)){
            moppie = start;
        }
        else
            {
                while (n != null && !n.getNaam().equals(s))
                {
                    n = n.next;
                }  
                if(n == null ){
                    System.err.println("moppet not found");
                }
                moppie = n;

            }
        System.out.println(moppie);
        return moppie;
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
                assert n != null;
                moppie = n.next;
            }
        System.out.println(moppie);
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
