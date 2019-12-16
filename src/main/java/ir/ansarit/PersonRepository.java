package ir.ansarit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.NamedNativeQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface PersonRepository extends JpaRepository<Person, Integer> {

    //@Query("select p.name as name , p.id as id from Person p ")
    @Query(value = "select name, id from Person", nativeQuery = true)
    List<PersonProjection> getPersonDetail();
}
