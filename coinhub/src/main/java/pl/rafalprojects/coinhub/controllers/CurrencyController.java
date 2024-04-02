package pl.rafalprojects.coinhub.controllers;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.rafalprojects.coinhub.services.CurrencyService;

@RestController
@RequestMapping("/coinhub/currency")
@RequiredArgsConstructor
public class CurrencyController {
    private final CurrencyService currencyService;

    public String getAllCurrency(){
        return  currencyService.getCurrencies();
    }

}
