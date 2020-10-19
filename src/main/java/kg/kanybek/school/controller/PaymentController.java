package kg.kanybek.school.controller;

import kg.kanybek.school.dto.PaymentDto;
import kg.kanybek.school.dto.PaymentResultDto;
import kg.kanybek.school.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @GetMapping
    public List<PaymentResultDto> getPayments() {
        return paymentService.getAllPayments();
    }

    @PostMapping
    public void payment(@RequestBody PaymentDto paymentDto) {
        paymentService.payment(paymentDto);
    }
}
