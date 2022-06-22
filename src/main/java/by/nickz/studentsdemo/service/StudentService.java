package by.nickz.studentsdemo.service;

import by.nickz.studentsdemo.dto.StudentDto;
import by.nickz.studentsdemo.entity.Student;
import java.util.List;

public interface StudentService {

  List<Student> getStudents();

  Student addStudent(StudentDto studentDto);

  void deleteStudent(Integer id);
}
