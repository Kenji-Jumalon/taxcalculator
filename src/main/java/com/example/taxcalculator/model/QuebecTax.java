package com.example.taxcalculator.model;

public class QuebecTax {
    final static double basicPersonalTaxCredit_QB = 15269;
    final static double incomeTaxRate_level1 = 0.15;
    final static double incomeBracket_level1 = 43790;
    final static double capitalGainTaxRate_level1 = 0.075;
    final static double dividendsTaxRate_level1 = 0.0442;
    final static double incomeBracket_level2 = 87575;
    final static double incomeTaxRate_level2 = 0.20;
    final static double capitalGainTaxRate_level2 = 0.10;
    final static double dividendsTaxRate_level2 = 0.1132;
    final static double incomeBracket_level3 = 106555;
    final static double incomeTaxRate_level3 = 0.24;
    final static double capitalGainTaxRate_level3 = 0.12;
    final static double dividendsTaxRate_level3 = 0.2951;
    final static double incomeBracket_level4 = 106556; //over
    final static double incomeTaxRate_level4 = 0.2575;
    final static double capitalGainTaxRate_level4 = 0.1288;
    final static double dividendsTaxRate_level4 = 0.3193;

    public static double calculateQuebecTax(TaxQuery taxQuery) {

        double quebecTax = 0;
        double otherIncome = taxQuery.getEmploymentIncome()+ taxQuery.getSelfEmploymentIncome()+taxQuery.getOtherIncome();
        double capitalGainIncome = taxQuery.getCapitalGain();
        double dividendIncome = taxQuery.getEligibleDividend() + taxQuery.getNonEligibleDividend();

        if (otherIncome > basicPersonalTaxCredit_QB) {
            if (otherIncome < incomeBracket_level1){
                quebecTax = quebecTax + (otherIncome * incomeTaxRate_level1);
            }else if (otherIncome < incomeBracket_level2) {
                quebecTax = quebecTax + (otherIncome * incomeTaxRate_level2)
                        + ((otherIncome-incomeBracket_level1)*incomeTaxRate_level2);
            }else if (otherIncome < incomeBracket_level3) {
                quebecTax = quebecTax + (otherIncome * incomeTaxRate_level3)
                        + (incomeBracket_level2-incomeBracket_level1)*incomeTaxRate_level2
                        + ((otherIncome-incomeBracket_level2)*incomeTaxRate_level3);
            }else  {
                quebecTax = quebecTax + (incomeBracket_level1*incomeTaxRate_level1)
                        + (incomeBracket_level2-incomeBracket_level1)*incomeTaxRate_level2
                        + (incomeBracket_level3-incomeBracket_level2)*incomeTaxRate_level3
                        + ((otherIncome-incomeBracket_level3)*incomeTaxRate_level4);
            }
            quebecTax = quebecTax - basicPersonalTaxCredit_QB *incomeTaxRate_level1;

        }

        else {
             quebecTax = 0;
        }

        if (capitalGainIncome < incomeBracket_level1) {
            quebecTax = quebecTax + (capitalGainIncome * capitalGainTaxRate_level1);
        }else if (capitalGainIncome < incomeBracket_level2){
            quebecTax = quebecTax + (incomeBracket_level1 * capitalGainTaxRate_level1)
                    + ((capitalGainIncome - incomeBracket_level1) * capitalGainTaxRate_level2);
        }else if (capitalGainIncome < incomeBracket_level3) {
            quebecTax = quebecTax + (incomeBracket_level1 * capitalGainTaxRate_level1)
                    + (incomeBracket_level2 - incomeBracket_level1) * capitalGainTaxRate_level2
                    + ((capitalGainIncome - incomeBracket_level2) * capitalGainTaxRate_level3);
        }else {
            quebecTax = quebecTax + (incomeBracket_level1*capitalGainTaxRate_level1)
                    + (incomeBracket_level2-incomeBracket_level1)*capitalGainTaxRate_level2
                    + (incomeBracket_level3-incomeBracket_level2)*capitalGainTaxRate_level3
                    + ((capitalGainIncome-incomeBracket_level3)*capitalGainTaxRate_level4);
        }

        if (dividendIncome < incomeBracket_level1) {
            quebecTax = quebecTax + (dividendIncome * dividendsTaxRate_level1);
        }else if (dividendIncome < incomeBracket_level2){
            quebecTax = quebecTax + (incomeBracket_level1* dividendsTaxRate_level1)
                    + ((dividendIncome-incomeBracket_level1)* dividendsTaxRate_level2);
        }else if (dividendIncome < incomeBracket_level3) {
            quebecTax = quebecTax + (incomeBracket_level1 * dividendsTaxRate_level1)
                    + (incomeBracket_level2 - incomeBracket_level1) * dividendsTaxRate_level2
                    + ((dividendIncome - incomeBracket_level2) * dividendsTaxRate_level3);
        }else {
            quebecTax = quebecTax + (incomeBracket_level1 * dividendsTaxRate_level1)
            + (incomeBracket_level2 - incomeBracket_level1) * dividendsTaxRate_level2
            + (incomeBracket_level3 - incomeBracket_level2) * dividendsTaxRate_level3
            + ((dividendIncome - incomeBracket_level3) * dividendsTaxRate_level4);
        }

    return quebecTax;
    }

}
