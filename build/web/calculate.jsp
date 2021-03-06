<!--Copyright � 2016 Erik Borchers, Sarah Hennenkamp and Wes Upham-->
<%@ include file="/includes/header.html"%>
<div class="main">
  <h1>Future Value Calculator</h1>
  <form action="calculate" method="post">
    <input type="hidden" name="action" value="add">   
    <label>Investment Amount</label>
    <input type="number" min="0" name="Amount" value="${user.amount}" required>
    <br>
    <label>Yearly Interest Rate</label>
    <input type="number" min="0" name="Rate" value="${user.rate}" required>
    <br>
    <label>Number of Years</label>
    <input type="number" min="0" name="Years" placeholder="Integer number of years" value="${user.years}" required>
    <br>
    <label></label>
    <input class="button" type="submit" value="Calculate">
  </form>
</div>
<%@ include file="includes/footer.html"%>
