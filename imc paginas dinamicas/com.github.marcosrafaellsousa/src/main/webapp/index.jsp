<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Calculo IMC pagina dinamica</title>
</head>
<body>
<%@include file="topo.jsp"%>
<form action="calculoimc.jsp" method="post">
    Peso:<input type="text" name="txtpeso"/><br>
    Altura:<input type="text" name="txtaltura"/><br>
    <input type="submit" value="Calcular"/>

</form>
</body>
</html>