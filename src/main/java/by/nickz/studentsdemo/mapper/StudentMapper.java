package by.nickz.studentsdemo.mapper;

import by.nickz.studentsdemo.dto.StudentDto;
import by.nickz.studentsdemo.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StudentMapper {

  @Mapping(target = "id", ignore = true)
  Student toEntity(StudentDto dto);
}
