package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student();

        student.id = 1;
        student.firstname = "alice";
        student.lastname = "W.";

        System.out.println("Id: " + student.id);
        System.out.println("Firstname: " + student.firstname);
        System.out.println("Lastname: " + student.lastname);
    }
}
