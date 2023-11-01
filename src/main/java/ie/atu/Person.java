package ie.atu;

import java.util.Scanner;

public class Person {
    private String name;
    private String email;
    private String course;


    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter Email: ");
        this.email = scanner.nextLine();

        System.out.print("Enter Course: ");
        this.course = scanner.nextLine();
    }


    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "  Email:" + email + "  Course: " + course);
    }
}