package kg.kanybek.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentDto {
    private Integer studentId;
    private Integer amount;
}
