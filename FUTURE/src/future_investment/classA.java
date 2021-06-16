package future_investment;

import java.util.Scanner;

import static future_investment.ClassB.futureInvestmentValue;

public class classA {
    // classA Method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the investment amount, interest rate and years
        System.out.print("\nThe amount invested: ");
        double Amount;
        Amount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double YearlyInterestRate;
        YearlyInterestRate = input.nextDouble();
        System.out.print("Enter the number of year: ");
        int NumYears;
        NumYears = input.nextInt();

        // Get monthly interest rate
        double monthlyInterestRate = YearlyInterestRate / 1200;

        // Print a table that displays future value for the years inputted by the user.
        System.out.println("Years     Future Value"); // Table header
        for (int years = 1; years <= NumYears; years++) {
            System.out.printf("%-10d", years);
            System.out.printf("%11.2f\n", futureInvestmentValue(Amount, monthlyInterestRate, years));
        }
    }
}
class ClassB {
    /** Method futureInvestmentValue computes future investment value */
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
    {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
