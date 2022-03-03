public class TemperatureConversion {
    public static void main(String[] args) {
        //Create a new branch and check it out
        //Create a new class named "TemperatureConversion"
        //
        //In your main method:
        //    double temperatureInCelsius
        //
        //Write a method:
        //    public static double celsiusToFahrenheit(double temperatureInCelsius)
        //    in this method convert degrees Celsius into Fahrenheit (look up the formula online)
        //
        //In your main method:
        //    call your conversion method
        //    write to the console: "X degrees Celsius are Y degrees Fahrenheit"
        //
        //Bonus: write a second method that converts degrees Fahrenheit into Celsius!
        //Merge your changes & check out what your partner did
        //°F = °C * 1,8 + 32

        double celsius;

        System.out.println("24 degrees Celsius are " + temperatureInCelsius(celsius = 24) + " degrees Fahrenheit");

        double fahr = 22;
        System.out.println((fahr) + (" Fahrenheit are ") + (fahrenheitInCelsius(fahr)) + " in Celsius");
    }

    public static double temperatureInCelsius(double celsius) {
        return celsius * 1.8 + 32;
    }

    //Example: (30°C x 1.8) + 32 = 86°F
    public static double fahrenheitInCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
