
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form:form method="post" action="/SpringCRUD/editsave">
<h1>Modification of Employee</h1>
<table border="3" style="background-color: orange;width: 25%">
<tr>
<td>Id</td>
<td><form:hidden path="id"/> </td>
</tr>
<tr>
<td>Name</td>
<td><form:input path="name"/> </td>
</tr>
<tr>
<td>Id</td>
<td><form:input path="salary"/> </td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Edit save"> </td>
</tr>
</table>
</form:form>