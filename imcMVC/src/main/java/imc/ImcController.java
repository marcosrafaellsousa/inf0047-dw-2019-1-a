package imc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/")
public class ImcController extends HttpServlet {

    @Override
    protected void service(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String resultado = "";

        String alturaStr = request.getParameter("txtaltura");
        String pesoStr = request.getParameter("txtpeso");
        if (alturaStr != null && pesoStr != null) {
            double altura = Double.parseDouble(alturaStr);
            double peso = Double.parseDouble(pesoStr);
            resultado = String.format("Resultado: %.2f", Imc.calcularIMC(altura, peso));
        }

        // Adiciona a variável na requisição para o JSP trabalhar.
        request.setAttribute("resultado", resultado);

        // Redireciona requisição para o JSP.
        request.getRequestDispatcher("/imcCalculo.jsp").forward(request, response);

    }
}
