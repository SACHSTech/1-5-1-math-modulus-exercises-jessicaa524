class Power extends ConsoleProgram {

  /**
  * Description
  * @author: H. Jessica
  */
  
  public void run() {
    
    Double dblBase;
    Double dblExponent;
    Double dblPower;

    dblBase = readDouble("Please enter the base: ");
    dblExponent = readDouble("Please enter the exponent: ");

    dblPower = Math.pow(dblBase , dblExponent);

    System.out.println(dblBase + " to the power of " + dblExponent + " is " +dblPower);
    
  }
}