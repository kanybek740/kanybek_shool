package kg.kanybek.school.repository;

import kg.kanybek.school.entity.Payment;
import kg.kanybek.school.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
