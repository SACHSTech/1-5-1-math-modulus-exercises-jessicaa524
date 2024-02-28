class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author: H. Jessica
  */
  
  public void run() {
    
  double dblRadius;
  double dblCircumference; 

  dblRadius = readDouble("Please enter the radius of your circle: ");
  
  dblCircumference = 2 * Math.PI * dblRadius;

  System.out.println("The circumference of your circle is: " + dblCircumference);
    
  }
}