package com.bridgelabz.employeewage;

public class WageComputation {
    public static void main(String[] args) {
        final int WAGE_PER_HR = 20;
        final int FULL_DAY_HR = 8;
        int dailyWage = 0;
        int month = 0;
        int partTimeHR = 4;
        for (int i = 1; i <= 20; i++) {
            double number = Math.floor(Math.random() * 10) % 3;
            switch ((int) number) {
                case 1:
                    dailyWage = WAGE_PER_HR * FULL_DAY_HR;
                    System.out.println("Day " + i + " Employee is Full Time And Per Day Wage is " + dailyWage + " Rs.");
                    break;
                case 2:
                    dailyWage = WAGE_PER_HR * partTimeHR;
                    System.out.println("Day " + i + " Employee is Part Time And Per Day Wage is " + dailyWage + " Rs.");
                    break;
                default:
                    System.out.println("Day " + i + " Employee is Absent");
            }
            month = month + dailyWage;
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Overall Monthly Wages Of Employee is " + month);
    }
}