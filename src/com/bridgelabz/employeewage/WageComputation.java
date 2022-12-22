package com.bridgelabz.employeewage;

public class WageComputation {
    public static void main(String[] args) {
        final int WAGE_PER_HR = 20;
        final int FULL_DAY_HR = 8;
        int dailyWage = 0;
        double number = Math.floor(Math.random() * 10) % 2;
        if (number == 1) {
            dailyWage = WAGE_PER_HR * FULL_DAY_HR;
            System.out.println("Employee is Present And Per Day Wage is " + dailyWage +" Rs.");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}