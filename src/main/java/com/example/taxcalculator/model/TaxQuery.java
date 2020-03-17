package com.example.taxcalculator.model;

public class TaxQuery {

    //attributes
    private String province;
    private int id;
    private int employmentIncome;
    private int selfEmploymentIncome;
    private int capitalGain;
    private int eligibleDividend;
    private int ineligibleDividend;
    private int otherIncome;
    private int deductionRRSP;
    private int incomeTaxPaid;

    //constructor
    public TaxQuery(String province, int id, int employmentIncome, int selfEmploymentIncome, int capitalGain, int eligibleDividend,
                    int ineligibleDividend, int otherIncome, int deductionRRSP, int incomeTaxPaid) {
        this.province = province;
        this.id = id;
        this.employmentIncome = employmentIncome;
        this.selfEmploymentIncome = selfEmploymentIncome;
        this.capitalGain = capitalGain;
        this.eligibleDividend = eligibleDividend;
        this.ineligibleDividend = ineligibleDividend;
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

    public int getEmploymentIncome() {
        return employmentIncome;
    }

    public void setEmploymentIncome(int employmentIncome) {
        this.employmentIncome = employmentIncome;
    }

    public int getSelfEmploymentIncome() {
        return selfEmploymentIncome;
    }

    public void setSelfEmploymentIncome(int selfEmploymentIncome) {
        this.selfEmploymentIncome = selfEmploymentIncome;
    }

    public int getCapitalGain() {
        return capitalGain;
    }

    public void setCapitalGain(int capitalGain) {
        this.capitalGain = capitalGain;
    }

    public int getEligibleDividend() {
        return eligibleDividend;
    }

    public void setEligibleDividend(int eligibleDividend) {
        this.eligibleDividend = eligibleDividend;
    }

    public int getIneligibleDividend() {
        return ineligibleDividend;
    }

    public void setIneligibleDividend(int ineligibleDividend) {
        this.ineligibleDividend = ineligibleDividend;
    }

    public int getOtherIncome() {
        return otherIncome;
    }

    public void setOtherIncome(int otherIncome) {
        this.otherIncome = otherIncome;
    }

    public int getDeductionRRSP() {
        return deductionRRSP;
    }

    public void setDeductionRRSP(int deductionRRSP) {
        this.deductionRRSP = deductionRRSP;
    }

    public int getIncomeTaxPaid() {
        return incomeTaxPaid;
    }

    public void setIncomeTaxPaid(int incomeTaxPaid) {
        this.incomeTaxPaid = incomeTaxPaid;
    }
}
