package edu03;

public class PrTask02 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Alice");
        employee1.setRate(10.5);
        employee1.setHours(10);

        Employee employee2 = new Employee("Bob", 8.0);
        employee2.setHours(2);

        Employee employee3 = new Employee("Jack", 12, 20);

        System.out.println("Empl1 = " + employee1);
        System.out.println("Empl2 = " + employee2);
        System.out.println("Empl3 = " + employee3);

        System.out.println(Employee.getTotalSum());
    }
}

class Employee {
    private static final double BONUS_RATE = 0.1; // 10% from salary
    private static double totalSum;
    private String name;
    private double rate;
    private int hours;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public double getSalary() {
        return getRate() * getHours();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getBonuses() {
        return getSalary() * BONUS_RATE;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonuses=" + getBonuses() +
                '}';
    }
}