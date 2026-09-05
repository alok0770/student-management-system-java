package studentManagementSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;


import static studentManagementSystem.Main.scanner;

public class StudentService {
    ArrayList<Student> students = new ArrayList<>();


    public void addStudent() {



        System.out.print("Enter Student name : ");
        String name = scanner.nextLine().toUpperCase();


        int rollNo =  getValidInt("-> Enter the roll number : ");

        int marks =  getValidInt("-> Enter the marks : ");


        System.out.print("Enter Branch : ");
        String branch = scanner.nextLine();

        Student newStudent = new Student(name, rollNo, marks, branch);
        students.add(newStudent);
        System.out.println();
        System.out.println("Student saved successfully !! \n");

    }

    public void searchStudent() {

        int rollNo =  getValidInt("-> Enter the roll number : ");


        boolean found = false;
        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getRollNo() == rollNo) {
                Student student = students.get(i);
                System.out.println(" Name : " + student.getName()
                        + "\n Roll No : " + student.getRollNo()
                        + "\n Marks : " + student.getMarks()
                        + "\n Branch : " + student.getBranch());
                System.out.println();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nStudent not exist : \n");
        }
    }


    public void showAll() {

        if (students.isEmpty()) {
            System.out.println("No Students found !! \n");
        } else {
            for (Student student : students) {
                System.out.println(" Name : " + student.getName()
                        + "\n Roll No : " + student.getRollNo()
                        + "\n Marks : " + student.getMarks()
                        + "\n Branch : " + student.getBranch());
                System.out.println();
            }
            System.out.println();
        }
    }


    public void deleteStudent() {


        int rollNo =  getValidInt("-> Enter the roll number : ");

        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNo() == rollNo) {
                students.remove(i);
                System.out.println("Student deleted successfully !! \n");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found : ");
        }
    }

    public static int getValidInt(String message){

        int value ;
        while(true){

            try{
                System.out.print(message);
                value = scanner.nextInt();
                scanner.nextLine();
                break;
            }catch (InputMismatchException e){
                System.out.println("Invalid Input !! ");
                scanner.nextLine();
            }
        }
        return value;
    }
}

