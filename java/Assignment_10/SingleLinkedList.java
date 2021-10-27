package Assignment_10;


public class SingleLinkedList {
    public static void main(String[] args) {
        SListIterator<Integer> list = new SListIterator<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.remove(3);
        list.iterate();
    }
}
