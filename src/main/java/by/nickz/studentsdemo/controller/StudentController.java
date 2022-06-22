package by.nickz.studentsdemo.controller;

import by.nickz.studentsdemo.dto.StudentDto;
import by.nickz.studentsdemo.entity.Student;
import by.nickz.studentsdemo.service.StudentService;
import java.util.List;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

  private final StudentService studentService;

  @GetMapping
  public List<Student> getStudents() {
    return studentService.getStudents();
  }

  @PutMapping
  public Student addStudent(@RequestBody @Valid StudentDto studentDto) {
    return studentService.addStudent(studentDto);
  }

  @DeleteMapping("/{id}")
  public void deleteStudent(@PathVariable Integer id) {
    studentService.deleteStudent(id);
  }
}
