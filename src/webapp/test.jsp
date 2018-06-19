<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: evrom
  Date: 19.06.2018
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
<h1>java</h1>
<%

    final String URL = "jdbc:postgresql://localhost:5432/16_06_18";
    final String USER = "postgres";
    final String PASSWORD = "qwerty";

    try {
        Class.forName("org.postgresql.Driver");
        Connection connection;
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM test");

        while (resultSet.next()){
            out.println(resultSet.getString("name"));
            %><br><%
        }

    }catch (ClassNotFoundException e){
        e.printStackTrace();
    }
%>

</body>
</html>
