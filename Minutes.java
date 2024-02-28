class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    int intMinutes;
    int intDays;
    int intHours;
    int intMinutesLeft;

    intMinutes = readInt("Please enter the number of minutes: ");
    
    intDays = intMinutes / 1440;
    intMinutesLeft = intMinutes % 1440;

    intHours = intMinutesLeft / 60;
    intMinutesLeft = intMinutesLeft % 60;

    System.out.println(intMinutes + " minutes converted into days, hours and minutes is " + intDays + " days " + intHours + " hours and " + intMinutes + " minutes.");
    
  }
}