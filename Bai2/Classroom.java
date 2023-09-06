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
public class Classroom {

    private int classId;
    private int numberOfStudent;
    private List<Student> listStudents = new ArrayList<>();

    public Classroom() {
    }

    public Classroom(int classId, int numberOfStudent) {
        this.classId = classId;
        this.numberOfStudent = numberOfStudent;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public List<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }
    
    
    
    public void input(Scanner sc) {
        System.out.print("Nhap ID lop: ");
        classId = sc.nextInt();
        System.out.print("Nhap so luong hoc sinh: ");
        numberOfStudent = sc.nextInt();
        sc.nextLine();
//        List<Student> listStudents = new ArrayList<>();
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("Nhap thong tin hoc sinh thu "+(i+1)+": ");
            Student st = new Student();
            st.input(sc);
            listStudents.add(st);
        }
    }
    
    public void output(){
        System.out.println("ID lop: "+this.classId);
        System.out.println("Si so: "+this.numberOfStudent);
        int i=1;
        for(Student a : listStudents){
            System.out.println("Thong tin hoc sinh thu "+i+": ");
            a.output();
            i++;
        }
    }
    
}
