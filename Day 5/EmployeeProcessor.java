import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }
}

public class EmployeeProcessor {
    public static void main(String[] args) {
        // List of employees with Indian names
        List<Employee> employees = Arrays.asList(
            new Employee("Rahul Sharma", 35, 75000),
            new Employee("Priya Patel", 28, 65000),
            new Employee("Amit Singh", 42, 85000),
            new Employee("Neha Gupta", 31, 72000),
            new Employee("Vijay Kumar", 45, 90000),
            new Employee("Anjali Desai", 29, 68000),
            new Employee("Sanjay Verma", 50, 95000)
        );

        // Filter employees older than 30 and collect their names
        List<String> filteredNames = employees.stream()
            .filter(e -> e.getAge() > 30)
            .map(Employee::getName)
            .collect(Collectors.toList());

        // Calculate average salary of filtered employees
        double averageSalary = employees.stream()
            .filter(e -> e.getAge() > 30)
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0.0);

        // Print results
        System.out.println("Employees over 30:");
        filteredNames.forEach(System.out::println);
        
        System.out.printf("\nAverage salary: %.2f", averageSalary);
    }
}