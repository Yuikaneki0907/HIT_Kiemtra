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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Classroom c = new Classroom();
        System.out.println("1. Nhap thong tin lop.");
        System.out.println("2. Tra cuu thong tin hoc sinh.");
        System.out.println("Chon 1 hoac 2.");
        int n;
        do{
            n=sc.nextInt();
            sc.nextLine();
        }while(n!=1&&n!=2);
        if(n==1){
            c.input(sc);
            c.output();
        }else{
            
        }
    }
}
