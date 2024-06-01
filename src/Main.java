public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Дурбровская Мария Павловна", "1", 12_567);
        employees[1] = new Employee("Пушкин Александр Сергеевич", "2", 15_452);
        employees[2] = new Employee("Воробьев Михаил Эдуардович", "3", 10_999);
        employees[3] = new Employee("Букин Евгений Петровчи", "2", 12_212);
        employees[4] = new Employee("Воронин Константин Николаевич", "2", 12_211);
        employees[5] = new Employee("Воронин Леонид Николаевич", "4", 122_321);
        employees[6] = new Employee("Сноуден Эдвард Джосеф", "5", 12_321);
        employees[7] = new Employee("Кузя Универович Универка", "3", 15_124);
        employees[8] = new Employee("Лавров Максим Огузок", "3", 76_322);
        employees[9] = new Employee("Кухня Виктория Сергеевна", "1", 54_321);

        PrintlnEmployee();
        System.out.println();
        System.out.println("Сумма затрат на месяц " + CalculationTotalSalary() + " рублей");
        System.out.println("Максимальная сумма " + CalculateMaxSalary());
        System.out.println("Минимальная сумма " + CalculateMinSalary());
        System.out.println("Средняя зарплата " + CalculateSalaryAverage());
        System.out.println();
        System.out.println();
        PrintPeople();
    }

    public static void PrintlnEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static int CalculationTotalSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public static int CalculateMinSalary() {
        int minSum = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSum) {
                minSum = employees[i].getSalary();

            }
        }
        return minSum;
    }

    public static int CalculateMaxSalary() {
        int maxSum = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSum) {
                maxSum = employees[i].getSalary();
            }
        }
        return maxSum;
    }

    public static double CalculateSalaryAverage() {
        int totalSalary = CalculationTotalSalary();
        double averageSalary = (double) totalSalary / employees.length;
        return averageSalary;
    }

    public static void PrintPeople() {
        for (int i = 0; i < employees.length; i++) {
            employees[i].getFullName();
            System.out.println(employees[i].getFullName());
        }
    }
}
