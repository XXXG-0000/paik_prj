/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2024-11-15 03:11:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manage.dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  public java.lang.String getServletInfo() {
    return "대시보드 페이지";
  }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/web_home/paik_prj/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1729132892000L));
    _jspx_dependants.put("/manage/common/jsp/manager_session_chk.jsp", Long.valueOf(1731635522000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");

    request.setCharacterEncoding("UTF-8");
    // 현재 접속하고 있는 URL을 저장한다. ( 꼭 리다이렉트 전에 해야함 )
    String currentUrl = request.getRequestURI().toString();
    pageContext.setAttribute("currentUrl", currentUrl);


      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"kor\" data-bs-theme=\"auto\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"author\" content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\r\n");
      out.write("    <title>Dashboard Template</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/@docsearch/css@3\">\r\n");
      out.write("    <link href=\"https://getbootstrap.com/docs/5.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("    <style>\r\n");
      out.write("\r\n");
      out.write("        @media (min-width: 768px) {\r\n");
      out.write("            .bd-placeholder-img-lg {\r\n");
      out.write("                font-size: 3.5rem;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .bi {\r\n");
      out.write("            vertical-align: -.125em;\r\n");
      out.write("            fill: currentColor;\r\n");
      out.write("        }\r\n");
      out.write("        .nav-scroller .nav {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-wrap: nowrap;\r\n");
      out.write("            padding-bottom: 1rem;\r\n");
      out.write("            margin-top: -1px;\r\n");
      out.write("            overflow-x: auto;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            white-space: nowrap;\r\n");
      out.write("            -webkit-overflow-scrolling: touch;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .bd-mode-toggle .dropdown-menu .active .bi {\r\n");
      out.write("            display: block !important;\r\n");
      out.write("        }\r\n");
      out.write("         .nav-item.dropdown .dropdown-menu {\r\n");
      out.write("             display: block;\r\n");
      out.write("             opacity: 0;\r\n");
      out.write("             visibility: hidden;\r\n");
      out.write("             transition: all 0.2s ease;\r\n");
      out.write("             margin-top: -10px;\r\n");
      out.write("         }\r\n");
      out.write("\r\n");
      out.write("        .nav-item.dropdown:hover .dropdown-menu {\r\n");
      out.write("            opacity: 1;\r\n");
      out.write("            visibility: visible;\r\n");
      out.write("            margin-top: 0;\r\n");
      out.write("        }\r\n");
      out.write("        .chart-container {\r\n");
      out.write("            height: 300px;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            border: 1px solid #CECECE;\r\n");
      out.write("            border-radius: 15px;\r\n");
      out.write("            box-shadow: 5px 5px #5A5D61;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"https://getbootstrap.com/docs/5.3/examples/dashboard/dashboard.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.6.0/font/bootstrap-icons.css\" />\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery CDN 시작 -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- dashboard.js 삽입-->\r\n");
      out.write("    <script src=\"../common/js/dashboard.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $(\"#exportBtn\").click(function () {\r\n");
      out.write("                if (confirm(\"엑셀 파일로 추출하시겠습니까?\")){\r\n");
      out.write("                    extraction();\r\n");
      out.write("                    return;\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        function extraction() {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: \"dashboard_export.jsp\",\r\n");
      out.write("                method: 'GET',\r\n");
      out.write("                xhrFields: {\r\n");
      out.write("                    responseType: 'blob'\r\n");
      out.write("                },\r\n");
      out.write("                success: function(data, status, xhr) {\r\n");
      out.write("                    const blob = new Blob([data], { type: 'application/vnd.ms-excel' });\r\n");
      out.write("                    const url = window.URL.createObjectURL(blob);\r\n");
      out.write("                    const a = document.createElement('a');\r\n");
      out.write("                    const fileName = xhr.getResponseHeader('Content-Disposition')?.split('filename=')[1] || 'dashboard_report.xls';\r\n");
      out.write("\r\n");
      out.write("                    a.href = url;\r\n");
      out.write("                    a.download = fileName;\r\n");
      out.write("                    document.body.appendChild(a);\r\n");
      out.write("                    a.click();\r\n");
      out.write("\r\n");
      out.write("                    window.URL.revokeObjectURL(url);\r\n");
      out.write("                    document.body.removeChild(a);\r\n");
      out.write("                },\r\n");
      out.write("                error: function(xhr) {\r\n");
      out.write("                    alert('엑셀 파일 다운로드 중 오류가 발생했습니다.\\n' + xhr.status);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/svg.jsp", out, false);
      out.write(" <!-- svg -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/headbar.jsp", out, false);
      out.write(" <!-- headbar -->\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"border border-right col-md-3 col-lg-2 p-0 bg-body-tertiary\" style=\"height: 900px\">\r\n");
      out.write("            <div class=\"offcanvas-md offcanvas-end bg-body-tertiary\" tabindex=\"-1\" id=\"sidebarMenu\" aria-labelledby=\"sidebarMenuLabel\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"offcanvas-body d-md-flex flex-column p-0 pt-lg-3 overflow-y-auto\">\r\n");
      out.write("                    <ul class=\"nav nav-pills flex-column\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link d-flex align-items-center gap-2 active\" aria-current=\"page\" href=\"http://paiks.sist.co.kr/manage/dashboard/dashboard.jsp\">\r\n");
      out.write("                                <i class=\"bi bi-house\"></i>\r\n");
      out.write("                                관리자 대시보드\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link d-flex align-items-center gap-2\" href=\"http://paiks.sist.co.kr/manage/menu/selectCoffeeList.jsp\">\r\n");
      out.write("                                <svg class=\"bi\"><use xlink:href=\"#cup-hot\"/></svg>\r\n");
      out.write("                                음료 관리\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link d-flex align-items-center gap-2\" href=\"http://paiks.sist.co.kr/manage/menu/selectDessertList.jsp\">\r\n");
      out.write("                            	<svg class=\"bi\"><use xlink:href=\"#cake\"/></svg>\r\n");
      out.write("                                디저트&아이스크림 관리\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link d-flex align-items-center gap-2\" href=\"http://paiks.sist.co.kr/manage/order/selectNotReceivedOrderList.jsp\">\r\n");
      out.write("                                <i class=\"bi bi-cart\"></i>\r\n");
      out.write("                                	주문 관리\r\n");
      out.write("                            </a>                                                        \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link d-flex align-items-center gap-2\" href=\"http://paiks.sist.co.kr/manage/customer/list_customer.jsp\">\r\n");
      out.write("                                <i class=\"bi bi-people\"></i>\r\n");
      out.write("                                회원 관리\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link d-flex align-items-center gap-2\" href=\"http://paiks.sist.co.kr/manage/voc/getListCustomSound.jsp\">\r\n");
      out.write("								<i class=\"bi bi-file-earmark-bar-graph\"></i>\r\n");
      out.write("                                고객의 소리\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li> -->\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                    <hr class=\"my-3\">\r\n");
      out.write("                    <ul class=\"nav flex-column mb-auto\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link d-flex align-items-center gap-2\" href=\"http://paiks.sist.co.kr/manage/logout.jsp\">\r\n");
      out.write("                                <svg class=\"bi\"><use xlink:href=\"#door-closed\"/></svg>\r\n");
      out.write("                                로그아웃\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <main class=\"col-md-9 ms-sm-auto col-lg-10 px-md-4\">\r\n");
      out.write("            <div class=\"d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom\">\r\n");
      out.write("                <div class=\"btn-toolbar mb-2 mb-md-0\">\r\n");
      out.write("                    <div class=\"btn-group me-1\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\" id=\"exportBtn\" name=\"exportBtn\">추출</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary d-flex align-items-center gap-1\">\r\n");
      out.write("                        <i class=\"bi bi-calendar-date\"></i>\r\n");
      out.write("                        ");

                            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                            Date date = new Date();
                            out.print(sdf.format(date));
                        
      out.write("\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"chart-container\">\r\n");
      out.write("                        <canvas id=\"chart1\"></canvas>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"chart-container\">\r\n");
      out.write("                        <canvas id=\"chart2\"></canvas>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"chart-container\">\r\n");
      out.write("                        <canvas id=\"chart3\"></canvas>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"chart-container\">\r\n");
      out.write("                        <canvas id=\"chart4\"></canvas>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("    </div>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /manage/common/jsp/manager_session_chk.jsp(11,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty managerId}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <script type=\"text/javascript\">\r\n");
          out.write("        // 현재 URL 저장\r\n");
          out.write("        localStorage.setItem(\"returnUrl\",\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\");\r\n");
          out.write("        alert(\"이 페이지는 관리자 로그인이 필요한 페이지입니다.\");\r\n");
          out.write("        location.href=\"http://paiks.sist.co.kr/manage/index.jsp\"\r\n");
          out.write("    </script>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
