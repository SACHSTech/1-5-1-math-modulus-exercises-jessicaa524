
class Km_to_Miles extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    double dblKm;
    double dblMiles;
    
    dblKm = readDouble("Please enter the distance in Km: ");

    dblMiles = dblKm * 0.621371; 

    System.out.println("The distance of " + dblKm + "Km converted to miles is " + dblMiles);
  }
}
