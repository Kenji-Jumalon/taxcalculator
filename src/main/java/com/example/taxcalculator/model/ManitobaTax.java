package com.example.taxcalculator.model;

public class ManitobaTax {
    //https://www.taxtips.ca/taxrates/mb.htm
    //http://www.creditcardnerd.ca/tax-rates/2016/manitoba.htm
    final static double basicPersonalTaxCredit_MB = 9626;
    final static double incomeTaxRate_level1 = 0.108;
    final static double incomeBracket_level1 = 32670;
    final static double capitalGainTaxRate_level1 = 0.054;
    final static double dividendsTaxRate_level1 = 0.0386;
    final static double incomeBracket_level2 = 70610;
    final static double incomeTaxRate_level2 = 0.1275;
    final static double capitalGainTaxRate_level2 = 0.06375;
    final static double dividendsTaxRate_level2 = 0.0656;
    final static double incomeBracket_level3 = 70611; //over
    final static double incomeTaxRate_level3 = 0.174;
    final static double capitalGainTaxRate_level3 = 0.087;
    final static double dividendsTaxRate_level3 = 0.1297;

    public static double calculateManitobaTax(TaxQuery taxQuery) {
        double manitobaTax = 0;
        double otherIncome = taxQuery.getEmploymentIncome()+ taxQuery.getSelfEmploymentIncome()+taxQuery.getOtherIncome();
        double capitalGainIncome = taxQuery.getCapitalGain();
        double dividendIncome = taxQuery.getEligibleDividend() + taxQuery.getNonEligibleDividend();

        //2019 informations
        if (otherIncome > basicPersonalTaxCredit_MB){
            if (otherIncome < incomeBracket_level1){
                manitobaTax = manitobaTax + (otherIncome * incomeTaxRate_level1);
            }else if (otherIncome < incomeBracket_level2) {
                manitobaTax = manitobaTax + (otherIncome * incomeTaxRate_level2)
                + ((otherIncome-incomeBracket_level1)*incomeTaxRate_level2);
            }else {
                manitobaTax = manitobaTax + (otherIncome * incomeTaxRate_level3)
                + (incomeBracket_level2-incomeBracket_level1)*incomeTaxRate_level2
                + ((otherIncome-incomeBracket_level2)*incomeTaxRate_level3);
            }
            manitobaTax = manitobaTax - basicPersonalTaxCredit_MB *incomeTaxRate_level1;

        }else {
            manitobaTax = 0;
        }

        if (capitalGainIncome < incomeBracket_level1) {
            manitobaTax = manitobaTax + (capitalGainIncome * capitalGainTaxRate_level1);
        }else if (capitalGainIncome < incomeBracket_level2){
            manitobaTax = manitobaTax + (incomeBracket_level1 * capitalGainTaxRate_level1)
                    + ((capitalGainIncome - incomeBracket_level1) * capitalGainTaxRate_level2);
        }else {
            manitobaTax = manitobaTax + (incomeBracket_level1 * capitalGainTaxRate_level1)
                    + (incomeBracket_level2 - incomeBracket_level1) * capitalGainTaxRate_level2
                    + ((capitalGainIncome - incomeBracket_level2) * capitalGainTaxRate_level3);
        }

        if (dividendIncome < incomeBracket_level1) {
            manitobaTax = manitobaTax + (dividendIncome * dividendsTaxRate_level1);
        }else if (dividendIncome < incomeBracket_level2){
            manitobaTax = manitobaTax + (incomeBracket_level1* dividendsTaxRate_level1)
                    + ((dividendIncome-incomeBracket_level1)* dividendsTaxRate_level2);
        }else {
            manitobaTax = manitobaTax + (incomeBracket_level1 * dividendsTaxRate_level1)
                    + (incomeBracket_level2 - incomeBracket_level1) * dividendsTaxRate_level2
                    + ((dividendIncome - incomeBracket_level2) * dividendsTaxRate_level3);
        }

        return manitobaTax;
    }

}
