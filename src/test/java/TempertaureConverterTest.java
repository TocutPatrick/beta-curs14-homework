import org.assertj.core.api.Assertions;
import org.beta.curs14.homework.exercise1.TemperatureConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TempertaureConverterTest {
    @Test
    @DisplayName("Test if the class is instantieted")
    public void testInstantiationClass() {
        TemperatureConverter tempertaureConverter = new TemperatureConverter();
    }

    @Test
    @DisplayName("Test call method fahrenheittoCelsius")
    public void testCallMethodFahrenheittoCelsius() {
        TemperatureConverter.fahrenheitToCelsius(21.3);
    }

    @Test
    public void testMethodReturnsConvertedTemperature() {
        Double result = TemperatureConverter.fahrenheitToCelsius(0.0);
        Assertions.assertThat(result).isEqualTo(-17.77777777777778);
    }

    @Test
    @DisplayName("Test call method celsiusToFahrenheit")
    public void testCallMethodCelsiustoFahrenheit() {
        TemperatureConverter.celsiusToFahrenheit(21.3);
    }

    @Test
    public void testMethodCelsiustoFahrenheitReturnsConvertedTemperature() {
        Double result = TemperatureConverter.celsiusToFahrenheit(5);
        Assertions.assertThat(result).isEqualTo(41);
    }

}
