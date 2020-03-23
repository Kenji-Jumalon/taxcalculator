package com.example.taxcalculator.model;

public class FederalTax {
    final static double basicPersonalTaxCredit = 12069;
    final static double incomeBracket_level1 = 47630;
    final static double incomeTaxRate_level1 = 0.15;
    final static double capitalGainTaxRate_level1 = 0.075;
    final static double eligibleDividendsTaxRate_level1 = -0.0003;
    final static double nonEligibleDividendsTaxRate_level1 = 0.0687;
    final static double incomeBracket_level2 = 95259;
    final static double incomeTaxRate_level2 = 0.205;
    final static double capitalGainTaxRate_level2 = 0.1025;
    final static double eligibleDividendsTaxRate_level2 = 0.0756;
    final static double nonEligibleDividendsTaxRate_level2 = 0.1319;
    final static double incomeBracket_level3 = 147667;
    final static double incomeTaxRate_level3 = 0.26;
    final static double capitalGainTaxRate_level3 = 0.13;
    final static double eligibleDividendsTaxRate_level3 = 0.1515;
    final static double nonEligibleDividendsTaxRate_level3 = 0.1952;
    final static double incomeBracket_level4 = 210371;
    final static double incomeTaxRate_level4 = 0.29;
    final static double capitalGainTaxRate_level4 = 0.145;
    final static double eligibleDividendsTaxRate_level4 = 0.1929;
    final static double nonEligibleDividendsTaxRate_level4 = 0.2297;
    final static double incomeTaxRate_level5 = 0.33;
    final static double capitalGainTaxRate_level5 = 0.165;
    final static double eligibleDividendsTaxRate_level5 = 0.2481;
    final static double nonEligibleDividendsTaxRate_level5 = 0.2757;

    public static double calculateFederalTax(TaxQuery taxQuery){
        double federalTax = 0;
        double otherIncome = taxQuery.getEmploymentIncome()+ taxQuery.getSelfEmploymentIncome()+taxQuery.getOtherIncome();
        double capitalGainIncome = taxQuery.getCapitalGain();
        double eligibleDividendIncome = taxQuery.getEligibleDividend();
        double nonEligibleDividendIncome = taxQuery.getNonEligibleDividend();

        if(otherIncome > basicPersonalTaxCredit){
            if(otherIncome < incomeBracket_level1){
                federalTax = federalTax +(otherIncome*incomeTaxRate_level1);
            }else if (otherIncome < incomeBracket_level2){
                federalTax = federalTax + (incomeBracket_level1*incomeTaxRate_level1)
                        + ((otherIncome-incomeBracket_level1)*incomeTaxRate_level2);
            }else if (otherIncome < incomeBracket_level3){
                federalTax = federalTax + (incomeBracket_level1*incomeTaxRate_level1)
                        + (incomeBracket_level2-incomeBracket_level1)*incomeTaxRate_level2
                        + ((otherIncome-incomeBracket_level2)*incomeTaxRate_level3);
            }else if (otherIncome < incomeBracket_level4){
                federalTax = federalTax + (incomeBracket_level1*incomeTaxRate_level1)
                        + (incomeBracket_level2-incomeBracket_level1)*incomeTaxRate_level2
                        + (incomeBracket_level3-incomeBracket_level2)*incomeTaxRate_level3
                        + ((otherIncome-incomeBracket_level3)*incomeTaxRate_level4);
            }else{
                federalTax = federalTax + (incomeBracket_level1*incomeTaxRate_level1)
                        + (incomeBracket_level2-incomeBracket_level1)*incomeTaxRate_level2
                        + (incomeBracket_level3-incomeBracket_level2)*incomeTaxRate_level3
                        + (incomeBracket_level4-incomeBracket_level3)*incomeTaxRate_level4
                        + ((otherIncome-incomeBracket_level4)*incomeTaxRate_level5);
            }
            federalTax = federalTax - basicPersonalTaxCredit*incomeTaxRate_level1;

        }else{
            federalTax =0;
        }

        if(capitalGainIncome < incomeBracket_level1){
            federalTax = federalTax +(capitalGainIncome*capitalGainTaxRate_level1);
        }else if (capitalGainIncome < incomeBracket_level2){
            federalTax = federalTax + (incomeBracket_level1*capitalGainTaxRate_level1)
                    + ((capitalGainIncome-incomeBracket_level1)*capitalGainTaxRate_level2);
        }else if (capitalGainIncome < incomeBracket_level3){
            federalTax = federalTax + (incomeBracket_level1*capitalGainTaxRate_level1)
                    + (incomeBracket_level2-incomeBracket_level1)*capitalGainTaxRate_level2
                    + ((capitalGainIncome-incomeBracket_level2)*capitalGainTaxRate_level3);
        }else if (capitalGainIncome < incomeBracket_level4){
            federalTax = federalTax + (incomeBracket_level1*capitalGainTaxRate_level1)
                    + (incomeBracket_level2-incomeBracket_level1)*capitalGainTaxRate_level2
                    + (incomeBracket_level3-incomeBracket_level2)*capitalGainTaxRate_level3
                    + ((capitalGainIncome-incomeBracket_level3)*capitalGainTaxRate_level4);
        }else{
            federalTax = federalTax + (incomeBracket_level1*capitalGainTaxRate_level1)
                    + (incomeBracket_level2-incomeBracket_level1)*capitalGainTaxRate_level2
                    + (incomeBracket_level3-incomeBracket_level2)*capitalGainTaxRate_level3
                    + (incomeBracket_level4-incomeBracket_level3)*capitalGainTaxRate_level4
                    + ((capitalGainIncome-incomeBracket_level4)*capitalGainTaxRate_level5);
        }

        if(eligibleDividendIncome < incomeBracket_level1){
            federalTax = federalTax +(eligibleDividendIncome*eligibleDividendsTaxRate_level1);
        }else if (eligibleDividendIncome < incomeBracket_level2){
            federalTax = federalTax + (incomeBracket_level1*eligibleDividendsTaxRate_level1)
                    + ((eligibleDividendIncome-incomeBracket_level1)*eligibleDividendsTaxRate_level2);
        }else if (eligibleDividendIncome < incomeBracket_level3){
            federalTax = federalTax + (incomeBracket_level1*eligibleDividendsTaxRate_level1)
                    + (incomeBracket_level2-incomeBracket_level1)*eligibleDividendsTaxRate_level2
                    + ((eligibleDividendIncome-incomeBracket_level2)*eligibleDividendsTaxRate_level3);
        }else if (eligibleDividendIncome < incomeBracket_level4){
            federalTax = federalTax + (incomeBracket_level1*eligibleDividendsTaxRate_level1)
                    + (incomeBracket_level2-incomeBracket_level1)*eligibleDividendsTaxRate_level2
                    + (incomeBracket_level3-incomeBracket_level2)*eligibleDividendsTaxRate_level3
                    + ((eligibleDividendIncome-incomeBracket_level3)*eligibleDividendsTaxRate_level4);
        }else{
            federalTax = federalTax + (incomeBracket_level1*eligibleDividendsTaxRate_level1)
                    + (incomeBracket_level2-incomeBracket_level1)*eligibleDividendsTaxRate_level2
                    + (incomeBracket_level3-incomeBracket_level2)*eligibleDividendsTaxRate_level3
                    + (incomeBracket_level4-incomeBracket_level3)*eligibleDividendsTaxRate_level4
                    + ((eligibleDividendIncome-incomeBracket_level4)*eligibleDividendsTaxRate_level5);
        }

        if(nonEligibleDividendIncome < incomeBracket_level1){
            federalTax = federalTax +(nonEligibleDividendIncome*nonEligibleDividendsTaxRate_level1);
        }else if (nonEligibleDividendIncome < incomeBracket_level2){
            federalTax = federalTax + (incomeBracket_level1*nonEligibleDividendsTaxRate_level1)
                    + ((nonEligibleDividendIncome-incomeBracket_level1)*nonEligibleDividendsTaxRate_level2);
        }else if (nonEligibleDividendIncome < incomeBracket_level3){
            federalTax = federalTax + (incomeBracket_level1*nonEligibleDividendsTaxRate_level1)
                    + (incomeBracket_level2-incomeBracket_level1)*nonEligibleDividendsTaxRate_level2
                    + ((nonEligibleDividendIncome-incomeBracket_level2)*nonEligibleDividendsTaxRate_level3);
        }else if (nonEligibleDividendIncome < incomeBracket_level4){
            federalTax = federalTax + (incomeBracket_level1*nonEligibleDividendsTaxRate_level1)
                    + (incomeBracket_level2-incomeBracket_level1)*nonEligibleDividendsTaxRate_level2
                    + (incomeBracket_level3-incomeBracket_level2)*nonEligibleDividendsTaxRate_level3
                    + ((nonEligibleDividendIncome-incomeBracket_level3)*nonEligibleDividendsTaxRate_level4);
        }else{
            federalTax = federalTax + (incomeBracket_level1*nonEligibleDividendsTaxRate_level1)
                    + (incomeBracket_level2-incomeBracket_level1)*nonEligibleDividendsTaxRate_level2
                    + (incomeBracket_level3-incomeBracket_level2)*nonEligibleDividendsTaxRate_level3
                    + (incomeBracket_level4-incomeBracket_level3)*nonEligibleDividendsTaxRate_level4
                    + ((nonEligibleDividendIncome-incomeBracket_level4)*nonEligibleDividendsTaxRate_level5);
        }

        return federalTax;

    }
}
