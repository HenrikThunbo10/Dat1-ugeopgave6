package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> passedCourses = new ArrayList<>();
        Student Student1 = new Student("Henrik");
        Student1.addHasPassed("Dan A");
        Student1.addHasPassed("Java 1.0");


        Student Student2 = new Student("Peter");
        Student2.addHasPassed("Idr B");


        ArrayList<String> canTeach = new ArrayList<>();
        Teacher Teacher1 = new Teacher("Signe", canTeach);
        Teacher1.addCourse("Datamatiker");
        Teacher1.addCourse("Java 1.0");


        Teacher Teacher2 = new Teacher("Tess", canTeach);
        Teacher2.addCourse("Datamatiker");

        ArrayList<Person> Persons = new ArrayList<>();
        Persons.add(Student1);
        Persons.add(Student2);
        Persons.add(Teacher1);
        Persons.add(Teacher2);

        for (int i = 0; i > Persons.size(); i++) {
        Persons.get(i).addCourse("Java 1.0");
        }

    }
}
