package com.example.taxcalculator.model;

public class AlbertaTax {
    final static double basicPersonalTaxCredit_AB = 19369;
    final static double incomeBracket_level1 = 131220;
    final static double incomeTaxRate_level1 = 0.1;
    final static double capitalGainTaxRate_level1 = 0.05;
    final static double dividendsTaxRate_level1 = 0.00;
    final static double incomeBracket_level2 = 157464;
    final static double incomeTaxRate_level2 = 0.12;
    final static double capitalGainTaxRate_level2 = 0.06;
    final static double dividendsTaxRate_level2 = 0.0276;
    final static double incomeBracket_level3 = 209952;
    final static double incomeTaxRate_level3 = 0.13;
    final static double capitalGainTaxRate_level3 = 0.065;
    final static double dividendsTaxRate_level3 = 0.0414;
    final static double incomeBracket_level4 = 314928;
    final static double incomeTaxRate_level4 = 0.14;
    final static double capitalGainTaxRate_level4 = 0.07;
    final static double dividendsTaxRate_level4 = 0.0552;
    final static double incomeTaxRate_level5 = 0.15;
    final static double capitalGainTaxRate_level5 = 0.075;
    final static double dividendsTaxRate_level5 = 0.069;

    public static double calculateAlbertaTax(TaxQuery taxQuery){
        double albertaTax = 0;
        double otherIncome = taxQuery.getEmploymentIncome()+ taxQuery.getSelfEmploymentIncome()+taxQuery.getOtherIncome();
        double capitalGainIncome = taxQuery.getCapitalGain();
        double dividendIncome = taxQuery.getEligibleDividend() + taxQuery.getNonEligibleDividend();

        if(otherIncome > basicPersonalTaxCredit_AB){
            if(otherIncome < incomeBracket_level1){
                albertaTax = albertaTax +(otherIncome*incomeTaxRate_level1);
            }else if (otherIncome < incomeBracket_level2){
                albertaTax = albertaTax + (incomeBracket_level1*incomeTaxRate_level1)
                        + ((otherIncome-incomeBracket_level1)*incomeTaxRate_level2);
            }else if (otherIncome < incomeBracket_level3){
                albertaTax = albertaTax + (incomeBracket_level1*incomeTaxRate_level1)
                        + (incomeBracket_level2-incomeBracket_level1)*incomeTaxRate_level2
                        + ((otherIncome-incomeBracket_level2)*incomeTaxRate_level3);
            }else if (otherIncome < incomeBracket_level4){
                albertaTax = albertaTax + (incomeBracket_level1*incomeTaxRate_level1)
                        + (incomeBracket_level2-incomeBracket_level1)*incomeTaxRate_level2
                        + (incomeBracket_level3-incomeBracket_level2)*incomeTaxRate_level3
                        + ((otherIncome-incomeBracket_level3)*incomeTaxRate_level4);
            }else{
                albertaTax = albertaTax + (incomeBracket_level1*incomeTaxRate_level1)
                        + (incomeBracket_level2-incomeBracket_level1)*incomeTaxRate_level2
                        + (incomeBracket_level3-incomeBracket_level2)*incomeTaxRate_level3
                        + (incomeBracket_level4-incomeBracket_level3)*incomeTaxRate_level4
                        + ((otherIncome-incomeBracket_level4)*incomeTaxRate_level5);
            }
            albertaTax = albertaTax - basicPersonalTaxCredit_AB *incomeTaxRate_level1;

        }else{
            albertaTax =0;
        }

        if(capitalGainIncome < incomeBracket_level1){
            albertaTax = albertaTax +(capitalGainIncome*capitalGainTaxRate_level1);
        }else if (capitalGainIncome < incomeBracket_level2){
            albertaTax = albertaTax + (incomeBracket_level1*capitalGainTaxRate_level1)
                    + ((capitalGainIncome-incomeBracket_level1)*capitalGainTaxRate_level2);
        }else if (capitalGainIncome < incomeBracket_level3){
            albertaTax = albertaTax + (incomeBracket_level1*capitalGainTaxRate_level1)
                    + (incomeBracket_level2-incomeBracket_level1)*capitalGainTaxRate_level2
                    + ((capitalGainIncome-incomeBracket_level2)*capitalGainTaxRate_level3);
        }else if (capitalGainIncome < incomeBracket_level4){
            albertaTax = albertaTax + (incomeBracket_level1*capitalGainTaxRate_level1)
                    + (incomeBracket_level2-incomeBracket_level1)*capitalGainTaxRate_level2
                    + (incomeBracket_level3-incomeBracket_level2)*capitalGainTaxRate_level3
                    + ((capitalGainIncome-incomeBracket_level3)*capitalGainTaxRate_level4);
        }else{
            albertaTax = albertaTax + (incomeBracket_level1*capitalGainTaxRate_level1)
                    + (incomeBracket_level2-incomeBracket_level1)*capitalGainTaxRate_level2
                    + (incomeBracket_level3-incomeBracket_level2)*capitalGainTaxRate_level3
                    + (incomeBracket_level4-incomeBracket_level3)*capitalGainTaxRate_level4
                    + ((capitalGainIncome-incomeBracket_level4)*capitalGainTaxRate_level5);
        }

        if(dividendIncome < incomeBracket_level1){
            albertaTax = albertaTax +(dividendIncome* dividendsTaxRate_level1);
        }else if (dividendIncome < incomeBracket_level2){
            albertaTax = albertaTax + (incomeBracket_level1* dividendsTaxRate_level1)
                    + ((dividendIncome-incomeBracket_level1)* dividendsTaxRate_level2);
        }else if (dividendIncome < incomeBracket_level3){
            albertaTax = albertaTax + (incomeBracket_level1* dividendsTaxRate_level1)
                    + (incomeBracket_level2-incomeBracket_level1)* dividendsTaxRate_level2
                    + ((dividendIncome-incomeBracket_level2)* dividendsTaxRate_level3);
        }else if (dividendIncome < incomeBracket_level4){
            albertaTax = albertaTax + (incomeBracket_level1* dividendsTaxRate_level1)
                    + (incomeBracket_level2-incomeBracket_level1)* dividendsTaxRate_level2
                    + (incomeBracket_level3-incomeBracket_level2)* dividendsTaxRate_level3
                    + ((dividendIncome-incomeBracket_level3)*dividendsTaxRate_level4);
        }else{
            albertaTax = albertaTax + (incomeBracket_level1* dividendsTaxRate_level1)
                    + (incomeBracket_level2-incomeBracket_level1)* dividendsTaxRate_level2
                    + (incomeBracket_level3-incomeBracket_level2)* dividendsTaxRate_level3
                    + (incomeBracket_level4-incomeBracket_level3)*dividendsTaxRate_level4
                    + ((dividendIncome-incomeBracket_level4)* dividendsTaxRate_level5);
        }

        return albertaTax;

    }
}
