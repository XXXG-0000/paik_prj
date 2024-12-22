/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2024-11-15 05:37:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.customer._05_mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chkPass_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  public java.lang.String getServletInfo() {
    return "회원 인증 화면";
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
      out.write("\r\n");

	request.setCharacterEncoding("UTF-8");
	// 현재 접속하고 있는 URL을 저장 (반드시 리다이렉트 전에 수행)
	String currentUrl = request.getRequestURI();
	session.setAttribute("currentUrl", currentUrl); // 세션에 현재 URL 저장

	// 로그인 여부 체크
	String cusId = (String) session.getAttribute("cusId"); // 로그인된 사용자의 ID 세션에서 가져오기
	Boolean passwordVerified = (Boolean) session.getAttribute("passwordVerified"); // 비밀번호 검증 여부 세션에서 가져오기

	// 로그인 안 되어 있으면 로그인 페이지로 리다이렉트
	if (cusId == null || cusId.isEmpty()) {
		// 로그인되지 않았을 때 로컬 스토리지에 현재 URL을 저장하고 로그인 페이지로 리다이렉트
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().write("<script type=\"text/javascript\">\n" +
				"    localStorage.setItem('returnUrl', '" + currentUrl + "');\n" +
				"    alert('이 페이지는 로그인이 필요한 페이지입니다.');\n" +
				"    location.href = 'http://paiks.sist.co.kr/customer/06.customer/loginPage.jsp';\n" +
				"</script>");
		return;
	}
	// 로그인 되어 있으나 패스워드 검증이 안 된 경우, 비밀번호 인증 페이지로 리다이렉트
	if (passwordVerified == null || !passwordVerified) {
		// 패스워드 인증이 필요하면 인증 페이지로 리다이렉트
		response.sendRedirect("http://paiks.sist.co.kr/customer/05.mypage/confirm_password.jsp");
		return;
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko-KR\">\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"http://paiks.sist.co.kr/customer/00.common/images/btnImg.png\">\r\n");
      out.write("<title>빽스커피 | 비밀번호변경</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://paiks.sist.co.kr/customer/05.mypage/css/paik_chgPass.css\">\r\n");
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
      out.write("$(function() {\r\n");
      out.write("	$(\"#cusPass\").blur(function(){\r\n");
      out.write("		cusValidatePass();\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("	$(\"#newPass\").blur(function(){\r\n");
      out.write("		newValidatePass();\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	$(\"#chkPass\").blur(function(){\r\n");
      out.write("		validateChkPass();\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	$(\"#btnSubmit\").click(function() {\r\n");
      out.write("		if($(\"#cusPass\").val().trim() == \"\"){\r\n");
      out.write("			alert(\"비밀번호를 입력해주세요\");\r\n");
      out.write("			return;\r\n");
      out.write("		}//end if\r\n");
      out.write("\r\n");
      out.write("		if($(\"#newPass\").val().trim() == \"\"){\r\n");
      out.write("			alert(\"새 비밀번호를 입력해주세요\");\r\n");
      out.write("			return;\r\n");
      out.write("		}//end if\r\n");
      out.write("		\r\n");
      out.write("		if($(\"#chkPass\").val().trim() == \"\"){\r\n");
      out.write("			alert(\"새 비밀번호를 확인해주세요\");\r\n");
      out.write("			return;\r\n");
      out.write("		}//end if\r\n");
      out.write("		\r\n");
      out.write("		/* if(confirm(\"정말 회원 탈퇴를 진행하시겠습니까?\")){\r\n");
      out.write("		} */\r\n");
      out.write("		$(\"#memberFrm\").submit();			\r\n");
      out.write("	});//click\r\n");
      out.write("});//ready()\r\n");
      out.write("\r\n");
      out.write("//비밀번호 유효성 검증\r\n");
      out.write("function cusValidatePass() {\r\n");
      out.write("	var cusPass = $(\"#cusPass\").val().trim();\r\n");
      out.write("	\r\n");
      out.write("	if (cusPass.length < 8 || cusPass.length > 16 || !/(?=.*?[a-zA-Z])(?=.*?[0-9])/.test(cusPass)) {\r\n");
      out.write("		$(\"#passError1\").text(\"비밀번호는 8~24자이며, 영문 대소문자와 숫자를 모두 포함해야 합니다.\").show();\r\n");
      out.write("		return false;\r\n");
      out.write("	}//if\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	$(\"#passError1\").hide();\r\n");
      out.write("	return true;\r\n");
      out.write("}//validatePass()\r\n");
      out.write("\r\n");
      out.write("//비밀번호 유효성 검증\r\n");
      out.write("function newValidatePass() {\r\n");
      out.write("	var newPass = $(\"#newPass\").val().trim();\r\n");
      out.write("	\r\n");
      out.write("	if (newPass.length < 8 || newPass.length > 16 || !/(?=.*[a-zA-Z])(?=.*[0-9])/.test(newPass)) {\r\n");
      out.write("		$(\"#passError2\").text(\"비밀번호는 8~24자이며, 영문 대소문자와 숫자를 모두 포함해야 합니다.\").show();\r\n");
      out.write("		return false;\r\n");
      out.write("	}//if\r\n");
      out.write("	\r\n");
      out.write("	$(\"#passError2\").hide();\r\n");
      out.write("	return true;\r\n");
      out.write("}//validatePass()\r\n");
      out.write("\r\n");
      out.write("//비밀번호확인 유효성 검증\r\n");
      out.write("function validateChkPass() {\r\n");
      out.write("	var chkPass = $(\"#chkPass\").val().trim();\r\n");
      out.write("	var newPass = $(\"#newPass\").val().trim();\r\n");
      out.write("	\r\n");
      out.write("	if (chkPass == \"\") {\r\n");
      out.write("		$(\"#chkPassError\").text(\"비밀번호확인을 입력해주세요.\").show();\r\n");
      out.write("		$(\"#chkPassSuccess\").hide();\r\n");
      out.write("		return false;\r\n");
      out.write("	} else if (chkPass != newPass) {\r\n");
      out.write("		$(\"#chkPassError\").text(\"비밀번호가 일치하지 않습니다.\").show();\r\n");
      out.write("		$(\"#chkPassSuccess\").hide();\r\n");
      out.write("		return false;\r\n");
      out.write("	}//if~el\r\n");
      out.write("	\r\n");
      out.write("	$(\"#chkPassError\").hide();\r\n");
      out.write("	$(\"#chkPassSuccess\").text(\"비밀번호가 일치합니다.\").show();\r\n");
      out.write("	return true;\r\n");
      out.write("}//validateChkPass()\r\n");
      out.write("\r\n");
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
      out.write("	<div class=\"txt\">\r\n");
      out.write("		<h1>비밀번호 변경</h1>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"sub_section cmnt_wrap\">\r\n");
      out.write("	<div class=\"container\" style=\"max-width: 600px; margin: 0 auto;\">\r\n");
      out.write("		<h2 class=\"headHTxt\">비밀번호 변경</h2>\r\n");
      out.write("		<form id=\"memberFrm\" action=\"chkPass_process.jsp\" method=\"post\">\r\n");
      out.write("		<table>\r\n");
      out.write("			<tbody>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td class=\"contentTxt\">\r\n");
      out.write("						<span class=\"required\">• </span>\r\n");
      out.write("						<label for=\"cusPass\">현재 비밀번호</label>\r\n");
      out.write("					</td>\r\n");
      out.write("					<td>\r\n");
      out.write("						<div class=\"inputContainer\">\r\n");
      out.write("							<input type=\"password\" id=\"cusPass\" name=\"cusPass\" class=\"inputBox\" placeholder=\"비밀번호를 입력하세요\" maxlength=\"16\"/>\r\n");
      out.write("							<span class=\"txt\">(영문 대소문자/숫자/특수문자 중 2가지 이상 조합, 8자~24자)</span>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"msg\">\r\n");
      out.write("							<span id=\"passError1\" class=\"errorMsg\"></span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td class=\"contentTxt\">\r\n");
      out.write("						<span class=\"required\">• </span>\r\n");
      out.write("						<label for=\"newPass\">새 비밀번호</label>\r\n");
      out.write("					</td>\r\n");
      out.write("					<td>\r\n");
      out.write("						<div class=\"inputContainer\">\r\n");
      out.write("							<input type=\"password\" id=\"newPass\" name=\"newPass\" class=\"inputBox\" placeholder=\"비밀번호를 입력하세요\" maxlength=\"16\"/>\r\n");
      out.write("							<span class=\"txt\">(영문 대소문자/숫자/특수문자 중 2가지 이상 조합, 8자~24자)</span>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"msg\">\r\n");
      out.write("							<span id=\"passError2\" class=\"errorMsg\"></span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td class=\"contentTxt\">\r\n");
      out.write("						<span class=\"required\">• </span>\r\n");
      out.write("						<label for=\"chkPass\">비밀번호 확인</label>\r\n");
      out.write("					</td>\r\n");
      out.write("					<td>\r\n");
      out.write("						<div class=\"inputContainer\">\r\n");
      out.write("							<input type=\"password\" id=\"chkPass\" name=\"chkPass\" class=\"inputBox\" placeholder=\"비밀번호를 입력하세요\" maxlength=\"16\"/>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"msg\">\r\n");
      out.write("							<span id=\"chkPassError\" class=\"errorMsg\"></span>\r\n");
      out.write("							<span id=\"chkPassSuccess\" class=\"chkPassMsg\"></span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</tbody>\r\n");
      out.write("		</table>\r\n");
      out.write("		<div class=\"deleteBtn\">\r\n");
      out.write("		<input type=\"button\" id=\"btnSubmit\" class=\"btnSubmit\" value=\"확인\" >\r\n");
      out.write("		</div>\r\n");
      out.write("	</form>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/customer/00.common/jsp/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
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
