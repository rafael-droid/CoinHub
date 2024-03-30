package pl.rafalprojects.coinhub.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.rafalprojects.coinhub.models.enums.KindTransaction;

@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double price;
    private String date;
    private String time;
    @Enumerated(EnumType.STRING)
    private KindTransaction kindTransaction;
}
