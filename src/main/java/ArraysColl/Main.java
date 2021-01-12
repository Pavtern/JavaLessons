package ArraysColl;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(4);
        myLinkedList.add(7);
        myLinkedList.add(72);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(5));
//        myLinkedList.remove(4);
        System.out.println(myLinkedList);
    }
}
