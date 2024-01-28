public class Mortgage {

    public static void main(String[] args) {

        int principal = (int) Console.readNumber("Principal: ", 1000,1000000);
        double annualInterestRate = Console.readNumber("Annual Interest Rate: ", 1, 30);
        int years = (int) Console.readNumber("Period: ",1 ,30);

        var calculator = new MortgageCalculator(principal,annualInterestRate,years);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }

}
