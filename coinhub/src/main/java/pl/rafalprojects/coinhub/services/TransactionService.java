package pl.rafalprojects.coinhub.services;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;
import pl.rafalprojects.coinhub.models.Transaction;
import pl.rafalprojects.coinhub.repositories.TransactionRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository transactionRepository;


    public Iterable<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction getTransactionById( Long id) {
        Optional<Transaction> transaction = transactionRepository.findById(id);
        if(transaction.isPresent())
            return transaction.get();
        else
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
