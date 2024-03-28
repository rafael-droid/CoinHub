package pl.rafalprojects.coinhub.services;

import org.springframework.stereotype.Service;
import pl.rafalprojects.coinhub.models.Transaction;
import pl.rafalprojects.coinhub.repositories.TransactionRepository;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Iterable<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }
}
