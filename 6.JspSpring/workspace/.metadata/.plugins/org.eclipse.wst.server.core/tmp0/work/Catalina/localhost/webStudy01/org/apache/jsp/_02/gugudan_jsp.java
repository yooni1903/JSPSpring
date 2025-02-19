/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-03-15 08:42:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gugudan_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

 	String gugudanText(int i,int j,String clz){
			
			return String.format("<td class='%s'>%d*%d=%d</td>", clz, i, j, (i*j));
		}
	
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\tth,td{\r\n");
      out.write("\t\tborder: 1px solid black;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\ttable{\r\n");
      out.write("\t\tborder-collapse: collapse;\r\n");
      out.write("\t}\r\n");
      out.write("\t.red{\r\n");
      out.write("\t\tbackground: red;\r\n");
      out.write("\t}\r\n");
      out.write("\t.green{\r\n");
      out.write("\t\tbackground: lightgreen;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t/* tr:nth-child(3){\r\n");
      out.write("\t background: red;\r\n");
      out.write("\t}\r\n");
      out.write("\ttd:nth-child(5){background: lightgreen;} */\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- 2단부터 9단까지의 구구단을 table태그를 이용하여 출력. -->\r\n");
      out.write("<!-- 하나의 row에 하나의 단이 출력되도록 -->\r\n");

	// 문자열을 일정한 형태로 출력하고 싶을 땐 formatting한다라고 하고,
	// 특정 데이터 타입으로 변환하고 싶을 때는 parsing한다고 한다.
	
	String minDanStr = request.getParameter("minDan");
	String maxDanStr = request.getParameter("maxDan");
	
	// parameter가 넘어오지 않았을 경우를 생각해야한다.
	// 기본으로 최소단과 최대단을 설정해놓는다.
	int minDan = 2;
	int maxDan = 9;
	
	if(minDanStr != null && minDanStr.matches("[2-9]")){
		minDan = Integer.parseInt(minDanStr);
	}
	if(maxDanStr != null && maxDanStr.matches("[2-9]")){
		maxDan = Integer.parseInt(maxDanStr);
	}

      out.write("\r\n");
      out.write("<form>\r\n");
      out.write("\t<input type=\"number\" placeholder=\"최소 단\" name=\"minDan\" min=\"2\" max=\"9\" value=\"");
      out.print(minDan);
      out.write("\"/>\r\n");
      out.write("\t<select name=\"maxDan\" required>\r\n");
      out.write("\t\t<option value>최대단</option>\r\n");
      out.write("\t\t");

			String OPTPTRN = "<option %2$s value='%1$d'>%1$d단</option>";
			StringBuffer options = new StringBuffer();
			for(int dan = 2; dan <= 9; dan++){
				
				options.append(
						String.format(OPTPTRN, dan, dan==maxDan?"selected" : "")
						);
			}
			out.println(options);
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t</select>\t\r\n");
      out.write("\t<input type=\"submit\" value=\"전송\">\r\n");
      out.write("</form>\r\n");
      out.write("<table>\r\n");
      out.write("\t");
 
		int rowcnt = 1;
		for(int i=minDan; i <= maxDan; i ++ ){ 
			String clz = "normal";
			if(rowcnt++ == 3){
				clz = "red";
			}
			out.println(String.format("<tr class='%s'>", clz));
			out.println("<td>" + i + "단</td>");
			for(int j = 1; j <= 9; j ++){ 
				if(j == 4) clz = "green";
				else clz = "normal";
				out.println(
						gugudanText(i, j, clz)
						);
			} 
			out.println("</tr>");
	} 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
