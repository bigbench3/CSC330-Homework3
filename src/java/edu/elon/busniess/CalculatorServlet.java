package edu.elon.busniess;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.elon.invetment.Investment;

/**
 *
 * @author Ben Hay and Haris Cesko
 */
public class CalculatorServlet extends HttpServlet {
    
 @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/index.jsp";
    
        String action = request.getParameter("action");
        
        if(action!= null && action.equals("doCalc")){
            
            String investmentAmount = request.getParameter("investmentAmount");
            String interestRate = request.getParameter("yearlyInterestRate");
            String numberOfYears = request.getParameter("numberOfYears");
            
            Investment investment = new Investment();
            investment.setInvestmentAmmount(Double.parseDouble(investmentAmount));
            investment.setYearlyInterestRate(Double.parseDouble(interestRate));
            investment.setNumberOfYears(Integer.parseInt(numberOfYears));
            
            investment.setFutureValue(
                    Double.parseDouble(investmentAmount), 
                    Double.parseDouble(interestRate), 
                    Integer.parseInt(numberOfYears));
            
            request.setAttribute("investment", investment);
                    
            
            url = "/results.jsp";
        } else {
           url = "/index.jsp"; 
        }
        
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
    }
    
        @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
}
    
