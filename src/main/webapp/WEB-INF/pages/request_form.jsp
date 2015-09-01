<%--
  Created by IntelliJ IDEA.
  User: Luca
  Date: 9/1/2015
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>${title}</title>
    </head>
    <body>
        <h1>Fraction Request Form ayy lmao</h1>
        Okay please enter the information:
        <form method="post" action="submit">
            <input type="text" name="fracTel1">/
            <input type="text" name="fracNoem1"><br>
            <b>Math Function</b><br>
            <select name="operator">
                <option>+</option>
                <option>-</option>
                <option>*</option>
                <option>/</option>
            </select><br>
            <input type="text" name="fracTel2">/
            <input type="text" name="fracNoem2">
            <br>
            <input type="submit" value="Get le answer">
        </form>
    </body>
</html>