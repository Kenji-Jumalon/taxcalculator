import React, { Component } from 'react';
import {Navbar} from 'react-bootstrap';
import "./TaxCalculator.css"

class TaxCalculator extends Component {
    render() {
        return(
            <div id={"taxcalculator"}>
                <div>
                    <h1>Tax Calculator</h1>
                    <p>Use our simple calculator to quickly estimate your 2020 federal and provincial taxes.</p>
                </div>
                <div>
                    <form>
                        <div>
                            <h4>Income & Deductions</h4>
                            <label>Employment income</label>
                            <input type="text" placeholder={"$"}/>
                            <label>Self-employment income</label>
                            <input type="text" placeholder={"$"}/>
                            <label>Capital gains</label>
                            <input type="text" placeholder={"$"}/>
                            <label>Eligible dividends</label>
                            <input type="text" placeholder={"$"}/>
                            <label>Ineligible dividends</label>
                            <input type="text" placeholder={"$"}/>
                            <label>Other income</label>
                            <input type="text" placeholder={"$"}/>
                            <label>RRSP deduction</label>
                            <input type="text" placeholder={"$"}/>
                            <label>Income taxes paid</label>
                            <input type="text" placeholder={"$"}/>
                        </div>
                        <div>
                            <h4>Results</h4>
                            <span>Total income</span>
                            <span>$ 0</span>
                            <span>Federal tax</span>
                            <span>$ 0</span>
                            <span>Provincial tax</span>
                            <span>$ 0</span>
                            <span>Total tax</span>
                            <span>$ 0</span>
                            <span>After-tax income</span>
                            <span>$ 0</span>
                            <span>Average tax rate</span>
                            <span>0.00 %</span>
                            <span>Marginal tax rate</span>
                            <span>0.00 %</span>
                        </div>

                    </form>
                </div>

            </div>
        );
    }

}
export default TaxCalculator