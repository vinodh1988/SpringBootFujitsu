<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<style>
  th,tr{
    height: 30px;
    width: 150px;
  }
  th{
    background-color: darkblue;
    color: white;
  }
  td{
    background-color: lightblue;
    color: darkblue;
  }
</style>
</head>
<body>
    <table>
           <thead>
              <th>Department id</th>
              <th>Department name</th>
              <th>manager id</th>
              <th>Location id </th>
           </thead>
           <tbody>
             <c:forEach items="${departments}" var="x">
                <tr>
                     <td>${x.department_id}</td>
                     <td>${x.department_name}</td>
                      <td>${x.manager_id}</td>
                      <td>${x.location_id}</td>
                </tr>
             </c:forEach>
           </tbody>
    </table>
</body>
</html>