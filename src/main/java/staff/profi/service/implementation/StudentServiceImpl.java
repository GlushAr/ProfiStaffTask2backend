package staff.profi.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import staff.profi.entity.Student;
import staff.profi.repository.StudentRepository;
import staff.profi.service.api.StudentService;

import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void addStudent(String name, String surname, String patronymic, Date birthDate, String group) {
        studentRepository.save(new Student(name, surname, patronymic, birthDate, group));
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
