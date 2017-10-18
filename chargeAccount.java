import java.util.Scanner;
import java.text.NumberFormat;
class chargeAccount
{   
    //initialise instance variables
    public double previousBalance;
    public double additionalCharges;
    public double minimumPayment;
    public double newBalance;
    public double interest;
    public void main(String[] args){
        //uses scanner to allow user to input previous balance and additional
        //charges
        getInput();
        computeNewBalance();
        
    }
    public void getInput(){
        Scanner scan = new Scanner(System.in); 
        System.out.print ("Enter the previous balance: ");
        previousBalance = scan.nextDouble();
        System.out.print ("Enter the total additional charges: ");
        additionalCharges = scan.nextDouble();
    }
    public void computeNewBalance(){
        interest = 0;
        //takes previous balance and additional charges as parameters,
        //interest based on sum of balance and charges,
        //and returns the new Balance after adding the three
        double balanceAndCharges = previousBalance + additionalCharges;
        if(balanceAndCharges > 0){
            interest = balanceAndCharges * 0.02;
        }
        newBalance = (balanceAndCharges + interest);
        }
    public double computeMinimumPayment(){
        //initializes temporary variable minPay
        double minPay;
        //determines minimum payment based on the value of newBalance
        if(newBalance > 300){
             minPay = newBalance * 0.2;
        }
        else if(newBalance > 50){
             minPay = 50.00;
        }
        else{
            minPay = newBalance;
        }
        return (minPay);
    }
    public void printStatement(){
    
    }
}