package com.example.taxcalculator.model;

public class TaxResult {

    //attributes
    private int totalIncome;
    private int federalTax;
    private int provincialTax;
    private int premiumCPPEI;
    private int totalTax;
    private int afterTaxRate;
    private float averageTaxRate;
    private float marginalTaxRate;

    //constructor
    public TaxResult(int totalIncome, int federalTax, int provincialTax, int premiumCPPEI, int totalTax, int afterTaxRate,
                     float averageTaxRate, float marginalTaxRate) {
        this.totalIncome = totalIncome;
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
    public int getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(int totalIncome) {
        this.totalIncome = totalIncome;
    }

    public int getFederalTax() {
        return federalTax;
    }

    public void setFederalTax(int federalTax) {
        this.federalTax = federalTax;
    }

    public int getProvincialTax() {
        return provincialTax;
    }

    public void setProvincialTax(int provincialTax) {
        this.provincialTax = provincialTax;
    }

    public int getPremiumCPPEI() {
        return premiumCPPEI;
    }

    public void setPremiumCPPEI(int premiumCPPEI) {
        this.premiumCPPEI = premiumCPPEI;
    }

    public int getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(int totalTax) {
        this.totalTax = totalTax;
    }

    public int getAfterTaxRate() {
        return afterTaxRate;
    }

    public void setAfterTaxRate(int afterTaxRate) {
        this.afterTaxRate = afterTaxRate;
    }

    public float getAverageTaxRate() {
        return averageTaxRate;
    }

    public void setAverageTaxRate(float averageTaxRate) {
        this.averageTaxRate = averageTaxRate;
    }

    public float getMarginalTaxRate() {
        return marginalTaxRate;
    }

    public void setMarginalTaxRate(float marginalTaxRate) {
        this.marginalTaxRate = marginalTaxRate;
    }
}
