package ie.atu;

import java.util.Scanner;

public class Person {
    private String name;
    private String email;
    private String course;

    public Person() {
        // You can choose to initialize variables here or leave them empty
        this.name = "";
        this.email = "";
        this.course = "";
    }

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter Email: ");
        this.email = scanner.nextLine();

        System.out.print("Enter Course: ");
        this.course = scanner.nextLine();
    }

    //Getters and setters
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


    //Display Info
    public void displayInfo() {
        System.out.println("Name: " + name + "  Email:" + email + "  Course: " + course);
    }


    public Person(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public Person(String name) {
        this.name = name;
        this.email = "";
        this.course = "";
    }

    public void getUser2Input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Email: ");
        this.email = scanner.nextLine();

        System.out.print("Enter Course: ");
        this.course = scanner.nextLine();
    }
}

