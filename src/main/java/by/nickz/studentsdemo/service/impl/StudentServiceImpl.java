package by.nickz.studentsdemo.service.impl;

import by.nickz.studentsdemo.dto.StudentDto;
import by.nickz.studentsdemo.entity.Student;
import by.nickz.studentsdemo.exception.ResourceNotFoundException;
import by.nickz.studentsdemo.mapper.StudentMapper;
import by.nickz.studentsdemo.repository.StudentRepository;
import by.nickz.studentsdemo.service.StudentService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

  private final StudentRepository studentRepository;
  private final StudentMapper studentMapper;


  @Override
  public List<Student> getStudents() {
    return studentRepository.findAll();
  }

  @Override
  public Student addStudent(StudentDto studentDto) {
    Student student = studentMapper.toEntity(studentDto);
    return studentRepository.save(student);
  }

  @Override
  public void deleteStudent(Integer id) {
    if (!studentRepository.existsById(id)) {
      throw new ResourceNotFoundException("Student with id " + id + " doesn't exist.");
    }
    studentRepository.deleteById(id);
  }
}
