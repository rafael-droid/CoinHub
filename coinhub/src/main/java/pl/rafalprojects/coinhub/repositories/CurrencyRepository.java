package pl.rafalprojects.coinhub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rafalprojects.coinhub.models.Currency;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
