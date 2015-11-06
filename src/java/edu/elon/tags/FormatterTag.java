/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elon.tags;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import static javax.servlet.jsp.tagext.Tag.SKIP_BODY;
import javax.servlet.jsp.tagext.TagSupport;
import edu.elon.investment.Investment;
import java.text.NumberFormat;

/**
 *
 * @author bhay
 */
public class FormatterTag extends TagSupport{

    @Override
    public int doStartTag() throws JspException{
        Investment investment = new Investment();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double amount = investment.getInvestmentAmount();
        currency.format(amount);
        
        try{
            JspWriter out = pageContext.getOut();
            out.print(currency);
        } catch(IOException e){
            System.out.println("IOException");
        }
        return SKIP_BODY;
    }

}
