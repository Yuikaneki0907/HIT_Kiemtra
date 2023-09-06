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
public class Address {

    private String city;
    private String district;

    public Address() {
    }

    public Address(String city, String district) {
        this.city = city;
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void input(Scanner sc) {
        System.out.print("Nhap thanh pho: ");
        city = sc.nextLine();
        System.out.print("Nhap huyen: ");
        district = sc.nextLine();
    }

    public void output() {
        System.out.println("Thanh pho: " + this.city);
        System.out.println("Huyen: " + this.district);
    }
}
