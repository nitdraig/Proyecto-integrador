
package com.portfolioA.A.Draig.Service;

import com.portfolioA.A.Draig.Entity.Person;
import com.portfolioA.A.Draig.Interface.IPersonService;
import com.portfolioA.A.Draig.Repository.IPersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonService implements IPersonService{

    @Autowired IPersonRepository ipersonRepository;
    
    @Override
    public List<Person> getPerson() {
        List<Person> person = ipersonRepository.findAll();
                return person;
    }

    @Override
    public void savePerson(Person person) {
       ipersonRepository.save(person) ;
               }

    @Override
    public void deletePerson(Long id) {
       ipersonRepository.deleteById(id);
    }

    @Override
    public Person findPerson(Long id) {
       Person person = ipersonRepository.findById(id).orElse(null);
       return person;
    }
    
}
