<!--Copyright © 2016 Erik Borchers, Sarah Hennenkamp and Wes Upham-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/includes/header.html"%>
<%@ taglib prefix="elon" uri="/WEB-INF/homework3.tld" %>
<jsp:useBean id="user" scope="request" class="edu.elon.calculate.User"/>
<div class="main">
	<h1>Future Value Calculator</h1>
	<table>
		<tr>
			<td>Investment Amount:</td>  
			<td><elon:currencyFormat format="${user.amount}"/></td>
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
			<td><elon:currencyFormat format="${user.value}"/></td>
		</tr>
	</table>
		
	<form action="" method="get">
      <input type="hidden" name="action" value="join">
      <input type="submit" value="Return">
    </form>
		
</div>
<%@ include file="includes/footer.html"%>