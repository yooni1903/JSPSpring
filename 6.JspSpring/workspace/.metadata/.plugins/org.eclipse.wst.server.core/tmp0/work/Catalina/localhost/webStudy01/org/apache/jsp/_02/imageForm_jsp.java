/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-03-16 04:56:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.FilenameFilter;
import java.io.File;
import java.util.Date;

public final class imageForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.FilenameFilter");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.io.File");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\tconst SRCPTRN = \"%A?%N=%V\";\r\n");
      out.write("\t\t\tconsole.log($(\"form\")[0]);\r\n");
      out.write("\t\t\tconst action = $(\"form\")[0].action;\r\n");
      out.write("// \t\t\tconsole.log($(\"#image\"));\r\n");
      out.write("\t\t\t$(\"#image\").on(\"change\", function(){ /* 콜백함수 */\r\n");
      out.write("\t\t\t\t$(\"#imageArea\").empty();\r\n");
      out.write("// \t\t\t\tconsole.log(this.value);\t// html\r\n");
      out.write("// \t\t\t\tconsole.log($(this).val());\t// jquery\r\n");
      out.write("// \t\t\t\tthis.form.submit();\r\n");
      out.write("\t\t\t\t// img 태그 생성\r\n");
      out.write("\t\t\t\tvar name = this.name;\r\n");
      out.write("\t\t\t\tvar values = $(this).val();\r\n");
      out.write("\t\t\t\tvar imgs = [];\r\n");
      out.write("\t\t\t\t$(values).each(function(idx, value){\r\n");
      out.write("\t\t\t\t\tvar src = SRCPTRN.replace(\"%A\", action).replace(\"%N\", name).replace(\"%V\", value);\r\n");
      out.write("\t\t\t\t\tvar img = $(\"<img>\").attr(\"src\", src);\r\n");
      out.write("\t\t\t\t\timgs.push(img);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t// imageArea에 img태그를 innerHTML로 삽입\r\n");
      out.write("\t\t\t\t$(\"#imageArea\").html(imgs);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h4>");
      out.print(new Date() );
      out.write("</h4>\r\n");
      out.write("\t<form action = '");
      out.print(request.getContextPath() );
      out.write("/01/image.do'>\r\n");
      out.write("\t");

		String folder = "d:/contents";
		File contents = new File(folder);
		
		String[] children = contents.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				String mime = application.getMimeType(name);
				return mime != null && mime.startsWith("image/");
			}
		});
		StringBuffer options = new StringBuffer();
		for (String child : children) {
			options.append(String.format("<option>%s</option>", child));
		}
	
      out.write("\r\n");
      out.write("\t<select multiple name=\"image\" id =\"image\">\r\n");
      out.write("\t\t");
      out.print(options );
      out.write("\r\n");
      out.write("\t</select>\r\n");
      out.write("\t<input type=\"submit\" value=\"전송\" style=\"background-color:red;\" />\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<div id=\"imageArea\"></div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t// \tvar select = document.querySelector('#image');\r\n");
      out.write("\t// \tselect.onchange = function(event){\r\n");
      out.write("\t// \t\tevent.target.form.submit();\r\n");
      out.write("\t// \t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
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
