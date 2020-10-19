package kg.kanybek.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentResultDto {
    private Integer studentId;
    private String fullname;
    private Integer amount;
    private Boolean successful;
}
