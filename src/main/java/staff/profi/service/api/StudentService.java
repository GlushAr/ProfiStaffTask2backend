package staff.profi.service.api;

import staff.profi.entity.Student;

import java.util.Date;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    void addStudent(String name, String surname, String patronymic, Date birthDate, String group);
    void deleteStudentById(Long id);
}
