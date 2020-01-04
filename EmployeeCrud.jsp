<%@page import="com.del.second2.entity.Employee,com.del.second2.dao.EmployeeDAO" %>
<%
Employee e= (Employee)request.getAttribute("emp");
if(e==null) e= new Employee();
%>
<!DOCTYPE html>
<html>
<body>
<form action ="EmployeeCrudServlet">
<table align=center width=50% bgcolor=lightblue>
<tr>
<th>Employee Id</th>
<td><input type=text name=id value=<%=e.getEmpid() %>></td>
</tr>
<tr>
<th>Employee name</th>
<td><input type=text name=ename value=<%=e.getName() %>></td>
</tr>
<tr>
<th>Employee salary</th>
<td><input type=text name=salary value=<%=e.getSalary() %>></td>
</tr>
<tr>
<th>Employee doj</th>
<td><input type=date name=dob value=<%=e.getDoj() %>></td>
</tr>
<tr>
<td><input type=submit value=add_employee name="sub"></td>
<td><input type=submit value=show_employee name="sub"></td>
</tr>
<tr>
<td><input type=submit value=delete_employee name="sub"></td>
<td><input type=submit value=modify_employee name="sub"></td>
</tr>
</table>
</form>
</body>
</html>