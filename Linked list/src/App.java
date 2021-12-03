public class App {
    public static void main(String[] args) throws Exception {
        Muppet muppet1 = new Muppet("Animal", 9);
        Muppet muppet2 = new Muppet("Beaker", 4);
        Muppet muppet3 = new Muppet("Gonzo", 21);
        Muppet muppet4 = new Muppet("Kermit", 1);
        Muppet muppet5 = new Muppet("Miss Piggy", 16);
        Muppet muppet6 = new Muppet("Swedish Chef", 7);
        LinkedList list = new LinkedList();
        Stack stack_list = new Stack();
        Queue queue_list = new Queue();
        
        list.push(muppet1,0);
        list.push(muppet2,1);
        list.push(muppet3,2);
        list.push(muppet4,3);
        list.push(muppet5,4);
        list.push(muppet6,5);
        list.print();
  
        

    
        System.out.println("=====================");
        System.err.println("     LINKEDLIST");
        System.out.println("=====================");
        
        for (int i = list.size()-1; i>=0;i--){
           list.pop(i);
        }
         list.print();
         System.out.println(list.size());
        System.out.println("---------------------");
        System.err.println("        STACK");
        System.out.println("---------------------");
        
        stack_list.push(muppet4);stack_list.push(muppet5);stack_list.push(muppet1);
        stack_list.print();
        System.out.println(stack_list.size());
         for (int i = stack_list.size()-1; i>=0;i--){
             Muppet x = stack_list.pop();
            list.push(x, 0);
         }
        System.out.println("=====================");
         stack_list.print();
         System.out.println(stack_list.size());
         System.out.println("=====================");
         System.err.println("     LINKEDLIST");
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
        System.err.println("      QUEUE");
        System.out.println("---------------------");
        queue_list.push(muppet3);queue_list.push(muppet5);queue_list.push(muppet1);
        queue_list.print();   
        System.out.println(queue_list.size());    
        
        for (int i = queue_list.size()-1; i>=0;i--){
            Muppet x = queue_list.pop();
           list.push(x, 0);
        }
        queue_list.print();
        System.out.println(queue_list.size());  


        System.out.println("=====================");
        System.err.println("     LINKEDLIST");
        System.out.println("=====================");
         list.print();
        System.out.println(list.size());

        

    }
}
