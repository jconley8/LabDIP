/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Josh
 */
public class TipCalculatorService {
    private TipCalculatorStrategy tipCalc;

    public TipCalculatorService(TipCalculatorStrategy tipCalc) {
        this.tipCalc = tipCalc;
    }

    public TipCalculatorStrategy getTipCalc() {
        return tipCalc;
    }

    public void setTipCalc(TipCalculatorStrategy tipCalc) {
        this.tipCalc = tipCalc;
    }
    
    
}
