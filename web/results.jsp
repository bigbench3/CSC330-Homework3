<%-- 
    Document   : index
    Created on : Oct 18, 2015, 6:40:09 PM
    Author     : Ben Hay and Haris Cesko
--%>

<%@include file="/Includes/header.html" %>
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
                <td class="alignLeft">${investment.futureValue$}</td>
            </tr>
        </tbody>
    </table> <br> <br>
</section>
<%@include file="/Includes/footer.html" %>
