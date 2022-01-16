public class App {
    public static void main(String[] args) {
        Muppet muppet1 = new Muppet("Animal", 9);
        Muppet muppet2 = new Muppet("Beaker", 4);
        Muppet muppet3 = new Muppet("Gonzo", 21);
        Muppet muppet4 = new Muppet("Kermit", 1);
        Muppet muppet5 = new Muppet("Miss Piggy", 16);
        Muppet muppet6 = new Muppet("Swedish Chef", 7);
        LinkedList list = new LinkedList();
        IMijnLijst lijst;
        lijst = new Stack();
        list.push(muppet1,0);
        list.push(muppet2,1);
        list.push(muppet3,2);
        list.push(muppet4,3);
        list.push(muppet5,4);
        list.push(muppet6,5);
        list.print();
  
        

    
        System.out.println("=====================");
        System.out.println("     LINKEDLIST");
        System.out.println("=====================");
        
        for (int i = list.size()-1; i>=0;i--){
           list.pop(i);
        }
         list.print();
         System.out.println(list.size());
        System.out.println("---------------------");
        System.out.println("        STACK");
        System.out.println("---------------------");
        
        lijst.push(muppet4);
        lijst.push(muppet5);
        lijst.push(muppet1);
        lijst.print();
        System.out.println(lijst.size());
         for (int i = lijst.size()-1; i>=0;i--){
             Muppet x = lijst.pop();
            list.push(x, 0);
         }
        System.out.println("=====================");
         lijst.print();
         System.out.println(lijst.size());
         System.out.println("=====================");
         System.out.println("     LINKEDLIST");
         System.out.println("=====================");
         list.print();
         System.out.println(list.size());
         System.out.println("=====================");
         for (int i = list.size()-1; i>=0;i--){
            list.pop(i);
         }
          list.print();
        System.out.println(list.size());
        System.out.println("---------------------");
        System.out.println("      QUEUE");
        System.out.println("---------------------");

        lijst = new Queue();
        lijst.push(muppet3);
        lijst.push(muppet5);
        lijst.push(muppet1);
        lijst.print();
        System.out.println(lijst.size());
        
        for (int i = lijst.size()-1; i>=0;i--){
            Muppet x = lijst.pop();
           list.push(x, 0);
        }
        lijst.print();
        System.out.println(lijst.size());


        System.out.println("=====================");
        System.out.println("     LINKEDLIST");
        System.out.println("=====================");
         list.print();
        System.out.println(list.size());

        

    }
}
