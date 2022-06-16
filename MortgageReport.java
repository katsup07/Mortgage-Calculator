package com.katsup;
import java.text.NumberFormat;

public class MortgageReport {
  private MortgageCalculator calculator;
  private final NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();

  public MortgageReport(MortgageCalculator calculator) {
    this.calculator = calculator;
  }

  public void printPaymentSchedule() {
    System.out.println();
    System.out.println("PAYMENT SCHEDULE");
    System.out.println("----------------");
    double[] balances = calculator.getRemainingBalances();
    for (double balance : balances)
      System.out.println(currencyInstance.format(balance));
  }

  public void printMortgage() {
    double mortgage = calculator.calculateMortgage();
    String mortgageFormatted = currencyInstance.format(mortgage);
    System.out.println();
    System.out.println("MORTGAGE");
    System.out.println("--------");
    System.out.println("Monthly Payments: " + mortgageFormatted);
  }

}
