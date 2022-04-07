package com.van.dao;

import com.van.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private List<Person> people;
    private static int PEOPLE_COUNT;

    {
        people = new ArrayList<>();
        people.add(new Person(PEOPLE_COUNT++, "Ivan"));
        people.add(new Person(PEOPLE_COUNT++, "Lox"));
        people.add(new Person(PEOPLE_COUNT++, "kek"));
        people.add(new Person(PEOPLE_COUNT++, "pek"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
