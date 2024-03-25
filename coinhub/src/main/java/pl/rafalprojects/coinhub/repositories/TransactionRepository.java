package pl.rafalprojects.coinhub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rafalprojects.coinhub.models.Transaction;

import java.nio.file.LinkOption;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
