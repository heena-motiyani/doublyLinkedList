 class Node {
    int data;
    Node next;
    Node prev;
}
public class MydoublyLinkedList {
    Node head;
    int size;//optional

    //insert at last
    void insert(Node node) {
        if (isEmpty())
            head = node;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            node.prev = temp;
            temp.next = node;

        }
    }

    boolean search(Node node) {
        boolean response = false;
        if (!isEmpty()) {
            Node temp = head;
            while (temp.next != null) {
                if (temp.data == node.data) {
                    response = true;
                    break;
                }
                temp = temp.next;
            }
        }
        return response;
    }



    private boolean isEmpty() {
        if(head==null)
            return true;
        else
            return false;
    }
    void display() {
        System.out.println("Doubly LinkedList:");
        Node temp;
        temp = head;
        System.out.print("null<--->");
        while (temp != null) {
            System.out.print(temp.data + "<--->");
            temp = temp.next;

        }
        System.out.println("null");
    }
    void delete() {
        Node temp = head;
        if (!isEmpty()) {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp=temp.prev;
            temp.next=null;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node();
        n1.data = 1000;
        n1.next = new Node();
        n1.next.data = 500;
        n1.next.prev = n1;
        n1.next.next = new Node();
        n1.next.next.data=300;
        n1.next.next.prev =n1.next;
        MydoublyLinkedList obj = new MydoublyLinkedList();
        obj.insert(n1);
        obj.display();
        obj.delete();
        obj.display();

    }

}
