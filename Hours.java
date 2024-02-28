class Hours extends ConsoleProgram {

  /**
  * Description
  * @author: H. Jessica
  */
  
  public void run() {
    
    int intHours;
    int intDays;
    int intHoursLeft;

    intHours = readInt("Please enter the number of hours: ");

    intDays = intHours / 24;

    intHoursLeft = intDays % 24;

    System.out.println(intHours + " converted into days and hours is " + intDays + " days and " + intHoursLeft + " hours.");


    
  }
}