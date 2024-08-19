package org.beta.curs14.homework.exercise2;

public record Person(
        Integer id,
        String name,
        Integer age
) {


    public Person {
        if (age < 0 || age == null) {
            throw new InvalidAgeException();
        }
        if (name == null || name.isEmpty()) {
            throw new InvalidNameException();
        }
        if (id == null || id <= 0) {
            throw new InvalidIdException();
        }

    }
}
