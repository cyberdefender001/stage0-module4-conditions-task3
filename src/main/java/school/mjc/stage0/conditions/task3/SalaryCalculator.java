package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public static void calculateSalary(int salary) {
        int taxes = 0;
        double sum = 0;
        if (salary == 0) {
            System.out.println("wrong input!");
        }else if (salary <= 10000) {
            sum = salary - salary * 0.15;
            System.out.println(sum);
        } else if (salary > 10000 && salary <= 20000) {
            sum = salary - salary * 0.18;
            System.out.println(sum);
        } else if (salary > 20000) {
            sum = salary - salary * 0.2;
            System.out.println(sum);
        } 
    }
    public static void main(String[] args) {
        calculateSalary(15000);
    }
}
