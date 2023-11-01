package ie.atu;

public class Main {
    public static void main(String[] args) {

        Person user = new Person();

        user.getUserInput();

        user.displayInfo();

        Person newPerson2 = new Person("John Doe");

        newPerson2.getUser2Input();
        newPerson2.displayInfo();

        Person newPerson = new Person("John Doe", "john@example.com", "Java Programming");

        newPerson.displayInfo();

    }
}