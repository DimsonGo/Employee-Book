import java.util.Objects;

public class Employee {
    private String fullName;
    private String department;
    private int salary;
    //Объявляем переменную айди
    private int id;

    //Статическая переменная, которая будет прибавлять 1
    private static int count = 1;

    public Employee(String fullName, String department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        //Каждый раз, когда конструктор создается, переменная увеличивается
        this.id = count++;
    }

    @Override
    public String toString() {
        return "ФИО " + this.fullName + ", отдел: " + this.department + ", зарплата - " + this.salary + " рублей " + "id " + getId();
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartment1() {
        return department;
    }

    public void setDepartment1(String department1) {
        this.department = department1;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(fullName, employee.fullName) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary);
    }
}
