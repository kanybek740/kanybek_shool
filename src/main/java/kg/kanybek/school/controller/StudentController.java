package kg.kanybek.school.controller;

import kg.kanybek.school.dto.CreateStudentDto;
import kg.kanybek.school.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<String> getStudent(@RequestParam("id") Integer studentId) {
        var student = studentService.getFullname(studentId);
        return student
                .map(value -> ResponseEntity.ok().body(value.getFullname()))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Integer create(@RequestBody CreateStudentDto student) {
        return studentService.create(student.getFullname());
    }
}
