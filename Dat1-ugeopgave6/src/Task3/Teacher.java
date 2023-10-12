package Task3;

import java.util.ArrayList;

public class Teacher extends Person {

    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();
    public Teacher(String name, ArrayList<String> canTeach){
        super(name);
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course) {
        if(canTeach.contains(course)){
            currentCourses.add(course);
            System.out.println(getName() + " has added this course");
            return true;
        } else {
            System.out.println("Cannot add the course because " + getName() + " is not qualified");
            return false;

        }

    }
}
