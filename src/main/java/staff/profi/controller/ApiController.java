package staff.profi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import staff.profi.entity.Student;
import staff.profi.service.api.StudentService;

import java.time.Month;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ApiController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    List<Student> getAll() {
        return studentService.getAllStudents();
    }

    @GetMapping("/add")
    void addStudent(@RequestParam("name") String name, @RequestParam("surname") String surname,
                    @RequestParam("patronymic") String patronymic, @RequestParam("birthDate") String birthDateString,
                    @RequestParam("group") String group) {
        String[] date = birthDateString.split("-");
        Date birthDate = new Date(Integer.parseInt(date[0]) - 1900, Integer.parseInt(date[1]) - 1, Integer.parseInt(date[2]));
        studentService.addStudent(name, surname, patronymic, birthDate, group);
    }

    @GetMapping("/delete")
    void deleteStudent(@RequestParam("id") Long id) {
        studentService.deleteStudentById(id);
    }
}
