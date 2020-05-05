import React, { Component } from 'react';
import {Navbar} from 'react-bootstrap';

class TaxCalculator extends Component {
    render() {
        return(
            <div>
                <div>
                    <h1>Tax Calculator</h1>
                    <p>Use our simple calculator to quickly estimate your 2020 federal and provincial taxes.</p>
                </div>
                <div>
                    <form>
                        <h4>Income & Deductions</h4>
                        <label>Employment income</label>
                        <input type="text"/>
                        <label>Self-employment income</label>
                        <input type="text"/>
                        <label>Capital gains</label>
                        <input type="text"/>
                        <label>Eligible dividends</label>
                        <input type="text"/>
                        <label>Ineligible dividends</label>
                        <input type="text"/>
                        <label>Other income</label>
                        <input type="text"/>
                        <label>RRSP deduction</label>
                        <input type="text"/>
                        <label>Income taxes paid</label>
                        <input type="text"/>
                    </form>
                </div>

            </div>
        );
    }

}
export default TaxCalculator