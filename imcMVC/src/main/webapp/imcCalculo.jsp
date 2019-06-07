<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Calculo IMC com padrao MVC</title>
</head>
<body>
<h1> Caculo de imc com padrao MVC </h1>
<form>
    <p>Peso:</p><input type="text" name="txtpeso"/><br>
    <p>Altura:</p><input type="text" name="txtaltura"/><br>
    <input type="submit" value="Calcular"/>
</form>

<h2>
${resultado}
</h2>

</body>
</html>