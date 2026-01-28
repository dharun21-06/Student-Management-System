package test;

import bean.Student;
import exception.StudentDoesntExist;
import service.StudentManagementSystem;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sm = new StudentManagementSystem();
        int ch;
        do {
            System.out.println("Welcome To Student Management Portol");
            System.out.println("1---->Add Student");
            System.out.println("2---->Delete Student");
            System.out.println("3---->List of Students");
            System.out.println("4---->Update Student");
            System.out.println("5---->Find Topper");
            System.out.println("6---->Exit");
            System.out.println("Enter Your Choice : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Integer[] marks = new Integer[6];
                    System.out.println("Enter rollNo,Name,Address,subject,6 Marks ");
                    long rno = sc.nextLong();
                    String name = sc.next();
                    String address = sc.next();
                    String subject = sc.next();
                    for (int i = 0; i < 6; i++) {
                        System.out.println("Enter  " + (i + 1) + " Mark : ");
                        int m = sc.nextInt();
                        marks[i] = m;
                    }

                    Student s = new Student(rno, name, address, subject, marks);
                    if (sm.addStudent(s)) {
                        System.out.println("Student Record Added Successfully");
                    } else {
                        System.out.println("Student Record is Full");
                    }
                    break;
                case 2:
                    System.out.println("Enter Roll No to Delete :  ");
                    long rollno = sc.nextLong();
                    try {
                        sm.deleteStudent(rollno);
                        System.out.println("Student Deleted Successfully");
                    } catch (StudentDoesntExist se) {
                        System.out.println(se.getMessage());
                    }

                case 3:
                    System.out.println("Students List");
                    sm.listStudents();
                    break;
                case 4:

                    try {
                        Integer[] n_marks = new Integer[6];
                        System.out.println("Enter Student Roll No to Update");
                        long urno = sc.nextLong();

                        System.out.println("Enter New Name,Address,subject,6 Marks ");

                        String n_name = sc.next();
                        String n_address = sc.next();
                        String n_subject = sc.next();
                        for (int i = 0; i < 6; i++) {
                            System.out.println("Enter  " + (i + 1) + " Mark : ");
                            int m = sc.nextInt();
                            n_marks[i] = m;
                        }

                        Student ns = new Student(urno, n_name, n_address, n_subject, n_marks);
                        sm.updateStudent(urno, ns);
                    } catch (StudentDoesntExist se) {
                        System.out.println(se.getMessage());
                    }
                case 5:
                    sm.findTopper();

                    break;
                case 6:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;


            }
        } while (ch != 6);

    }
}
