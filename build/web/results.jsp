<!DOCTYPE html>
<!--Copyright © 2016 Wes Upham and Sarah Hennenkamp--> 
<%@ include file="/includes/header.html"%>
<jsp:useBean id="user" scope="request" class="edu.elon.calculate.User"/>
<div class="main">
	<h1>Future Value Calculator</h1>
	<table>
		<tr>
			<td>Investment Amount:</td>  
			<td><jsp:getProperty name="user" property="amount"/></td>
		</tr>
		<tr>
			<td>Yearly Interest Rate:</td>   
			<td><jsp:getProperty name="user" property="rate"/></td>
		</tr>
		<tr>    
			<td>Number of Years:</td>   
			<td><jsp:getProperty name="user" property="years"/></td>
		</tr>
		<tr>
			<td>Future Value:</td>   
			<td><jsp:getProperty name="user" property="value"/></td>
		</tr>
	</table>
</div>
<%@ include file="includes/footer.html"%>