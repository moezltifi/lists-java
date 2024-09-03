import lists.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Moez", "Ltifi", 478));
        employeeList.add(new Employee("Mohamed", "Ahmed", 78));
        employeeList.add(new Employee("Jhon", "Doe", 44));
        employeeList.add(new Employee("Yaser", "Kaser", 448));
        employeeList.forEach(System.out::println);
}
}