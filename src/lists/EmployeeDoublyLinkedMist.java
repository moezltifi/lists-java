package lists;

public class EmployeeDoublyLinkedMist {
    private EmployeeDoublyNode head;
    private EmployeeDoublyNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        node.setNext(head);
        if (head == null) {
            tail = node;
        }
        else {
            head.setPrevious(node);
        }
        head = node;
        size++;
    }
    public void addToEnd(Employee employee) {
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        if (tail == null) {
            head = node;
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }
    public EmployeeDoublyNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeDoublyNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }
    public EmployeeDoublyNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }
        EmployeeDoublyNode removedNode = tail;
        if (tail.getPrevious() == null) {
            head = null;
        }
        else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void printList() {
        EmployeeDoublyNode current = head;
        System.out.print("HEAD => ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=>  ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
