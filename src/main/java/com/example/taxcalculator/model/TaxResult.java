package com.example.taxcalculator.model;

public class TaxResult {

    //attributes
    private double taxableIncome;
    private double federalTax;
    private double provincialTax;
    private double premiumCPPEI;
    private double totalTax;
    private double afterTaxRate;
    private double averageTaxRate;
    private double marginalTaxRate;

    //constructor
    public TaxResult(double taxableIncome, double federalTax, double provincialTax, double premiumCPPEI,
                     double totalTax, double afterTaxRate, double averageTaxRate, double marginalTaxRate) {
        this.taxableIncome = taxableIncome;
        this.federalTax = federalTax;
        this.provincialTax = provincialTax;
        this.premiumCPPEI = premiumCPPEI;
        this.totalTax = totalTax;
        this.afterTaxRate = afterTaxRate;
        this.averageTaxRate = averageTaxRate;
        this.marginalTaxRate = marginalTaxRate;
    }

    public TaxResult() {
    }

    //getters and setters
    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getFederalTax() {
        return federalTax;
    }

    public void setFederalTax(double federalTax) {
        this.federalTax = federalTax;
    }

    public double getProvincialTax() {
        return provincialTax;
    }

    public void setProvincialTax(double provincialTax) {
        this.provincialTax = provincialTax;
    }

    public double getPremiumCPPEI() {
        return premiumCPPEI;
    }

    public void setPremiumCPPEI(double premiumCPPEI) {
        this.premiumCPPEI = premiumCPPEI;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }

    public double getAfterTaxRate() {
        return afterTaxRate;
    }

    public void setAfterTaxRate(double afterTaxRate) {
        this.afterTaxRate = afterTaxRate;
    }

    public double getAverageTaxRate() {
        return averageTaxRate;
    }

    public void setAverageTaxRate(double averageTaxRate) {
        this.averageTaxRate = averageTaxRate;
    }

    public double getMarginalTaxRate() {
        return marginalTaxRate;
    }

    public void setMarginalTaxRate(double marginalTaxRate) {
        this.marginalTaxRate = marginalTaxRate;
    }
}
