<!--Copyright © 2016 Erik Borchers, Sarah Hennenkamp and Wes Upham-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/includes/header.html"%>
<%@ taglib prefix="elon" uri="/WEB-INF/homework3.tld" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    	</table>
    <table>
      <tr>
        <td>Year</td>
        <td>Value</td>
      </tr>
    <c:forEach var="year" begin = "1" end="${user.len}">
      <tr>
        <td>${year}</td>
        <td><elon:currencyFormat format="${user.list[year-1]}"/></td>
      </tr>
    </c:forEach>
    </table>

		
	<form action="" method="get">
      <input type="hidden" name="action" value="join">
      <input type="submit" value="Return">
    </form>
		
</div>
<%@ include file="includes/footer.html"%>