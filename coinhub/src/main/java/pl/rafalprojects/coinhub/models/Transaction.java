package pl.rafalprojects.coinhub.models;


import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import pl.rafalprojects.coinhub.models.enums.KindTransaction;

@Getter
@Setter
public class Transaction {
    private Long id;
    private double price;
    private String date;
    private String time;
    @Enumerated(EnumType.STRING)
    private KindTransaction kindTransaction;
}
