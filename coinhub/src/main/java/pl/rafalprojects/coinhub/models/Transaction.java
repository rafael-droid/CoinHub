package pl.rafalprojects.coinhub.models;


import lombok.Getter;
import lombok.Setter;
import pl.rafalprojects.coinhub.models.enums.KindTransaction;

@Getter
@Setter
public class Transaction {
    private int id;
    private double price;
    private String date;
    private String time;
    private KindTransaction kindTransaction;
}
