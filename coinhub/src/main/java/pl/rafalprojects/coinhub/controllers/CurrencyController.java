package pl.rafalprojects.coinhub.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rafalprojects.coinhub.models.Currency;
import pl.rafalprojects.coinhub.services.CurrencyService;

@RestController
@RequestMapping("/coinhub/currency")
@RequiredArgsConstructor
public class CurrencyController {
    private final CurrencyService currencyService;

    public Iterable<Currency> getAllCurrency(){
        return  currencyService.getCurrencies();
    }

}
