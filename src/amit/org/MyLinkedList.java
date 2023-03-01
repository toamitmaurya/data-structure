package amit.org;

public class MyLinkedList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static int counter = 0;
    private Node head;

    public void addFirst(int data) {

        Node newNode = new Node(data);
        //check if list is null, this not will be set to head
        if (head == null) {
            head = newNode;

        }else {

            newNode.next = head;
            head = newNode;
        }
        counter++;
    }


    public void addLast(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }{
           Node current = head;
           while (current.next!=null){
               current = current.next;
           }
            current.next = newNode;
        }
        counter++;
    }
    public void printData() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        do {
            System.out.println(head.data);
            head = head.next;
        } while (head != null);
    }

    public int getSize(){
        return counter;
    }
}
