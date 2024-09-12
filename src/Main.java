import lists.Employee;
import lists.EmployeeDoublyLinkedMist;
import lists.EmployeeLinkedList;
import lists.EmployeeNode;

import java.util.*;

import static java.util.List.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList1 = new ArrayList<>();

        System.out.println("Array list");
        employeeList1.add(new Employee("Moez", "Ltifi", 478));
        employeeList1.add(new Employee("Mohamed", "Ahmed", 78));
        employeeList1.add(new Employee("Jhon", "Doe", 44));
        employeeList1.add(new Employee("Yaser", "Kaser", 448));
        employeeList1.forEach(System.out::println);

        System.out.println("Vector");
        List<Employee> employeeList2 = new Vector<>();
        employeeList2.add(new Employee("Moez", "Ltifi", 478));
        employeeList2.add(new Employee("Mohamed", "Ahmed", 78));
        employeeList2.add(new Employee("Jhon", "Doe", 44));
        employeeList2.add(new Employee("Yaser", "Kaser", 448));
        employeeList2.forEach(System.out::println);

        System.out.println("Singly Linked List");
        Employee Moez = new Employee("Moez", "Ltifi", 478);
        Employee Mohamed = new  Employee("Mohamed", "Ahmed", 78);
        Employee Jhon = new  Employee("Jhon", "Doe", 44);
        Employee Yaser = new  Employee("Yaser", "Kaser", 448);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(Moez);
        list.addToFront(Mohamed);
        list.addToFront(Jhon);
        list.addToFront(Yaser);

        System.out.println(list.getSize());

        System.out.println(list.isEmpty());

        list.printList();
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();


        System.out.println("Doubly Linked List");
        EmployeeDoublyLinkedMist DoublyLinkedMist  = new EmployeeDoublyLinkedMist();
        DoublyLinkedMist.addToFront(Moez);
        DoublyLinkedMist.addToFront(Mohamed);
        DoublyLinkedMist.addToFront(Jhon);
        DoublyLinkedMist.addToFront(Yaser);

        DoublyLinkedMist.printList();
        System.out.println(DoublyLinkedMist.getSize());
        Employee Ahmed = new  Employee("Ahmed", "Ahmed", 48);
        DoublyLinkedMist.addToEnd(Ahmed);
        DoublyLinkedMist.printList();
        System.out.println(DoublyLinkedMist.getSize());
        DoublyLinkedMist.removeFromEnd();
        DoublyLinkedMist.printList();
        System.out.println(DoublyLinkedMist.getSize());

        System.out.println("JDK Linked List Class");
        LinkedList<Employee> listJDK = new LinkedList<>();
        listJDK.addFirst(Moez);
        listJDK.addFirst(Mohamed);
        listJDK.addFirst(Jhon);
        listJDK.addFirst(Yaser);

        Iterator iter = listJDK.iterator();
        while (iter.hasNext()) {
            System.out.print("Head ->");
            System.out.print(iter.next());
            System.out.print("<=>");

        }
    }
}