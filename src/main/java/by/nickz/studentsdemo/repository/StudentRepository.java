package by.nickz.studentsdemo.repository;

import by.nickz.studentsdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
