import java.util.Scanner;

public class Mortgage {

    public static void main(String[] args) {
    //Scanner for user/keyboard input, scanner util imported above
        Scanner keyboard = new Scanner(System.in);

    //Loan Calculation Variables - declarations
        double loanAmount = 0;
        double interestRate= 0;
        double monthlyPayment = 0;
        double balance = 0;
        int cp = 0;
        int loanTerm;

        System.out.printf("Enter the loan amount: ");
        loanAmount = keyboard.nextDouble();


        System.out.printf("Enter the interest rate on the loan: ");
        interestRate = keyboard.nextDouble();

        System.out.printf("Enter the term (years) for the loan payment: ");
        loanTerm = keyboard.nextInt();

        System.out.println("\n======================================");
        keyboard.close();

        //Method declaration/initialization..a little confused on verbiage use to describe below
        monthlyPayment = getMonthlyPayment(loanAmount, interestRate, loanTerm;
        balance = -(monthlyPayment*(loanTerm*12));

        //Used to display/show format what's owed and monthly payment
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ");
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ");
    }

    //Method used to calculate loan payment
    public static double getMonthlyPayment(double loanAmount, double interestRate, int loanTerm) {
        double rate = (interestRate / 100) / 12;
        double base = (rate + 1);
        double months = loanTerm * 12;
        double result = 0.0;
        result = 1* (rate * (Math.pow(base, months)) / Math.pow(base, months));

        return result;
    }
}