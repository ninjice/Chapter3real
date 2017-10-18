
// ***************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class Salary
{
   public static void main (String[] args)
   {
           double currentSalary;  // employee's current  salary
           double raise;              // amount of the raise
           double newSalary;          // new salary for the employee
           String rating;             // performance rating
           // An employee who is rated excellent will receive a 6% raise, one rated good will receive a 4% raise, and one rated poor will receive a 1.5% raise.
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter the current salary: ");
           currentSalary = scan.nextDouble();
           System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
           rating = scan.next();
 
           // Compute the raise using if ...
           raise = checkPerformance(rating, currentSalary);
           newSalary = currentSalary + raise;
 
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println();
           System.out.println("Current Salary:           " + money.format(currentSalary));
           System.out.println("Amount of your raise: " + money.format(raise));
           System.out.println("Your new salary:          " + money.format(newSalary));
           System.out.println();
        }
   public static double checkPerformance(String rating, double salary){
       if(rating == "Excelent"){
           return(salary * 0.06); 
           }
           else if(rating == "Good"){
           return(salary * 0.04);
           }
       else{
           return(salary * 0.015);
       }
   } 
}