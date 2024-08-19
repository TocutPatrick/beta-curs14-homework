package org.beta.curs14.homework.exercise2;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private final List<Person> personList = new ArrayList<>();
    private Integer id;

    public PersonService() {
        this.id = 1;
    }

    public Person addPerson(String name, Integer age){
        Person person = new Person(id,name,age);
        id++;
        personList.add(person);
        return person;
    }


    public Person getPersonById(int i) {
        Person person = null;
        for (Person p : personList) {
            if (p.id().equals(i)) {
                person = p;
            }
        }
        return person;
    }
}
