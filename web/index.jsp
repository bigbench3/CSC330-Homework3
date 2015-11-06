<%-- 
    Document   : index
    Created on : Oct 18, 2015, 6:40:09 PM
    Author     : Ben Hay and Haris Cesko
--%>

<%@include file="/Includes/header.html" %>
<section>
    <form method="post" action="calculate">
        <h1>Future Value <br id="hide"> Calculator</h1>

        <label>Investment Amount</label><br id="hide">
        <input type="text" name="investmentAmount" pattern="\d+(\.\d{1,2})?" required ><br><br>
        <label>Yearly Interest Rate</label><br id="hide">
        <input type="text" name="yearlyInterestRate" pattern="\d+(\.\d{1,2})?" required><br><br>
        <label>Number of Years</label><br id="hide">
        <input type="text" name="numberOfYears" pattern="\d{1,4}" required placeholder="Integer number of years"><br><br>
        <input type="submit" value="Calculate" id="calc">
        <input type="hidden" name="action" value="doCalc"><br><br>
    </form>
</section>
<%@include file="/Includes/footer.html" %>
