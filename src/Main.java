import com.bootcamp.domain.Course;
import com.bootcamp.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Mentoring mentoring = new Mentoring();

        course.setTitle("Pedro Academy");
        course.setDescription("Test description");
        course.setWorkLoad(10);

        mentoring.setTitle("OOP Java");
        mentoring.setDescription("Test description");
        mentoring.setDate(LocalDate.now());

        System.out.println(course);
        System.out.println(mentoring);
    }
}