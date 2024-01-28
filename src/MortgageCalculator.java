public class MortgageCalculator {
    public final static byte MONTHS_IN_YEAR = 12;
    public final static byte PERCENT = 100;

    private int principal;
    private double annualInterestRate;
    private int years;

    public MortgageCalculator(int principal, double annualInterestRate, int years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public  double calculateMortgage() {

        double monthlyInterest = getMonthlyInterest();
        double numberOfPayments = getNumberOfPayments();

        double m = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return m;
    }

    public double calculateBalance(int numberOfPaymentsMade) {

        double monthlyInterest = getMonthlyInterest();
        double numberOfPayments = getNumberOfPayments();

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

    private double getMonthlyInterest() {
        return annualInterestRate / PERCENT / MONTHS_IN_YEAR;
    }

    public int getYears() {
        return years;
    }
}
