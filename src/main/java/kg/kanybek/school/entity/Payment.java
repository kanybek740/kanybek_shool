package kg.kanybek.school.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "successful")
    private Boolean successful;
}
