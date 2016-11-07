<!--Copyright © 2016 Wes Upham and Sarah Hennenkamp--> 
<%@ include file="/includes/header.html"%>
<jsp:useBean id="user" scope="request" class="edu.elon.calculate.User"/>
<div class="main">
	<h1>Future Value Calculator</h1>
	<table>
		<tr>
			<td>Investment Amount:</td>  
			<td>${user.amount}</td>
		</tr>
		<tr>
			<td>Yearly Interest Rate:</td>   
			<td>${user.rate}</td>
		</tr>
		<tr>    
			<td>Number of Years:</td>   
			<td>${user.years}</td>
		</tr>
		<tr>
			<td>Future Value:</td>   
			<td>${user.value}</td>
		</tr>
	</table>
</div>
<%@ include file="includes/footer.html"%>