<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
    iframe{
      height: 500px;
      width: 1000px;
      border: none;
      background-color: gray;
      overflow: scroll;
    }
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Zero xml is working</h1>
  <h2>No of request in app: ${application} , No of request in session: ${session}</h2>
  <hr>
    <a href="jobs.asp" target="myframe">Load Jobs</a>
    <a href="addJobs.asp" target="myframe">Add Jobs</a>
  
  <iframe name="myframe"></iframe>
</body>
</html>