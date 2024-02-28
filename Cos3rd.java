class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    double dblSideA;
    double dblSideB;
    double dblSideC;
    double dblAngleC;

    dblSideA = readDouble("Please enter the length of side A: ");
    dblSideB = readDouble("Please enter length of side B: ");
    dblAngleC = readDouble("Please enter the contained angle: ");

    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + (Math.pow( dblSideB, 2)) - 2 * dblSideA * dblSideB * Math.cos(Math.toRadians(dblAngleC)));

    System.out.println("The length of side C is " + dblSideC);

  }
}