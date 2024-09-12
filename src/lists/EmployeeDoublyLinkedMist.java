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
    public boolean addBefore(Employee newEmployee, Employee oldEmployee) {
        if (head == null) {
            return false;
        }
        EmployeeDoublyNode current = head;
        while (current != null && !current.getEmployee().equals(oldEmployee)) {
            current = current.getNext();
        }
        if (current == null) {
            return false;
        }
        EmployeeDoublyNode newNode = new EmployeeDoublyNode(newEmployee);
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious(newNode);

        if (head == current) {
            head = newNode;
        }
        else {
            newNode.getPrevious().setNext(newNode);
        }
        size++;
    return true;
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
