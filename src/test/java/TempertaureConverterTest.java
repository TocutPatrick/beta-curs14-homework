import org.assertj.core.api.Assertions;
import org.beta.curs14.homework.TemperatureConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TempertaureConverterTest {
    @Test
    @DisplayName("Test if the class is instantieted")
    public void testInstantiationClass(){
        TemperatureConverter tempertaureConverter = new TemperatureConverter();
    }

    @Test
    @DisplayName("Test call method fahrenheittoCelsius")
    public void testCallMethod(){
        TemperatureConverter.fahrenheittoCelsius(21.3);
    }

    @Test
    public void testMethodReturnsConvertedTemperature(){
        Double result = TemperatureConverter.fahrenheittoCelsius(0);
        Assertions.assertThat(result).isEqualTo(-17.77777777777778);
    }
}
