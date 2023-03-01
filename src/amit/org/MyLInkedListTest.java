package amit.org;

public class MyLInkedListTest {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addLast(9);
        myLinkedList.printData();
        System.out.println(myLinkedList.getSize());

    }
}
