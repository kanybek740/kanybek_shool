package kg.kanybek.school.service;

import kg.kanybek.school.dto.PaymentDto;
import kg.kanybek.school.dto.PaymentResultDto;
import kg.kanybek.school.entity.Payment;
import kg.kanybek.school.repository.PaymentRepository;
import kg.kanybek.school.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentRepository repository;
    private final StudentRepository studentRepository;

    public List<PaymentResultDto> getAllPayments() {
        var payments = repository.findAll();
        return payments
                .stream()
                .map(p -> new PaymentResultDto(p.getStudent().getId(), p.getStudent().getFullname(), p.getAmount(), p.getSuccessful()))
                .collect(Collectors.toList());
    }

    public void payment(PaymentDto paymentDto) {
        var student = studentRepository.getOne(paymentDto.getStudentId());
        var payment = new Payment();

        payment.setStudent(student);
        payment.setAmount(paymentDto.getAmount());
        payment.setSuccessful(true);

        repository.save(payment);
    }
}
