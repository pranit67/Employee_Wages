package com.bridgelabz.employeewage;

public class WageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        double number = Math.floor(Math.random() * 10) % 2;
        if (number == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}