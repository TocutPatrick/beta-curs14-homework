package org.beta.curs14.homework.exercise1;

public class TemperatureConverter {
    public static double fahrenheitToCelsius(double temperature) {
        return (temperature - 32) * (double) 5 / 9;
    }

    public static double celsiusToFahrenheit(double temperature) {
        return (double) temperature *  9 / 5 + 32;
    }
}
