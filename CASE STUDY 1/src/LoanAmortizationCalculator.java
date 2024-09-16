public class LoanAmortizationCalculator {
    private double principal;
    private double annualInterestRate;
    private int loanTermInYears;

    public LoanAmortizationCalculator(double principal, double annualInterestRate, int loanTermInYears) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.loanTermInYears = loanTermInYears;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getLoanTermInYears() {
        return loanTermInYears;
    }

    public void setLoanTermInYears(int loanTermInYears) {
        this.loanTermInYears = loanTermInYears;
    }

    public double calculateMonthlyPayment() {
        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        int numberOfMonths = loanTermInYears * 12;

        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    public double calculateTotalPayment() {
        return calculateMonthlyPayment() * loanTermInYears * 12;

    }

    public String toString(){
        return "Loan Details : \n" + "Principal : ₹" + principal +
                "\n" + "Annual InterestRate : " + annualInterestRate + "%" + "\n" +
                "Loan Term : "+ loanTermInYears + " years\n";

    }


}


