package pl.mateusz.Pecuniaspringtest.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.mateusz.Pecuniaspringtest.models.Country;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

//    @Query(value = "SELECT cou FROM country cou")
//    List<Country> countries();

//    List<Country> findAll();


}
