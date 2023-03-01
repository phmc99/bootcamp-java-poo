import com.bootcamp.domain.Bootcamp;
import com.bootcamp.domain.Course;
import com.bootcamp.domain.Dev;
import com.bootcamp.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setTitle("Pedro Academy");
        course.setDescription("Test description");
        course.setWorkLoad(10);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("OOP Java");
        mentoring.setDescription("Test description");
        mentoring.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setTitle("JavaCamp");
        bootcamp.setDescription("JavaCamp test description");
        bootcamp.getContents().add(course);
        bootcamp.getContents().add(mentoring);

        System.out.println("-".repeat(500));

        Dev developer = new Dev();
        developer.setName("Pedro");
        developer.bootcampEnroll(bootcamp);
        System.out.println("Pedro's Enrollments: " + developer.getContentsEnrolled());
        System.out.println("Pedro's Finished Contents: " + developer.getContentsFinished());

        System.out.println("-".repeat(500));

        developer.advance();
        System.out.println("Pedro's Enrollments: " + developer.getContentsEnrolled());
        System.out.println("Pedro's Finished Contents: " + developer.getContentsFinished());
        System.out.println("XP: " + developer.xpCalculate());

    }
}