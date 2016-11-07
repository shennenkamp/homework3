<!--Copyright © 2016 Wes Upham and Sarah Hennenkamp--> 
<%@ include file="/includes/header.html"%>
<div class="main">
	<h1>Future Value Calculator</h1>
	<form action="goElon" method="post">
		<input type="hidden" name="action" value="add" required>   
		<label>Investment Amount</label>
		<input type="number" min="0" name="Amount" required>
		<br>
		<label>Yearly Interest Rate</label>
		<input type="number" min="0" name="Rate" required>
		<br>
		<label>Number of Years</label>
		<input type="number" min="0" name="Years" placeholder="Integer number of years" required>
		<br>
		<label></label>
		<input class="button" type="submit" value="Calculate">
	</form>
</div>
<%@ include file="includes/footer.html"%>
