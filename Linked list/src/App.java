public class App {
    public static void main(String[] args) {

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

        linkedList.pop(0);


        linkedList.push(animal,0);
        linkedList.push(beaker,1);
        linkedList.push(gonzo,2);
        linkedList.push(kermit,3);
        linkedList.push(missPiggy,4);
        linkedList.push(swedishChef,5);
        linkedList.print();
        linkedList.pop("Swedish Chef");linkedList.push(swedishChef,0);
        linkedList.print();
        stackList.pop();
        linkedList.pop("Kermit");stackList.push(kermit);
        linkedList.pop("Beaker");stackList.push(beaker);
        popAndPushToMijlist(swedishChef,"Swedish Chef", linkedList, stackList);
        queueList.pop();
        linkedList.pop("Gonzo"); queueList.push(gonzo);
        linkedList.pop("Miss Piggy"); queueList.push(missPiggy);
        popAndPushToMijlist(animal,"Animal", linkedList, queueList);
        popAndPushToLinkedlist(linkedList,queueList);
        popAndPushToLinkedlist(linkedList,stackList);
        linkedList.print();

    }


    private static void popAndPushToLinkedlist(LinkedList list,IMijnLijst lijst){
        for (int i = lijst.size()-1; i>=0;i--){
            Muppet x = lijst.pop();
            list.push(x, 0);
        }
    }
    private static void popAndPushToMijlist(Muppet m,String naam, LinkedList list, IMijnLijst lijst) {
        list.pop(naam);
        lijst.push(m);
        lijst.print();
        list.print();
    }
}
