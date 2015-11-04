package edu.elon.invetment;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Ben Hay and Haris Cesko
 */
public class Investment implements Serializable {
    
        private double investmentAmount;
        private double yearlyInterestRate;
        private int numberOfYears;
        private double futureValue = 0;
        
        
        public Investment(){
            investmentAmount = 0;
            yearlyInterestRate = 0;
            numberOfYears = 0;
        }
        
         public Investment(double investmentAmount, double interestRate, int numberOfYears){
            this.investmentAmount = investmentAmount;
            this.yearlyInterestRate = interestRate;
            this.numberOfYears = numberOfYears;
        }
        
        public double getInvestmentAmount(){
            return investmentAmount;
        }
        
        public void setInvestmentAmmount(double investmentAmount){
            this.investmentAmount = investmentAmount;
        }
        
        public double getYearlyInterestRate(){
            return yearlyInterestRate;
        }
        
        public void setYearlyInterestRate(double yearlyInterestRate){
            this.yearlyInterestRate = yearlyInterestRate;
        }
        
        public int getnumberOfYears(){
            return numberOfYears;
        }
        
        public void setNumberOfYears(int numberOfYears){
            this.numberOfYears = numberOfYears;
        }
        
        public double getFutureValue(){
            return futureValue;
        }
        
        public void setFutureValue(double amount, double rate, int years){
            futureValue = seeFuture(amount, rate, years);
        }
        
        public String getInvestmentAmount$(){
           return this.showPriceInUSD(this.getInvestmentAmount());
        }
        
        public String getFutureValue$(){
           return this.showPriceInUSD(this.getFutureValue());
        }
        
        private String showPriceInUSD(double price){
            NumberFormat currencyFormat = 
                    NumberFormat.getCurrencyInstance(Locale.US);
            return currencyFormat.format(price);
            
        }
        
        private String showPriceInUSD(int price){
            NumberFormat currencyFormat = 
                    NumberFormat.getCurrencyInstance(Locale.US);
            return currencyFormat.format(price);   
        }
        
        public double seeFuture(double amount, double rate, int years){
            double interest = (Math.pow((rate/100 + 1), years)) * amount;
            return interest;
        }
}







