import org.assertj.core.api.Assertions;
import org.beta.curs14.homework.exercise2.Person;
import org.beta.curs14.homework.exercise2.PersonNotFoundException;
import org.beta.curs14.homework.exercise2.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonServiceTest {


    private PersonService personService;

    @BeforeEach
    public void setUp(){
        personService = new PersonService();
    }


    @Test
    public void testAddPerson() {
        Person person = personService.addPerson( "Marc", 5);
        Assertions.assertThat(person.id()).isEqualTo(1);
        Assertions.assertThat(person.name()).isEqualTo("Marc");
        Assertions.assertThat(person.age()).isEqualTo(5);
    }

    @Test
    public void testGetPersonById(){
        Person person = personService.addPerson("Marc", 6);
        Person result = personService.getPersonById(1);
        Assertions.assertThat(result.name()).isEqualTo("Marc");
        Assertions.assertThat(result.age()).isEqualTo(6);
    }

    @Test
    public void testIfPersonByIdIsNotFoundInList(){
        Person person = personService.addPerson("Marc", 6);
        Person result = personService.getPersonById(3);
        org.junit.jupiter.api.Assertions.assertThrows(PersonNotFoundException.class, ()-> result.name().isEmpty());
    }
}
