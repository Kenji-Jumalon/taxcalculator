package com.example.taxcalculator.model;

public class SaskatchewanTax {
    //https://www.taxtips.ca/taxrates/mb.htm
    //http://www.creditcardnerd.ca/tax-rates/2016/manitoba.htm
    final static double basicPersonalTaxCredit_SK = 16065;
    final static double incomeTaxRate_level1 = 0.105;
    final static double incomeBracket_level1 = 45225;
    final static double capitalGainTaxRate_level1 = 0.0525;
    final static double dividendsTaxRate_level1 = 0;
    final static double incomeBracket_level2 = 129214;
    final static double incomeTaxRate_level2 = 0.1250;
    final static double capitalGainTaxRate_level2 = 0.0625;
    final static double dividendsTaxRate_level2 = 0.0204; //need to check
    final static double incomeBracket_level3 = 129215; //over
    final static double incomeTaxRate_level3 = 0.1450;
    final static double capitalGainTaxRate_level3 = 0.0725;
    final static double dividendsTaxRate_level3 = 0.1980;

    public static double calculateSaskachewanTax(TaxQuery taxQuery) {
        double saskatchewanTax = 0;
        double otherIncome = taxQuery.getEmploymentIncome()+ taxQuery.getSelfEmploymentIncome()+taxQuery.getOtherIncome();
        double capitalGainIncome = taxQuery.getCapitalGain();
        double dividendIncome = taxQuery.getEligibleDividend() + taxQuery.getNonEligibleDividend();

        if (otherIncome > basicPersonalTaxCredit_SK){
            if (otherIncome < incomeBracket_level1){
                saskatchewanTax = saskatchewanTax + (otherIncome * incomeTaxRate_level1);
            }else if (otherIncome < incomeBracket_level2) {
                saskatchewanTax = saskatchewanTax + (otherIncome * incomeTaxRate_level2)
                        + ((otherIncome-incomeBracket_level1)*incomeTaxRate_level2);
            }else {
                saskatchewanTax = saskatchewanTax + (otherIncome * incomeTaxRate_level3)
                        + (incomeBracket_level2-incomeBracket_level1)*incomeTaxRate_level2
                        + ((otherIncome-incomeBracket_level2)*incomeTaxRate_level3);
            }
            saskatchewanTax = saskatchewanTax - basicPersonalTaxCredit_SK *incomeTaxRate_level1;

        }else {
            saskatchewanTax = 0;
        }

        if (capitalGainIncome < incomeBracket_level1) {
            saskatchewanTax = saskatchewanTax + (capitalGainIncome * capitalGainTaxRate_level1);
        }else if (capitalGainIncome < incomeBracket_level2){
            saskatchewanTax = saskatchewanTax + (incomeBracket_level1 * capitalGainTaxRate_level1)
                    + ((capitalGainIncome - incomeBracket_level1) * capitalGainTaxRate_level2);
        }else {
            saskatchewanTax = saskatchewanTax + (incomeBracket_level1 * capitalGainTaxRate_level1)
                    + (incomeBracket_level2 - incomeBracket_level1) * capitalGainTaxRate_level2
                    + ((capitalGainIncome - incomeBracket_level2) * capitalGainTaxRate_level3);
        }

        if (dividendIncome < incomeBracket_level1) {
            saskatchewanTax = saskatchewanTax + (dividendIncome * dividendsTaxRate_level1);
        }else if (dividendIncome < incomeBracket_level2){
            saskatchewanTax = saskatchewanTax + (incomeBracket_level1* dividendsTaxRate_level1)
                    + ((dividendIncome-incomeBracket_level1)* dividendsTaxRate_level2);
        }else {
            saskatchewanTax = saskatchewanTax + (incomeBracket_level1 * dividendsTaxRate_level1)
                    + (incomeBracket_level2 - incomeBracket_level1) * dividendsTaxRate_level2
                    + ((dividendIncome - incomeBracket_level2) * dividendsTaxRate_level3);
        }

        return saskatchewanTax;
    }



}
