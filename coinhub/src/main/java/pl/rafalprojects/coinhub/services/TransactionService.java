package pl.rafalprojects.coinhub.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.rafalprojects.coinhub.models.Transaction;
import pl.rafalprojects.coinhub.repositories.TransactionRepository;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository transactionRepository;


    public Iterable<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction getTransactionById(Long id) {
        return transactionRepository.getReferenceById(id);
    }
}
