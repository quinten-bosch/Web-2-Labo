<%@ page import="domain.model.Student" %>
<%@ page import="java.util.ArrayList" %>
<%
    Student greetje = new Student("Jongen", "Greetje", "Toegepaste Informatica", 23);
    Student kristien = new Student("Melaerts", "Kristien", "Chemie", 21);
    Student elke = new Student("Steegmans", "Elke", "Vroedkunde", 16);
    Student jan = new Student("Van Hee", "Jan", "Verpleegkunde", 18);

    ArrayList<Student> students = new ArrayList<Student>();
    students.add(greetje);
    students.add(kristien);
    students.add(elke);
    students.add(jan);

%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Info: Overzicht</title>
    <link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>

<table>
    <%
        for (Student student: students) {
    %>
    <tr>
        <td><%=student.getNaam() %></td>
        <td><%=student.getVoornaam() %></td>
        <td><%=student.getLeeftijd() %></td>
        <td><%=student.getStudierichting() %></td>
    </tr>
    <%
        }
    %>
   
</table>

</body>
</html>
