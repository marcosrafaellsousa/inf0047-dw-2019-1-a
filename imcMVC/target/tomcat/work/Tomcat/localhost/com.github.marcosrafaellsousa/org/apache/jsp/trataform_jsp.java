/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-05-09 20:48:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.lang.String;

public final class trataform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    public  String fncMES(int mes)
    {
        String retorno ="";
        switch(mes){
            case 1: retorno="Janeiro";break;
            case 2: retorno="Fevereiro";break;
            case 3: retorno="MarÃ§o";break;
            case 4: retorno="Abril";break;
            case 5: retorno="Maio";break;
            case 6: retorno="Junho";break;
            case 7: retorno="Julho";break;
            case 8: retorno="Agosto";break;
            case 9: retorno="Setembro";break;
            case 10: retorno="Outubro";break;
            case 11: retorno="Novembro";break;
            case 12: retorno="Dezembro";break;
        }
        return retorno;
    }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/topo.jsp", Long.valueOf(1557434733502L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("    <title>JSP Page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h1> Pagina JSP </h1>\r\n");
      out.write("<h4> ");

    int mes = Integer.parseInt(new SimpleDateFormat("M").format(new Date()));
    int dia = Integer.parseInt(new SimpleDateFormat("dd").format(new Date()));
    int ano = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));

    out.println("Hoje eh dia " + dia + " de " + fncMES(mes) + " de " + ano);

      out.write("</h4>");
      out.write("\r\n");
      out.write("Dados do formulario<br>\r\n");

    String nome = request.getParameter("txtnome");
    if(nome=="")
        out.println("Nome não foi digitato");
    else
        out.println("Seu nome é " + nome);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>E-Mail: ");
      out.print(request.getParameter("txtemail"));
      out.write("<br>\r\n");
      out.write("Data de Nascimento: ");
      out.print(request.getParameter("txtdtnasc"));
      out.write("<br>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
