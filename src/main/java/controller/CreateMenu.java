package controller;

import java.io.IOException;
import java.util.Scanner;

public class CreateMenu {
    public void menu() throws IOException {
        Handling handling = new Handling();
        int chon;
        Scanner sc = new Scanner(System.in);
       do {
           System.out.println("1. Add new student");
           System.out.println("2. Save");
           System.out.println("3. Display all students");
           System.out.println("4. Exit");
           chon = sc.nextInt();
           switch (chon){
               case 1:
                   System.out.println("---Add new student---");
                   handling.addStudent();
                   break;
               case 2:
                   System.out.println("-----Save-----");
                   handling.save();
                   break;
               case 3:
                   System.out.println("---Display all students---");
                   handling.Display();
                   break;
               case 4:
                   System.out.println("-----Exit-----");
                   break;
               default:
                   System.out.println("Lựa chọn sai, vui lòng nhập số trong khoảng từ 1 đến 4.");
           }
       }while (chon != 4);
            System.out.println("Hẹn gặp lại.");

    }
}
