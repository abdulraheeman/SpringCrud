<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>ADD New Employee</h1>
<form:form method="post" action="save">
<table border="3" style="background-color: orange;width: 25%">
<tr>
<td>Id : </td>
<td><form:input path="id"/></td>
</tr>
<tr>
<td>Name : </td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td>Salary : </td>
<td><form:input path="salary"/> </td>
</tr>
 <tr>
<td>Photo : </td>
<td><input type="file" name="image"  formenctype="multipart/form-data"> </td>
</tr>
<tr>
<td></td>
<td colspan="2"><input type="submit" value="save"/></td>
</tr>
</table>
</form:form>