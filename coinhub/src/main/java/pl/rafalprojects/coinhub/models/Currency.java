package pl.rafalprojects.coinhub.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.rafalprojects.coinhub.models.enums.Code;

@Getter
@Setter

public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Code code;
    private double exchangeRate;
}
