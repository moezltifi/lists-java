import lists.Employee;
import lists.EmployeeLinkedList;
import lists.EmployeeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

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

        System.out.println("Linked List");
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
    }
}