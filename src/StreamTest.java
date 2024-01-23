import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee("Ajay",35);
        Employee e2 = new Employee("Vijay",5);
        Employee e3 = new Employee("Zack",30);
        Employee e4 = new Employee("David",51);
        employees = Arrays.asList(e1,e2,e3,e4);
        employees = employees.stream().filter(e->e.getAge()>30).collect(Collectors.toList());
        System.out.println(employees);


    }
}

class Employee{
    String name;
    int age;

    public Employee(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void setAge(int age) {
        this.age = age;
    }
}
