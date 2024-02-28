class AreaSin extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblArea;

    dblSideA = readDouble("Please enter side A of triangle: ");
    dblSideB = readDouble("Please enter side B of triangle: ");
    dblAngleC = readDouble("Please enter the contained angle of side A and B: ");

    dblArea = (dblSideA * dblSideB * Math.sin(Math.toRadians(dblAngleC))) / 2; 

    System.out.println("The area of the triangle is: " + dblArea);

    
  }
}