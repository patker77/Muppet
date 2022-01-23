public class App {
    public static void main(String[] args) {

        //classen instantieren

        LinkedList linkedList = new LinkedList();
        IMijnLijst stackList;
        IMijnLijst queueList;
        stackList = new Stack();
        queueList = new Queue();

        Muppet animal = new Muppet("Animal", 9);
        Muppet beaker = new Muppet("Beaker", 4);
        Muppet gonzo = new Muppet("Gonzo", 21);
        Muppet kermit = new Muppet("Kermit", 1);
        Muppet missPiggy = new Muppet("Miss Piggy", 16);
        Muppet swedishChef = new Muppet("Swedish Chef", 7);

        /*
         * linkedlist checken voor nullpointer error
         * push op alphabetisch volgord alle muppet naar de list
         * verwijdert Swedish Chef en push hem aan het begint
         * print linked list
         */

        linkedList.pop(0);
        linkedList.push(animal,0);
        linkedList.push(beaker,1);
        linkedList.push(gonzo,2);
        linkedList.push(kermit,3);
        linkedList.push(missPiggy,4);
        linkedList.push(swedishChef,5);
        linkedList.print();
        linkedList.push(linkedList.pop("Swedish Chef"),0);
        linkedList.print();

        /*
         * stack checken voor nullpointer error
         * kermit,beaker,swedish chef verwijderen van de linkedlist en toevoegen aan de stacklist
         * print stack en linked list
         */

        stackList.pop();
        stackList.push(linkedList.pop("Kermit"));
        stackList.push(linkedList.pop("Beaker"));
        stackList.push(linkedList.pop("Swedish Chef"));
        stackList.print();
        linkedList.print();

        /*
         * queue checken voor nullpointer error
         * Gonzo,Miss Piggy,Animal verwijderen van de linkedlist en toevoegen aan de queuelist
         * print queue en linked list
         */

        queueList.pop();

        queueList.push(linkedList.pop("Gonzo"));
        queueList.push(linkedList.pop("Miss Piggy"));
        queueList.push(linkedList.pop("Animal"));
        queueList.print();
        linkedList.print();

        /*
         * Verwijderen alle element van de queue en stack om het bij de linked list te zetten
         * print linked list
         */
        popAndPushAllToLinkedlist(linkedList,queueList);
        popAndPushAllToLinkedlist(linkedList,stackList);
        linkedList.print();

    }

    /**
     * @param list een instant van de Linkedlist
     * @param lijst een instant van de IMijnList
     * verwijder alle elementen van lijst en voeg het toe aan list
     */

    private static void popAndPushAllToLinkedlist(LinkedList list,IMijnLijst lijst){
        for (int i = lijst.size()-1; i>=0;i--){
            list.push(lijst.pop(), 0);
        }
    }
}
