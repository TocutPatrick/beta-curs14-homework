import org.beta.curs14.homework.exercise2.InvalidAgeException;
import org.beta.curs14.homework.exercise2.InvalidIdException;
import org.beta.curs14.homework.exercise2.InvalidNameException;
import org.beta.curs14.homework.exercise2.Person;
import org.junit.jupiter.api.Test;


public class PersonTest {
    @Test
    public void testClassPersonInstantiation() {
        Person person = new Person(1, "Mircea", 34);
    }

    @Test
    public void testValidAge() {
        org.junit.jupiter.api.Assertions.assertThrows(InvalidAgeException.class, () -> new Person(1, "Mircea", -22));
    }

    @Test
    public void testIfNameIsNull() {
        org.junit.jupiter.api.Assertions.assertThrows(InvalidNameException.class, () -> new Person(1, null, 2));
    }

//  ?   @Test
//    public void testNullAge() {
//        org.junit.jupiter.api.Assertions.assertThrows(InvalidAgeException.class, () -> new Person(1, "Mircea", null));
//    }

    @Test
    public void testIfNameIsEmpty() {
        org.junit.jupiter.api.Assertions.assertThrows(InvalidNameException.class, () -> new Person(1, "", 3));
    }

    @Test
    public void testIfIdIsNull() {
        org.junit.jupiter.api.Assertions.assertThrows(InvalidIdException.class, () -> new Person(null, "Cornel", 4));
    }

    @Test
    public  void testIfIdIsValid(){
        org.junit.jupiter.api.Assertions.assertThrows(InvalidIdException.class, ()-> new Person(-3,"Mircea",22));
    }
}
