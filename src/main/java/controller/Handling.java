package controller;

import entity.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Handling {
    ArrayList<Student> anhson = new ArrayList<Student>();
    HashMap<String,Student> sondz = new HashMap<String, Student>();
    public void addStudent(){
        Scanner sr = new Scanner(System.in);
        System.out.println("EnrolID :");
        String id = sr.nextLine();
        System.out.println("First Name :");
        String firstname = sr.nextLine();
        System.out.println("Last Name :");
        String lastname = sr.nextLine();
        System.out.println("Age :");
        int age = sr.nextInt();
        Student student = new Student(id,firstname,lastname,age);
        anhson.add(student);
        for (Student m: anhson) {
            Student student1 = new Student(m.getEnrolID(),m.getFirstname(),m.getLastname(),m.getAge());
            sondz.put(m.getEnrolID(),student1);
        }
    }
    public void save() throws IOException {
        FileWriter fileWriter = new FileWriter("src\\main\\resources\\students.dat");
        fileWriter.write("EnrolID\t\t");
        fileWriter.write("FullName\t\t");
        fileWriter.write("Age\n");
        for (String m: sondz.keySet()) {
            fileWriter.write("\t");
            fileWriter.write(m);
            fileWriter.write("\t\t");
            fileWriter.write(sondz.get(m).getFirstname()+ " " +sondz.get(m).getLastname());
            fileWriter.write("\t\t\t");
            fileWriter.write(sondz.get(m).getAge());
            fileWriter.write("\n");
        }
        fileWriter.close();
    }
    public void Display() throws IOException {
        System.out.println("EnrollID |    Full Name    |  Age ");
        System.out.println("---------  ---------------- ------");
        FileReader fr = new FileReader("src\\main\\resources\\students.dat");
        BufferedReader br = new BufferedReader(fr);
        String file;
        int xoa = 0;
        while ((file = br.readLine()) != null) {
            if (xoa == 0) {
                xoa++;
                continue;
            }
            System.out.println(file);
        }
    }
}
