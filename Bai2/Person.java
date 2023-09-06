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
public class Person {

    protected String name;
    protected int age;
    protected String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void input(Scanner sc) {
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        age = sc.nextInt();
        System.out.print("Nhap gioi tinh: ");
        gender = sc.nextLine();
    }

    public void output() {
        System.out.println("Ten: " + this.name);
        System.out.println("Tuoi: " + this.age);
        System.out.println("Gioi tinh: " + this.gender);
    }
}
