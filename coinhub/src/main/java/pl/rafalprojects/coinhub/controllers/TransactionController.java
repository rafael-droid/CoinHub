package pl.rafalprojects.coinhub.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.rafalprojects.coinhub.models.Transaction;
import pl.rafalprojects.coinhub.services.TransactionService;

@RestController
@RequestMapping("/coinhub")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/transaction")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Iterable<Transaction> getAllTransaction(){
        return transactionService.getTransactions();

    }

}
