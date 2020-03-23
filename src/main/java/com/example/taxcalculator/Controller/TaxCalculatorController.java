package com.example.taxcalculator.Controller;

/*
  Tax Calculator REST controller
  Author: Abhilash Paul
  Date: 23 Mar 2020
*/

import com.example.taxcalculator.model.FederalTax;
import com.example.taxcalculator.model.TaxQuery;
import com.example.taxcalculator.model.TaxResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/TaxCalculator")
public class TaxCalculatorController {

        //creates a log
        @PostMapping("/query")
        public Optional<TaxResult> CalculateTax(@Valid @RequestBody TaxQuery taxQuery){
            TaxResult taxResult = new TaxResult();

            //calculate taxes
            double federalTax = FederalTax.calculateFederalTax(taxQuery);

            //update result object
            taxResult.setFederalTax(federalTax);
            //return the results
            return Optional.of(taxResult);
        }
}
