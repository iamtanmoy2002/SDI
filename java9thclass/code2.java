import java.util.*;

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

// class Employee implements Comparable<Employee> {
class Employee {
    String name;
    Integer salary;

    Employee(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.salary;
    }

    // @Override
    // public int compareTo(Employee e) {
    // return Integer.compare(this.salary, e.salary);
    // }
}

public class code2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 1000);
        Employee e2 = new Employee("Jane", 2000);
        Employee e3 = new Employee("Jack", 3000);
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        Collections.sort(employees, new NameComparator());
        employees.forEach(it -> System.out.println(it));
    }
}
