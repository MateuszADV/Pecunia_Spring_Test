package pl.mateusz.Pecuniaspringtest.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mateusz.Pecuniaspringtest.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
