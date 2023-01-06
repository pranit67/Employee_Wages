package com.bridgelabz.employeewage;

public class WageComputation {
    final int WAGE_PER_HR = 20;
    final int WORKING_DAYS = 20;
    int max_emp_hr = 100;
    int dailyWage;
    int empHr;
    int totalEmpWage;
    int totalEmpHr = 0;
    int total_working_days = 1;

    void wageCalculation() {

        while (totalEmpHr <= max_emp_hr && total_working_days <= WORKING_DAYS) {
            double number = Math.floor(Math.random() * 10) % 3;
            switch ((int) number) {
                case 1:
                    empHr = 8;
                    dailyWage = WAGE_PER_HR * empHr;
                    break;
                case 2:
                    empHr = 4;
                    dailyWage = WAGE_PER_HR * empHr;
                    break;
                default:
                    empHr = 0;
            }
            totalEmpHr = totalEmpHr + empHr;
            System.out.println("Day " + total_working_days + " Total working hrs " + totalEmpHr);
            total_working_days++;
        }
        System.out.println("-------------------------------------------------");
        totalEmpWage = totalEmpHr * WAGE_PER_HR;
        System.out.println("Monthly wage is " + totalEmpWage);
    }


    public static void main(String[] args) {
        WageComputation object = new WageComputation();
        object.wageCalculation();
    }
}