package com.bridgelabz.employeewage;

public class WageComputation {
    int emp_hr = 0;
    int dailyWage = 0;
    static int totalEmpWage = 0;
    int total_emp_hr = 0;
    int total_working_days = 0;
    int empCheck = 0;
    int numOfPresentFullDay = 0;
    int numOfPresentHalfDay = 0;
    int numOfAbsentDays = 0;

    public void emplpoyeeWage(int WAGE_PER_HR, int WORKING_DAYS, int max_emp_hr, String companyName) {
        System.out.println("Employee wages for the company " + companyName + " is :- ");
        while (total_emp_hr <= max_emp_hr && total_working_days < WORKING_DAYS) {
            empCheck = (int) (Math.floor((Math.random() * 10)) % 3);
            switch (empCheck) {
                case 1:
                    emp_hr = 8;
                    numOfPresentFullDay++;
                    break;
                case 2:
                    emp_hr = 4;
                    numOfPresentHalfDay++;
                    break;
                case 0:
                    emp_hr = 0;
                    numOfAbsentDays++;
                    break;
            }
            WORKING_DAYS--;
            total_emp_hr = total_emp_hr + emp_hr;
        }
        System.out.println("Number of working days full day :- " + numOfPresentFullDay);
        System.out.println("Number of working days half day :- " + numOfPresentHalfDay);
        System.out.println("Number of Absent Days :- " + numOfAbsentDays);
        totalEmpWage = total_emp_hr * WAGE_PER_HR;
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int WAGE_PER_HR;
        int WORKING_DAYS;
        int max_emp_hr;
        String companyName;

        WageComputation obj = new WageComputation();
        obj.emplpoyeeWage(10, 4, 20, "Telco");
        System.out.println("Monthly wage of Employee is " + totalEmpWage);

        System.out.println("------------------------------------------------------------------------------------");

        obj.emplpoyeeWage(20, 2, 10, "Emcure");
        System.out.println("Monthly wage of Employee is " + totalEmpWage);
    }
}