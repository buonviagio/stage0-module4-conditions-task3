package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double tmp = 100;
        if(salary <= 10_000){
            System.out.println(salary / tmp * 85);
        } else if(salary > 10_000 && salary <= 20_000 ){
            System.out.println(salary / tmp * 82);
        } else if(salary > 20_000){
            System.out.println(salary / tmp * 80);
        } else if (salary < 0){
            System.out.println("wrong input!");
        }
    }
}
