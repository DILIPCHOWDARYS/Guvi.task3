package com.task3_2;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Employee details");
        System.out.print("Enter the Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter the Employee Salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter the Product details");
        System.out.print("Enter the Product ID: ");
        int pid= sc.nextInt();
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter the Product Quantity: ");
        int quantity = sc.nextInt();

        Employee employee = new Employee(empId, name,salary);
        Product product = new Product(pid, price,quantity);

        System.out.println("Employee Income Tax: " + employee.calcTax());
        System.out.println("Product  Tax: " + product.calcTax());
    }
}
