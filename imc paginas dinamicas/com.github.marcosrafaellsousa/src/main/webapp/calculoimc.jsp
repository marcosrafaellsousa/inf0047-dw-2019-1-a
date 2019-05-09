<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Calculo de imc resposta</title>
</head>
<body>
<%@include file="topo.jsp"%>

Dados do formulario<br>
<%

    boolean pesook = false;
    boolean alturaok = false;
    double peso = 0;
    double altura = 0;

    if(request.getParameter("txtpeso") != null && !request.getParameter("txtpeso").equals("")) {
        peso = Double.parseDouble(request.getParameter("txtpeso"));
        pesook = true;
    }
    else
        out.println("o peso não foi digitado corretamente");

    if(request.getParameter("txtaltura") != null && !request.getParameter("txtaltura").equals("")) {
        altura = Double.parseDouble(request.getParameter("txtaltura"));
        alturaok = true;
    }
    else
        out.println("a altura não foi digitado corretamente");

    if (pesook && alturaok) {
        double imc = peso / (altura * altura);
        out.println("Seu imc eh : " + imc);
    }
%>

</body>
</html>