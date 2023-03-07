package co.develhope.email2.students.services;

import co.develhope.email2.students.entities.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    static List<Student> students = Arrays.asList(
            new Student("1", "Vittoria", "Vassarotti", "vittoria.vassarotti@proton.me"),
            new Student("2", "Marco", "De Fenzo", "defenzomarco@gmail.com"),
            new Student("3", "Pino", "Daniele", "pino.daniele@gmail.com"),
            new Student("4", "Gianni", "Celeste", "gianni.celeste@gmail.com")
    );

    public Student getStudentById(String studentId) {
        Optional<Student> studentFromList = students.stream().filter(student -> student.getId().equals(studentId)).findAny();
        return studentFromList.isPresent() ? studentFromList.get() : null;
    }
}
