import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void convertTemperature(double value, char unit) {
        switch (unit) {
            case 'C':
                double fahrenheit = celsiusToFahrenheit(value);
                double kelvin = celsiusToKelvin(value);
                System.out.printf("%.2f°C is %.2f°F and %.2fK%n", value, fahrenheit, kelvin);
                break;
            case 'F':
                double celsiusFromF = fahrenheitToCelsius(value);
                double kelvinFromF = fahrenheitToKelvin(value);
                System.out.printf("%.2f°F is %.2f°C and %.2fK%n", value, celsiusFromF, kelvinFromF);
                break;
            case 'K':
                double celsiusFromK = kelvinToCelsius(value);
                double fahrenheitFromK = kelvinToFahrenheit(value);
                System.out.printf("%.2fK is %.2f°C and %.2f°F%n", value, celsiusFromK, fahrenheitFromK);
                break;
            default:
                System.out.println("Invalid unit of measurement. Please use 'C' for Celsius, 'F' for Fahrenheit, or 'K' for Kelvin.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature value: ");
        double value = scanner.nextDouble();
        System.out.print("Enter the unit of measurement (C/F/K): ");
        char unit = scanner.next().toUpperCase().charAt(0);
        convertTemperature(value, unit);
        scanner.close();
    }
}
