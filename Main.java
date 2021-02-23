import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // Initiate Scanner
    Scanner scan = new Scanner(System.in);

    // Asks user for current balance
    System.out.println("How much money do you have right now?");
    double startMon = scan.nextDouble();

    // Asks user for their hourly pay
    System.out.println("What is your hourly pay?");
    double hourPay = scan.nextDouble();

    // Asks user for hours they work per week
    System.out.println("How many hours per week do you work?");
    int weekHours = scan.nextInt();

    // Asks user for amount of weeks to calculate pay for
    System.out.println("How many weeks do you want to work?");
    int week = scan.nextInt();

    // Calls method using variables received from scanner
    System.out.println("Your final balance is $" + balance(startMon, hourPay, weekHours, week, 0));
    
  }

  public static double balance(double startMoney, double hourlyPay, int weeklyHours, int weeks, double finalMoney) {
    // Base case
    if (weeks == 0) {
      // Final print statement at end of recursion
      return finalMoney;
    } else {
      // Variable initiations and changes for calculations
      double weeklyPay = hourlyPay * weeklyHours;
      startMoney = startMoney + weeklyPay;
      double newMoney = startMoney + weeklyPay;
      // Print statement for each recursion
      System.out.println("You will have $" + newMoney + " this week");
      weeks--;
      // Calls for recursion
      return balance(startMoney, hourlyPay, weeklyHours, weeks, newMoney);
    }
  }
}