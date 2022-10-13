 
package com.portfolioA.A.Draig.Interface;

import com.portfolioA.A.Draig.Entity.Person;
import java.util.List;


public interface IPersonService {
public List<Person> getPerson();

public void savePerson (Person person);

public void deletePerson (Long id);

public Person findPerson (Long id);
}
