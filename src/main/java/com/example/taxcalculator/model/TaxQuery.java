package com.example.taxcalculator.model;

public class TaxQuery {

    //attributes
    private String province;
    private int id;
    private double employmentIncome;
    private double selfEmploymentIncome;
    private double capitalGain;
    private double eligibleDividend;
    private double nonEligibleDividend;
    private double otherIncome;
    private double deductionRRSP;
    private double incomeTaxPaid;

    //constructors


    public TaxQuery(String province, int id, double employmentIncome, double selfEmploymentIncome, double capitalGain,
                    double eligibleDividend, double nonEligibleDividend, double otherIncome, double deductionRRSP, double incomeTaxPaid) {
        this.province = province;
        this.id = id;
        this.employmentIncome = employmentIncome;
        this.selfEmploymentIncome = selfEmploymentIncome;
        this.capitalGain = capitalGain;
        this.eligibleDividend = eligibleDividend;
        this.nonEligibleDividend = nonEligibleDividend;
        this.otherIncome = otherIncome;
        this.deductionRRSP = deductionRRSP;
        this.incomeTaxPaid = incomeTaxPaid;
    }

    public TaxQuery() {
    }

    //getters and setters
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getEmploymentIncome() {
        return employmentIncome;
    }

    public void setEmploymentIncome(double employmentIncome) {
        this.employmentIncome = employmentIncome;
    }

    public double getSelfEmploymentIncome() {
        return selfEmploymentIncome;
    }

    public void setSelfEmploymentIncome(double selfEmploymentIncome) {
        this.selfEmploymentIncome = selfEmploymentIncome;
    }

    public double getCapitalGain() {
        return capitalGain;
    }

    public void setCapitalGain(double capitalGain) {
        this.capitalGain = capitalGain;
    }

    public double getEligibleDividend() {
        return eligibleDividend;
    }

    public void setEligibleDividend(double eligibleDividend) {
        this.eligibleDividend = eligibleDividend;
    }

    public double getNonEligibleDividend() {
        return nonEligibleDividend;
    }

    public void setNonEligibleDividend(double nonEligibleDividend) {
        this.nonEligibleDividend = nonEligibleDividend;
    }

    public double getOtherIncome() {
        return otherIncome;
    }

    public void setOtherIncome(double otherIncome) {
        this.otherIncome = otherIncome;
    }

    public double getDeductionRRSP() {
        return deductionRRSP;
    }

    public void setDeductionRRSP(double deductionRRSP) {
        this.deductionRRSP = deductionRRSP;
    }

    public double getIncomeTaxPaid() {
        return incomeTaxPaid;
    }

    public void setIncomeTaxPaid(double incomeTaxPaid) {
        this.incomeTaxPaid = incomeTaxPaid;
    }
}
