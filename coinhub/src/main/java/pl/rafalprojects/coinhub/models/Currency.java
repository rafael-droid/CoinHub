package pl.rafalprojects.coinhub.models;

import lombok.Getter;
import lombok.Setter;
import pl.rafalprojects.coinhub.models.enums.Code;

@Getter
@Setter
public class Currency {
    private Long id;
    private String name;
    private Code code;
    private double exchangeRate;
}
