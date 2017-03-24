package org.ipl.fun.dao;

import org.ipl.fun.model.Person;

/**
 * Created by Hardik on 24-03-2017.
 */
public interface PersonDao {

    void listPersons();

    void deletePerson(Long EmployeeID);

    Long addPerson(Person person);
}
