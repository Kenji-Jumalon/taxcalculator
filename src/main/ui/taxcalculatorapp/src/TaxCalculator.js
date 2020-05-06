import React, { Component } from 'react';
import {Container,Row,Col} from 'react-bootstrap';
import "./TaxCalculator.css"

class TaxCalculator extends Component {
    render() {
        return(
            <div id={"wrapper"}>
                <div>
                    <h1>Tax Calculator</h1>
                    <p>Use our simple calculator to quickly estimate your 2020 federal and provincial taxes.</p>
                </div>
                <div id={"taxcalculator"}>
                    <form>
                        <Container>
                            <Row>
                                <Col xs={6} id={"incomes"}>
                                    <h4>Income & Deductions</h4>
                                    <div>
                                        <label>Employment income</label>
                                        <input type="text" placeholder={"$"}/>
                                    </div>
                                    <div>
                                        <label>Self-employment income</label>
                                        <input type="text" placeholder={"$"}/>
                                    </div>
                                    <div>
                                        <label>Capital gains</label>
                                        <input type="text" placeholder={"$"}/>
                                    </div>
                                    <div>
                                        <label>Eligible dividends</label>
                                        <input type="text" placeholder={"$"}/>
                                    </div>
                                    <div>
                                        <label>Ineligible dividends</label>
                                        <input type="text" placeholder={"$"}/>
                                    </div>
                                    <div>
                                        <label>Other income</label>
                                        <input type="text" placeholder={"$"}/>
                                    </div>
                                    <div>
                                        <label>RRSP deduction</label>
                                        <input type="text" placeholder={"$"}/>
                                    </div>
                                    <div>
                                        <label>Income taxes paid</label>
                                        <input type="text" placeholder={"$"}/>
                                    </div>
                                </Col>
                                <Col xs={6}>
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
                                </Col>
                            </Row>
                        </Container>

                    </form>
                </div>

            </div>
        );
    }

}
export default TaxCalculator