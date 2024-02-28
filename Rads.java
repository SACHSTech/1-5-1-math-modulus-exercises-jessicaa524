class Rads extends ConsoleProgram {

  /**
  * Description
  * @author: H. Jessica
  */
  
  public void run() {
    
    double dblDegrees;
    double dblRadians;
    
    dblDegrees = readDouble("Please enter the angle in degrees: ");

    dblRadians  = Math.toRadians(dblDegrees);
    
    System.out.println(dblDegrees + " degrees = " + dblRadians + " radians");
    
  }
}