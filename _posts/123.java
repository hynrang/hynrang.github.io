<%@ page contentType="text/html" pageEncoding="utf-8" %>
<%@ page import="java.sql.*" %>
<%
request.setCharacterEncoding("utf-8");
 
String uid = request.getParameter("id");
String sql = "INSERT INTO user(id, password, name)VALUES(?, ?, ?)";
 
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns", "root", "1111");
PreparedStatement stmt = conn.prepareStatement(sql);

int count = stmt.executeUpdate();
if (count == 1) {
    out.print("회원 탈퇴가 완료되었습니다.");
}
stmt.close();
conn.close();
%>