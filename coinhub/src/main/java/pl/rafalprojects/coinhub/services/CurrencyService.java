package pl.rafalprojects.coinhub.services;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import pl.rafalprojects.coinhub.models.Currency;
import pl.rafalprojects.coinhub.repositories.CurrencyRepository;

@Service
@RequiredArgsConstructor
public class CurrencyService {


    public String getCurrencies() {
        return "działa";
    }
}
