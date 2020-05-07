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
                                <Col xs={6} id={"results"}>
                                    <h4>Results</h4>
                                    <div>
                                        <label>Total income</label>
                                        <span>$ 0</span>
                                    </div>
                                    <div>
                                        <label>Federal tax</label>
                                        <span>$ 0</span>
                                    </div>
                                    <div>
                                        <label>Provincial tax</label>
                                        <span>$ 0</span>
                                    </div>
                                    <div>
                                        <label>Total tax</label>
                                        <span>$ 0</span>
                                    </div>
                                    <div>
                                        <label>After-tax income</label>
                                        <span>$ 0</span>
                                    </div>
                                    <div>
                                        <label>Average tax rate</label>
                                        <span>0.00 %</span>
                                    </div>
                                    <div>
                                        <label>Marginal tax rate</label>
                                        <span>0.00 %</span>
                                    </div>
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