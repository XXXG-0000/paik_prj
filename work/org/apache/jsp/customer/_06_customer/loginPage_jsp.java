/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2024-11-15 03:24:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.customer._06_customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  public java.lang.String getServletInfo() {
    return "사용자 로그인화면";
  }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<html lang=\"ko-KR\">\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"http://paiks.sist.co.kr/customer/00.common/images/btnImg.png\">\r\n");
      out.write("<title>빽스커피 | 로그인</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	.headHTxt{\r\n");
      out.write("		text-align: center;\r\n");
      out.write("		margin-top: 20px;\r\n");
      out.write("		margin-bottom: 20px;\r\n");
      out.write("	}\r\n");
      out.write("	table{\r\n");
      out.write("		border-spacing: 0 15px;\r\n");
      out.write("	}\r\n");
      out.write("	.txt{\r\n");
      out.write("		color: #C9C9C9;\r\n");
      out.write("	}\r\n");
      out.write("	#loginContainer{\r\n");
      out.write("		margin-bottom: 30px;\r\n");
      out.write("	}\r\n");
      out.write("	.inputBox {\r\n");
      out.write("	    width: calc(100% - 20px);\r\n");
      out.write("	    padding: 10px;\r\n");
      out.write("	    border: 1px solid #ccc;\r\n");
      out.write("	    font-size: 16px;\r\n");
      out.write("	    margin-top: 15px;\r\n");
      out.write("	    padding: 10px;\r\n");
      out.write("	}\r\n");
      out.write("	#loginBtn{\r\n");
      out.write("		cursor: pointer;\r\n");
      out.write("		background-color: #FFE800;\r\n");
      out.write("		color: #FFFFFF;\r\n");
      out.write("		border: 0px;\r\n");
      out.write("		height: 50px;\r\n");
      out.write("		width: 97.5%;\r\n");
      out.write("		margin-top: 30px;\r\n");
      out.write("		margin-bottom: 20px;\r\n");
      out.write("	}\r\n");
      out.write("	#memberContainer{\r\n");
      out.write("		border: 1px solid #E6E7E8;\r\n");
      out.write("		padding: 30px;\r\n");
      out.write("	}\r\n");
      out.write("	#joinMemberBtn{\r\n");
      out.write("		margin-top: 40px;\r\n");
      out.write("		padding: 10px 20px 10px 20px;\r\n");
      out.write("		cursor: pointer;\r\n");
      out.write("		background-color: #FFFFFF;\r\n");
      out.write("		border: 1px solid #C9C9C9;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://paiks.sist.co.kr/customer/00.common/css/paik_kl.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://paiks.sist.co.kr/customer/00.common/css/paik_normal.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://paiks.sist.co.kr/customer/00.common/css/paik_extend.css\">\r\n");
      out.write("<link rel=\"stylesheet\" id=\"theme-css-style-css\"  href=\"https://paikdabang.com/wp-content/themes/paikdabang/assets/css/style.css?ver=4.9.4\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"icon\" href=\"http://paiks.sist.co.kr/customer/00.common/images/favicon32x32.png\" sizes=\"32x32\" />\r\n");
      out.write("<link rel=\"icon\" href=\"http://paiks.sist.co.kr/customer/00.common/images/favicon192x192.png\" sizes=\"192x192\" />\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" href=\"http://paiks.sist.co.kr/customer/00.common/images/favicon180x180.png\" />\r\n");
      out.write("<meta name=\"msapplication-TileImage\" content=\"http://paiks.sist.co.kr/customer/00.common/images/favicon270x270.png\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("	$(\"#loginBtn\").click(function(){\r\n");
      out.write("		var cusId = $(\"#cusId\").val().trim();\r\n");
      out.write("		var cusPass = $(\"#cusPass\").val().trim();\r\n");
      out.write("		\r\n");
      out.write("		if(cusId == \"\"){\r\n");
      out.write("			alert(\"아이디를 입력해주세요.\")\r\n");
      out.write("			$(\"#cusId\").focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}//if\r\n");
      out.write("		\r\n");
      out.write("		if(cusPass == \"\"){\r\n");
      out.write("			alert(\"비밀번호를 입력해주세요.\");\r\n");
      out.write("			$(\"#cusPass\").focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		$(\"#loginFrm\").submit();\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	$(\"#joinMemberBtn\").click(function() {\r\n");
      out.write("		window.location.href = \"membershipPage.jsp\";\r\n");
      out.write("	});\r\n");
      out.write("});//ready()\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("<div id=\"header\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/customer/00.common/jsp/header.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"content-wrap\">\r\n");
      out.write("<div class=\"sub_visual bg-paik\">\r\n");
      out.write("    <div class=\"txt\">\r\n");
      out.write("        <h1>로그인</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"sub_section cmnt_wrap\">\r\n");
      out.write("    <div class=\"container\" style=\"max-width: 600px; margin: 0 auto; text-align: center;\">\r\n");
      out.write("        <h2 class=\"headHTxt\">로그인</h2>\r\n");
      out.write("        <form action=\"login_process.jsp\" id=\"loginFrm\" method=\"post\">\r\n");
      out.write("            <div id=\"loginContainer\">\r\n");
      out.write("            <table>\r\n");
      out.write("            	<tr>\r\n");
      out.write("            		<td><input type=\"text\" id=\"cusId\" name=\"cusId\" class=\"inputBox\" placeholder=\"아이디\" maxlength=\"20\"/></td>\r\n");
      out.write("            	</tr>\r\n");
      out.write("            	<tr>\r\n");
      out.write("            		<td><input type=\"password\" id=\"cusPass\" name=\"cusPass\" class=\"inputBox\" placeholder=\"비밀번호\" maxlength=\"24\"/></td>\r\n");
      out.write("            	</tr>\r\n");
      out.write("            	<tr>\r\n");
      out.write("            		<td><input type=\"button\" id=\"loginBtn\" class=\"loginBtn\" value=\"로그인\"/></td>\r\n");
      out.write("            	</tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                	<td><a href=\"http://paiks.sist.co.kr/customer/06.customer/find/findIdPage.jsp\">아이디찾기</a> <span class=\"txt\">|</span> \r\n");
      out.write("                		<a href=\"http://paiks.sist.co.kr/customer/06.customer/find/findPassPage.jsp\">비밀번호 찾기</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"memberContainer\">\r\n");
      out.write("            	<h4>아직 회원이 아니신가요?</h4>\r\n");
      out.write("            	<input type=\"button\" id=\"joinMemberBtn\" class=\"joinMemberBtn\" value=\"회원가입\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/customer/00.common/jsp/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
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