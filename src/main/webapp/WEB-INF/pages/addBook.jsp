<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Book</title>
</head>
<body>

<form:form method="post" action="addBook" commandName="book">
  <table>
    <tr>
      <td>
        <form><label path="name"> Name </label> </form>
      </td>
      <td><form:input path="name"/></td>
      <td><form:errors path="name"></form:errors> </td>
    </tr>

    <tr>
      <td>
        <form><label path="genre"> Genre </label> </form>
      </td>
      <td><form:input path="genre"/></td>
      <td><form:errors path="genre"></form:errors> </td>
    </tr>

    <td colspan="2"><input type="submit" value="addBook"/></td>
  </table>
</form:form>

</body>
</html>
