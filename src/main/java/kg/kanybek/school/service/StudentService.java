package kg.kanybek.school.service;

import kg.kanybek.school.entity.Student;
import kg.kanybek.school.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;

    public Optional<Student> getFullname(Integer id) {
        return repository.findById(id);
    }

    public Integer create(String fullname) {
        var student = new Student();
        student.setFullname(fullname);
        return repository.save(student).getId();
    }
}
