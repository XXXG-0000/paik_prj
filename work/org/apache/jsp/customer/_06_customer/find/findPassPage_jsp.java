/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2024-11-15 05:45:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.customer._06_customer.find;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class findPassPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  public java.lang.String getServletInfo() {
    return "사용자 비밀번호찾기화면";
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
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"http://paiks.sist.co.kr/customer/00.common/images/favicon.png\">\r\n");
      out.write("<title>빽스커피 | 비밀번호찾기</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://paiks.sist.co.kr/customer/06.customer/find/css/paik_find.css\">\r\n");
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("	var firstClickFlag = false;\r\n");
      out.write("	\r\n");
      out.write("	//아이디 입력 null 체크\r\n");
      out.write("	function chkId(){\r\n");
      out.write("		var cusId = $(\"#cusId\").val().trim();\r\n");
      out.write("		\r\n");
      out.write("		if(cusId == \"\"){\r\n");
      out.write("			$(\"#idError\").text(\"아이디를 입력해주세요.\").show();\r\n");
      out.write("			return false;\r\n");
      out.write("		}//if\r\n");
      out.write("		\r\n");
      out.write("		$(\"#idError\").hide();\r\n");
      out.write("		return true;\r\n");
      out.write("	}//chkId()\r\n");
      out.write("	\r\n");
      out.write("	//이름 입력 null 체크\r\n");
      out.write("	function chkName() {\r\n");
      out.write("		var name = $(\"#name\").val().trim();\r\n");
      out.write("		\r\n");
      out.write("		if(name == \"\"){\r\n");
      out.write("			$(\"#nameError\").text(\"이름을 입력해주세요.\").show();\r\n");
      out.write("			return false;\r\n");
      out.write("		}//if\r\n");
      out.write("		\r\n");
      out.write("		$(\"#nameError\").hide();\r\n");
      out.write("		return true;\r\n");
      out.write("	}//chkName()\r\n");
      out.write("\r\n");
      out.write("	//휴대폰 입력 null 체크\r\n");
      out.write("	function chkPhone() {\r\n");
      out.write("		var phone2 = $(\"#phone2\").val().trim();\r\n");
      out.write("		var phone3 = $(\"#phone3\").val().trim();\r\n");
      out.write("		\r\n");
      out.write("		if (phone2 == \"\") {\r\n");
      out.write("			$(\"#phoneError\").text(\"휴대폰 번호 중간자리를 입력해주세요.\").show();\r\n");
      out.write("			return false;\r\n");
      out.write("		}//if\r\n");
      out.write("		\r\n");
      out.write("		if (phone2.length != 4 || !/^\\d{4}$/.test(phone2)) {\r\n");
      out.write("			$(\"#phoneError\").text(\"휴대폰 번호 중간자리는 숫자 4자입니다.\").show();\r\n");
      out.write("			return false;\r\n");
      out.write("		}//if\r\n");
      out.write("		\r\n");
      out.write("		if (phone3 == \"\") {\r\n");
      out.write("			$(\"#phoneError\").text(\"휴대폰 번호 끝자리를 입력해주세요.\").show();\r\n");
      out.write("			return false;\r\n");
      out.write("		}//if\r\n");
      out.write("		\r\n");
      out.write("		if (phone3.length != 4 || !/^\\d{4}$/.test(phone3)) {\r\n");
      out.write("			$(\"#phoneError\").text(\"휴대폰 번호 끝자리는 숫자 4자입니다.\").show();\r\n");
      out.write("			return false;\r\n");
      out.write("		}//if\r\n");
      out.write("		\r\n");
      out.write("		$(\"#phoneError\").hide();\r\n");
      out.write("		return true;\r\n");
      out.write("	}//chkPhone()\r\n");
      out.write("\r\n");
      out.write("	//모든 입력 null 체크\r\n");
      out.write("	function chkAll() {\r\n");
      out.write("		var isValid = false;\r\n");
      out.write("		var errMsg = \"\";\r\n");
      out.write("		var errFields = [];\r\n");
      out.write("		\r\n");
      out.write("		if(!chkId()){ errMsg += \"\\n아이디를 확인해주세요.\"; errFields.push(\"#cusId\"); }//if\r\n");
      out.write("		if(!chkName()){ errMsg += \"\\n이름을 확인해주세요.\"; errFields.push(\"#name\"); }//if\r\n");
      out.write("		if(!chkPhone()){ errMsg += \"\\n휴대폰번호를 확인해주세요.\"; errFields.push(\"#phone2\"); }//if\r\n");
      out.write("		\r\n");
      out.write("		if(errFields.length != 0){\r\n");
      out.write("			$(errFields[0]).focus();\r\n");
      out.write("			alert(\"다음 항목을 확인하세요:\" + errMsg);\r\n");
      out.write("		} else {\r\n");
      out.write("			isValid = true;\r\n");
      out.write("		}//if~el\r\n");
      out.write("		\r\n");
      out.write("		return isValid;\r\n");
      out.write("	}//chkAll()\r\n");
      out.write("\r\n");
      out.write("	$(\"#findPassBtn\").click(function() {\r\n");
      out.write("		firstClickFlag = true;\r\n");
      out.write("		\r\n");
      out.write("		var isChks = chkAll();\r\n");
      out.write("		\r\n");
      out.write("		if(isChks){\r\n");
      out.write("			$(\"#findPassFrm\").submit();\r\n");
      out.write("		}//if~el\r\n");
      out.write("	});//findPassBtn - click\r\n");
      out.write("\r\n");
      out.write("	//실시간 입력 검증\r\n");
      out.write("	$(\"#cusId, #name, #phone2, #phone3\").on(\"input\", function() {\r\n");
      out.write("		if (firstClickFlag) {\r\n");
      out.write("			chkId();\r\n");
      out.write("			chkName();\r\n");
      out.write("			chkPhone();\r\n");
      out.write("		}//if\r\n");
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
      out.write("<div class=\"sub_visual bg-class\">\r\n");
      out.write("    <div class=\"txt\">\r\n");
      out.write("        <h1>비밀번호 찾기</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"sub_section cmnt_wrap\">\r\n");
      out.write("    <div class=\"container\" style=\"max-width: 600px; margin: 0 auto; text-align: center;\">\r\n");
      out.write("        <h2 class=\"headHTxt\">비밀번호 찾기</h2>\r\n");
      out.write("        <form action=\"findPass_process.jsp\" id=\"findPassFrm\" method=\"post\">\r\n");
      out.write("            <div id=\"findPassContainer\">\r\n");
      out.write("            <table>\r\n");
      out.write("            	<tr>\r\n");
      out.write("            		<td>\r\n");
      out.write("            			<label for=\"cusId\" class=\"contentTxt\">아이디</label>\r\n");
      out.write("            			<input type=\"text\" id=\"cusId\" name=\"cusId\" class=\"inputBox\" maxlength=\"20\"/>\r\n");
      out.write("            			<div class=\"msg\">\r\n");
      out.write("            				<span id=\"idError\" class=\"idError\"></span>\r\n");
      out.write("            			</div>\r\n");
      out.write("            		</td>\r\n");
      out.write("            	</tr>\r\n");
      out.write("            	<tr>\r\n");
      out.write("            		<td>\r\n");
      out.write("            			<label for=\"name\" class=\"contentTxt\">이름</label>\r\n");
      out.write("            			<input type=\"text\" id=\"name\" name=\"name\" class=\"inputBox\"/>\r\n");
      out.write("            			<div class=\"msg\">\r\n");
      out.write("            				<span id=\"nameError\" class=\"nameError\"></span>\r\n");
      out.write("            			</div>\r\n");
      out.write("            		</td>\r\n");
      out.write("            	</tr>\r\n");
      out.write("            	<tr>\r\n");
      out.write("            		<td>\r\n");
      out.write("            			<label for=\"phone1\" class=\"contentTxt\">휴대폰 번호</label>\r\n");
      out.write("            			<select id=\"phone1\" name=\"phone1\" class=\"inputPhoneBox\">\r\n");
      out.write("            				<option value=\"010\" selected>010</option>\r\n");
      out.write("            				<option value=\"011\">011</option>\r\n");
      out.write("            				<option value=\"016\">016</option>\r\n");
      out.write("            				<option value=\"017\">017</option>\r\n");
      out.write("            				<option value=\"018\">018</option>\r\n");
      out.write("            				<option value=\"019\">019</option>\r\n");
      out.write("            			</select>\r\n");
      out.write("            			 - <input type=\"text\" id=\"phone2\" name=\"phone2\" class=\"inputPhoneBox\" style=\"height: 48px;\" maxlength=\"4\"/>\r\n");
      out.write("            			 - <input type=\"text\" id=\"phone3\" name=\"phone3\" class=\"inputPhoneBox\" style=\"height: 48px;\" maxlength=\"4\"/>\r\n");
      out.write("            			 <div class=\"msg\">\r\n");
      out.write("            			 	<span id=\"phoneError\" class=\"phoneError\"></span>\r\n");
      out.write("            			 </div>\r\n");
      out.write("            		</td>\r\n");
      out.write("            	</tr>\r\n");
      out.write("            	<tr>\r\n");
      out.write("            		<td><input type=\"button\" id=\"findPassBtn\" class=\"findPassBtn\" value=\"확인\"/></td>\r\n");
      out.write("            	</tr>\r\n");
      out.write("            </table>\r\n");
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
