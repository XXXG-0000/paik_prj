/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2024-11-15 03:07:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.customer._00_common.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  public java.lang.String getServletInfo() {
    return "공통디자인 - 사용자 페이지 footer";
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
      out.write("<footer>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("	<div class=\"in_footer\">\r\n");
      out.write("		<a class=\"logo\" href=\"\"><img src=\"http://paiks.sist.co.kr/customer/00.common/images/logo.png\" alt=\"더본로고\"></a>\r\n");
      out.write("		<a class=\"logo light\" href=\"\"><img src=\"http://paiks.sist.co.kr/customer/00.common/images/logo-2.png\" alt=\"더본로고\"></a>\r\n");
      out.write("		<div class=\"company_info\">\r\n");
      out.write("			<ul><li><a href=\"https://www.theborn.co.kr/agreement/\" target=\"_blank\" style=\"font-weight:800;\">개인정보처리방침</a></li></ul>\r\n");
      out.write("			<ul>\r\n");
      out.write("				<li>(주)더본코리아</li>\r\n");
      out.write("				<li>사업자등록번호 211-86-00870</li>\r\n");
      out.write("				<li>대표이사 김현우</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<ul>\r\n");
      out.write("				<li>주소: 서울특별시 강남구 테헤란로 132 한독빌딩 8층</li>\r\n");
      out.write("				<li>팩스: 02-511-3864</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<ul>\r\n");
      out.write("				<li>본사 대표전화: 02-549-3864</li>\r\n");
      out.write("				<li>가맹상담전화: 02-3447-0410</li>\r\n");
      out.write("				<li>고객센터: 1544-2360</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<p class=\"copyright\">COPYRIGHTⓒ 2018 THEBORN KOREA INC. ALL RIGHTS RESERVED</p>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"to_top\">\r\n");
      out.write("		<span></span>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("</footer>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("//MOBILE MENU\r\n");
      out.write("jQuery(\"header .nav .nav-icon\").click(function() {\r\n");
      out.write("	jQuery(this).toggleClass(\"active\");\r\n");
      out.write("	jQuery(\"header .navbar\").toggleClass(\"active\");\r\n");
      out.write("\r\n");
      out.write("	jQuery(\".overlay\").fadeToggle();\r\n");
      out.write("	jQuery(\".overlay\").css(\"z-index\",\"1\");\r\n");
      out.write("});\r\n");
      out.write("jQuery(document).on(\"click\",\"header .navbar.active .menu-item-has-children>a\",function() {\r\n");
      out.write("	jQuery(this).removeAttr(\"href\");\r\n");
      out.write("	jQuery(this).toggleClass(\"on\");\r\n");
      out.write("	jQuery(this).next(\".sub-menu\").slideToggle().parents().siblings().children(\".sub-menu\").slideUp();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("//PC MENU\r\n");
      out.write("jQuery(\".in_header .nav .navbar>.menu-item-has-children\").on(\"mouseenter\",function(){\r\n");
      out.write("	jQuery(\".sub-bg\").addClass(\"on\");\r\n");
      out.write("});\r\n");
      out.write("jQuery(\".in_header .nav .navbar>.menu-item-has-children\").on(\"mouseleave\",function(){\r\n");
      out.write("	jQuery(\".sub-bg\").removeClass(\"on\");\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("//TOP button\r\n");
      out.write("$(window).scroll(function(){\r\n");
      out.write("	if($(this).scrollTop() > 1){\r\n");
      out.write("		$('.to_top').fadeIn();\r\n");
      out.write("	}else{\r\n");
      out.write("		$('.to_top').fadeOut();\r\n");
      out.write("	}\r\n");
      out.write("});\r\n");
      out.write("jQuery('.to_top').click(function() {\r\n");
      out.write("	jQuery('html, body').animate({\r\n");
      out.write("		scrollTop: 0\r\n");
      out.write("	}, 400);\r\n");
      out.write("	return false;\r\n");
      out.write("});\r\n");
      out.write("</script>");
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