/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Student extends Person {

    private int id;
    private Address address = new Address();
    private double gpa;

    public Student() {
    }

    public Student(int id, Address address, double gpa) {
        this.id = id;
        this.address = address;
        this.gpa = gpa;
    }

    public Student(int id, Address address, double gpa, String name, int age, String gender) {
        super(name, age, gender);
        this.id = id;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void input(Scanner sc) {
        System.out.print("Nhap ten hoc sinh: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi hoc sinh: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap gioi tinh hoc sinh: ");
        gender = sc.nextLine();
        System.out.print("Nhap id hoc sinh: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi hoc sinh: ");
        address.input(sc);
        System.out.print("Nhap gpa hoc sinh: ");
        gpa = sc.nextDouble();
    }

    @Override
    public void output() {
        System.out.println("Ten: " + this.name);
        System.out.println("Tuoi: " + this.age);
        System.out.println("Gioi tinh: " + this.gender);
        System.out.println("ID: " + this.id);
        address.output();
        System.out.println("GPA: " + this.gpa);
    }
}
