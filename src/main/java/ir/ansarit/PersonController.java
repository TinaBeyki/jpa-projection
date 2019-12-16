package ir.ansarit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ComponentScan("ir.ansarit")
@EnableJpaRepositories
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @GetMapping("detail")
    public List<PersonProjection> getPersonDetail(){
        return repository.getPersonDetail();
    }


}
