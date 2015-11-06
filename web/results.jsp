<%-- 
    Document   : index
    Created on : Oct 18, 2015, 6:40:09 PM
    Author     : Ben Hay and Haris Cesko
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/Includes/header.html" %>
<%@taglib uri="/WEB-INF/hay_cesko.tld" prefix="elon"%>
<%--<elon:currencyFormat></elon:currencyFormat>--%>
<section>
    <h1>Future Value Calculator</h1>

    <table>
        <tbody>
            <tr>
                <td class="alignRight">Investment Amount:</td>
                <td class="alignLeft">${investment.investmentAmount$}</td>
            </tr>
            <tr>
                <td class="alignRight">Yearly Interest Rate:</td>
                <td class="alignLeft">  ${investment.yearlyInterestRate}</td>
            </tr>
            <tr>
                <td class="alignRight">Number of Years:</td>
                <td class="alignLeft">${investment.numberOfYears}</td>
            </tr>
            <tr>
                <td class="alignRight">Future Value:</td>
                <td class="alignLeft"><elon:currencyFormat/>${investment.futureValue$}</td>
            </tr>
        </tbody>
    </table>
            
    <table>
        <tbody>
            <th>
                <td>Year</td>
                <td>Value</td>
            </th>
            <c:forEach items="$(years)" var="amount" varStatus="status">
                <tr>
                    <td></td>
                    <td></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
            
    <a href="index.jsp" title="Return to Calculator">Return to Calculator</a><br> <br>
</section>
<%@include file="/Includes/footer.html" %>
