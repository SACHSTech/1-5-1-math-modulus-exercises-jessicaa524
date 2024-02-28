class FtoC extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    double dblCelsius;
    double dblFahrenheit;

    dblFahrenheit = readDouble("Please enter the temperature in degrees Fahrenheit: ");

    dblCelsius = 5.0/9.0 * (dblFahrenheit - 32);

    System.out.println("Your degrees in Fahrenheit is converted to " + dblCelsius + " celsius");
    
  }
}