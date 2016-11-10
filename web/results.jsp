<!--Copyright © 2016 Erik Borchers, Sarah Hennenkamp and Wes Upham-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/includes/header.html"%>
<%@ taglib prefix="elon" uri="/WEB-INF/homework3.tld" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="main">
	<h1>Future Value Calculator</h1>
	<table class="one">
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
			<td>
    <table class="two">
      <tr>
        <td class="bold">Year</td>
        <td class="bold">Value</td>
      </tr>
    <c:forEach var="year" begin = "1" end="${user.len}">
      <tr>
        <td class="num">${year}</td>
        <td><elon:currencyFormat format="${user.list[year-1]}"/></td>
      </tr>
    </c:forEach>
			</table>
		</td>
		</tr>
		<tr>
			<td>
		<a href="<c:url value = 'calculate'/>">Return to Calculator</a>
			</td>
		</tr>
				</table>
</div>
<%@ include file="includes/footer.html"%>