public class Temperature implements Converter {
    @Override
    public void convertCelsiusToFahrenheit(double celsius) {
        System.out.println((celsius * 9 / 5) + 32);
    }

    @Override
    public void convertFahrenheitToCelsius(double fahrenheit) {
        System.out.println((fahrenheit - 32) * 5 / 9);
    }
}
