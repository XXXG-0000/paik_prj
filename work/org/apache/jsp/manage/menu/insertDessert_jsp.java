/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2024-11-15 05:59:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manage.menu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertDessert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  public java.lang.String getServletInfo() {
    return "디저트를 추가하는 페이지";
  }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/web_home/paik_prj/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1729132892000L));
  }

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

	//인코딩
	request.setCharacterEncoding("UTF-8");

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\" data-bs-theme=\"auto\">\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"/docs/5.3/assets/js/color-modes.js\"></script>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\r\n");
      out.write("    <meta name=\"generator\" content=\"Hugo 0.122.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://paiks.sist.co.kr/manage/common/css/orderStateList.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://paiks.sist.co.kr/manage/common/css/orderDetails.css\">\r\n");
      out.write("    <title>디저트 추가</title>\r\n");
      out.write("    <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/5.3/examples/dashboard/\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://paiks.sist.co.kr/manage/common/css/project_main.css\">\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"http://paiks.sist.co.kr/manage/common/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"http://paiks.sist.co.kr/manage/common/css/dashboard.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@10\"></script>\r\n");
      out.write("    \r\n");
      out.write("	<!-- bootstrap -->\r\n");
      out.write("    <link href=\"bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.6.0/font/bootstrap-icons.css\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.7.1.js\"></script>    \r\n");
      out.write("	<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.4.10/dist/sweetalert2.min.css\">\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.4.10/dist/sweetalert2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <meta name=\"theme-color\" content=\"#712cf9\"> \r\n");
      out.write("    <style type=\"text/css\">\r\n");
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
      out.write("        \r\n");
      out.write("        h1 {\r\n");
      out.write("		    font-size: 24px;\r\n");
      out.write("		    color: #333;\r\n");
      out.write("		    text-align: center;\r\n");
      out.write("		    margin-bottom: 20px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("        form { max-width: 500px; margin: 0 auto; }\r\n");
      out.write("		\r\n");
      out.write("		label {\r\n");
      out.write("		    font-size: 16px;\r\n");
      out.write("		    margin-bottom: 5px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		input[type=\"text\"], textarea, input[type=\"file\"] {\r\n");
      out.write("		    width: 100%;\r\n");
      out.write("		    padding: 10px;\r\n");
      out.write("		    margin-bottom: 15px;\r\n");
      out.write("		    border: 1px solid #ddd;\r\n");
      out.write("		    border-radius: 5px;\r\n");
      out.write("		    font-size: 14px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		textarea {\r\n");
      out.write("		    resize: none;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		fieldset {\r\n");
      out.write("		    border: 1px solid #ddd;\r\n");
      out.write("		    padding: 10px;\r\n");
      out.write("		    margin-bottom: 15px;\r\n");
      out.write("		    border-radius: 5px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		legend {\r\n");
      out.write("		    font-size: 16px;\r\n");
      out.write("		    color: #333;\r\n");
      out.write("		    padding: 0 10px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		label input {\r\n");
      out.write("		    margin-right: 10px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		button {\r\n");
      out.write("		    padding: 10px 20px;\r\n");
      out.write("		    font-size: 16px;\r\n");
      out.write("		    background-color: #b12704;\r\n");
      out.write("		    color: white;\r\n");
      out.write("		    border: none;\r\n");
      out.write("		    border-radius: 5px;\r\n");
      out.write("		    cursor: pointer;\r\n");
      out.write("		    transition: background-color 0.3s ease;\r\n");
      out.write("		    margin-top: 10px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		button:hover {\r\n");
      out.write("		    background-color: #a02603;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		/* 이미지 업로드 미리보기 */\r\n");
      out.write("		.image-upload {\r\n");
      out.write("		    display: flex;\r\n");
      out.write("		    align-items: center;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.image-upload img {\r\n");
      out.write("		    width: 100px;\r\n");
      out.write("		    height: 100px;\r\n");
      out.write("		    margin-bottom: 10px;\r\n");
      out.write("		    margin-right: 10px;\r\n");
      out.write("		    border-radius: 5px;\r\n");
      out.write("		    object-fit: cover;\r\n");
      out.write("		    border: 1px solid #ddd;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		/* 옵션 설정 체크박스 */\r\n");
      out.write("		.option {\r\n");
      out.write("		    display: flex;\r\n");
      out.write("		    justify-content: space-between;\r\n");
      out.write("		    align-items: center;\r\n");
      out.write("		    padding: 2px;\r\n");
      out.write("		    border-radius: 5px;\r\n");
      out.write("		    margin-bottom: 2px;\r\n");
      out.write("		    transition: background-color 0.3s ease;\r\n");
      out.write("		    \r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		input[type=\"checkbox\"] {\r\n");
      out.write("		    margin-left: auto;\r\n");
      out.write("		    transform: scale(1.2);\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		/* 체크박스 선택 시 배경색 변경 */\r\n");
      out.write("		input[type=\"checkbox\"]:checked + label {\r\n");
      out.write("		    background-color: #d4f1c5;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		input[type=\"checkbox\"]:checked {\r\n");
      out.write("		    background-color: #d4f1c5;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.option-actions {\r\n");
      out.write("		    display: flex;\r\n");
      out.write("		    justify-content: space-between;\r\n");
      out.write("		    align-items: center;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.option-actions input {\r\n");
      out.write("		    width: 50%;\r\n");
      out.write("		    margin-right: 10px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.option-actions button {\r\n");
      out.write("		    width: 22%;\r\n");
      out.write("		}\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("	    $(function(){\r\n");
      out.write("	    	$(\"#btnInsert\").click(function(){\r\n");
      out.write("				chkNull();\r\n");
      out.write("			});//click\r\n");
      out.write("			\r\n");
      out.write("			$(\"#image\").change(function(evt){\r\n");
      out.write("				preview(evt);\r\n");
      out.write("			})//change\r\n");
      out.write("			\r\n");
      out.write("			$(\"#btnUpload\").click(function(){\r\n");
      out.write("				ajaxFileUpload();\r\n");
      out.write("			});//click\r\n");
      out.write("			\r\n");
      out.write("	    });//ready\r\n");
      out.write("	    \r\n");
      out.write("	    function ajaxFileUpload(){\r\n");
      out.write("	    	if($(\"#image\").val() == \"\"){\r\n");
      out.write("	    		alert(\"이미지를 선택해주세요\");\r\n");
      out.write("	    		return;\r\n");
      out.write("	    	}\r\n");
      out.write("	    	\r\n");
      out.write("	    	//1. form 태그 얻기 // formControl의 값을 AJAX로 전달\r\n");
      out.write("	    	var form=$(\"#insertFrm\")[0];\r\n");
      out.write("	    	alert(form);//object HtmlInputElement\r\n");
      out.write("	    	\r\n");
      out.write("	    	//2. HTML Form Control의 값을 data 속성으로 전달하기 위해 생성\r\n");
      out.write("	    	var formData = new FormData(form);\r\n");
      out.write("	    	\r\n");
      out.write("	    	$.ajax({\r\n");
      out.write("	    		url:\"upload_img_process.jsp\",\r\n");
      out.write("	    		contentType: false,\r\n");
      out.write("	    		processData: false,\r\n");
      out.write("	    		data: formData,\r\n");
      out.write("	    		type: \"post\",\r\n");
      out.write("	    		dataType: \"json\",\r\n");
      out.write("	    		error:function(xhr){\r\n");
      out.write("	    			console.log(xhr.status);\r\n");
      out.write("	    			alert(\"이미지 업로드 실패\");\r\n");
      out.write("	    		},\r\n");
      out.write("	    		success:function(jsonObj){\r\n");
      out.write("	    			//alert(jsonObj.uploadflag)//false\r\n");
      out.write("	    			var msg=\"이미지 업로드 실패\";\r\n");
      out.write("	    			if(!jsonObj.uploadflag){\r\n");
      out.write("	    				msg=\"이미지가 업로드 되었습니다.\"\r\n");
      out.write("	    			}\r\n");
      out.write("	    			alert(msg);\r\n");
      out.write("	    		}\r\n");
      out.write("	    	});\r\n");
      out.write("	    }\r\n");
      out.write("	    \r\n");
      out.write("	    function preview(evt){\r\n");
      out.write("	    	if($(\"#image\").val() == \"\"){\r\n");
      out.write("	    		alert(\"이미지를 선택해주세요\");\r\n");
      out.write("	    		return;\r\n");
      out.write("	    	}\r\n");
      out.write("	    	\r\n");
      out.write("	    	//1. 파일 컴포넌트 얻기\r\n");
      out.write("	    	var file = evt.target.files[0];\r\n");
      out.write("	    	//2. 스트림 생성\r\n");
      out.write("	    	var reader = new FileReader();\r\n");
      out.write("	    	//3. FileReader객체의 onload 이벤트 핸들러를 설정\r\n");
      out.write("	    	reader.onload = function(evt2){\r\n");
      out.write("	    		$(\"#preview\").prop(\"src\",evt2.target.result);\r\n");
      out.write("	    	}\r\n");
      out.write("	    	\r\n");
      out.write("	    	//4. 파일에서 읽어들여 실제 img 태그에 출력(미리보기)\r\n");
      out.write("	    	reader.readAsDataURL(file);\r\n");
      out.write("	    }\r\n");
      out.write("	\r\n");
      out.write("	    function chkNull(){\r\n");
      out.write("			// 이름 체크\r\n");
      out.write("			if($(\"#nameKor\").val().trim() == \"\"){\r\n");
      out.write("				alert(\"이름은 필수 입력입니다!\");\r\n");
      out.write("				$(\"#nameKor\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			if($(\"#nameEng\").val().trim() == \"\"){\r\n");
      out.write("				alert(\"이름은 필수 입력입니다!\");\r\n");
      out.write("				$(\"#nameEng\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			// 가격 체크\r\n");
      out.write("			if($(\"#price\").val().trim() == \"\"){\r\n");
      out.write("				alert(\"가격은 필수 입력입니다!\");\r\n");
      out.write("				$(\"#price\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			// 설명 체크\r\n");
      out.write("			if($(\"#description\").val().trim() == \"\"){\r\n");
      out.write("				alert(\"설명은 필수 입력입니다!\");\r\n");
      out.write("				$(\"#description\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			// 이미지 첨부 체크\r\n");
      out.write("			if(!$(\"#image\").val()){\r\n");
      out.write("				alert(\"이미지 첨부는 필수입니다!\");\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			// 카테고리 설정 체크\r\n");
      out.write("			if(!$('input:radio[name=\"categoriesNum\"]').is(':checked')){\r\n");
      out.write("				alert(\"카테고리 설정은 필수입니다!\");\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			// 영양 성분표 제공 여부\r\n");
      out.write("			if(!$('input:radio[name=\"ingredientFlag\"]').is(':checked')){\r\n");
      out.write("				alert(\"영양 성분표 제공 여부 설정은 필수입니다!\");\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			// 영양 성분표 제공시\r\n");
      out.write("			if(('input:radio[name=\"ingredientFlag\"]:checked').val == \"Y\"){\r\n");
      out.write("				// 카페인\r\n");
      out.write("				if($(\"#caffeine\").val() == \"\"){\r\n");
      out.write("					alert(\"카페인 성분량을 입력해 주세요!\");\r\n");
      out.write("					$(\"#caffeine\").focus();\r\n");
      out.write("					return;\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				// 칼로리\r\n");
      out.write("				if($(\"#calorie\").val() == \"\"){\r\n");
      out.write("					alert(\"칼로리를 입력해주세요!\");\r\n");
      out.write("					$(\"#calorie\").focus();\r\n");
      out.write("					return;\r\n");
      out.write("				}\r\n");
      out.write("				// 나트륨\r\n");
      out.write("				if($(\"#natrium\").val() == \"\"){\r\n");
      out.write("					alert(\"나트륨 성분량을 입력해주세요!\");\r\n");
      out.write("					$(\"#natrium\").focus();\r\n");
      out.write("					return;\r\n");
      out.write("				}\r\n");
      out.write("				// 당류\r\n");
      out.write("				if($(\"#sugar\").val() == \"\"){\r\n");
      out.write("					alert(\"당류 성분량을 입력해주세요!\");\r\n");
      out.write("					$(\"#sugar\").focus();\r\n");
      out.write("					return;\r\n");
      out.write("				}\r\n");
      out.write("				// 포화지방\r\n");
      out.write("				if($(\"#fattyAcid\").val() == \"\"){\r\n");
      out.write("					alert(\"포화지방 성분량을 입력해주세요!\");\r\n");
      out.write("					$(\"#fattyAcid\").focus();\r\n");
      out.write("					return;\r\n");
      out.write("				}\r\n");
      out.write("				// 단백질\r\n");
      out.write("				if($(\"#protein\").val() == \"\"){\r\n");
      out.write("					alert(\"성분을 입력해주세요!\");\r\n");
      out.write("					$(\"#protein\").focus();\r\n");
      out.write("					return;\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			$(\"#insertFrm\").submit();\r\n");
      out.write("	    }\r\n");
      out.write("	\r\n");
      out.write("	    // 이미지 미리보기 기능\r\n");
      out.write("        function previewImage(event) {\r\n");
      out.write("            const reader = new FileReader();\r\n");
      out.write("            reader.onload = function(){\r\n");
      out.write("                const imagePreview = document.getElementById('image-preview');\r\n");
      out.write("                imagePreview.src = reader.result;\r\n");
      out.write("                imagePreview.style.display = 'block';\r\n");
      out.write("            }\r\n");
      out.write("            reader.readAsDataURL(event.target.files[0]);\r\n");
      out.write("        }\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/svg.jsp", out, false);
      out.write(" <!-- svg -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/headbar.jsp", out, false);
      out.write(" <!-- headbar -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"border border-right col-md-3 col-lg-2 p-0 bg-body-tertiary\">\r\n");
      out.write("            <div class=\"offcanvas-md offcanvas-end bg-body-tertiary\" tabindex=\"-1\" id=\"sidebarMenu\" aria-labelledby=\"sidebarMenuLabel\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"offcanvas-body d-md-flex flex-column p-0 pt-lg-3 overflow-y-auto\">\r\n");
      out.write("                    <ul class=\"nav nav-pills flex-column\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link d-flex align-items-center gap-2\" aria-current=\"page\" href=\"http://paiks.sist.co.kr/manage/dashboard/dashboard.jsp\">\r\n");
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
      out.write("                            <a class=\"nav-link d-flex align-items-center gap-2 active\" href=\"http://paiks.sist.co.kr/manage/menu/selectDessertList.jsp\">\r\n");
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
      out.write("                            <a class=\"nav-link d-flex align-items-center gap-2\" href=\"#\">\r\n");
      out.write("                                <svg class=\"bi\"><use xlink:href=\"#door-closed\"/></svg>\r\n");
      out.write("                                로그아웃\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <main class=\"col-md-9 ms-sm-auto col-lg-10 px-md-4\">\r\n");
      out.write("            <div class=\"d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom\">\r\n");
      out.write("                <h1 class=\"h2\"><strong>디저트 추가</strong></h1>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"plus-container\">\r\n");
      out.write("		\r\n");
      out.write("		        <form action=\"insertDessertProcess.jsp\" name=\"insertFrm\" id=\"insertFrm\" method=\"post\" accept-charset=\"UTF-8\">\r\n");
      out.write("		            <!-- 음료 이름 -->\r\n");
      out.write("		            <label for=\"dessert-name\">이름</label>\r\n");
      out.write("		            <input type=\"text\" id=\"nameKor\" name=\"iNameK\" placeholder=\"디저트 이름을 입력하세요\">\r\n");
      out.write("		            <label for=\"dessert-name\">영어 이름</label>\r\n");
      out.write("		            <input type=\"text\" id=\"nameEng\" name=\"iNameE\" placeholder=\"디저트 영어 이름을 입력하세요\">\r\n");
      out.write("		\r\n");
      out.write("		            <!-- 가격 -->\r\n");
      out.write("		            <label for=\"dessert-price\">가격</label>\r\n");
      out.write("		            <input type=\"text\" id=\"price\" name=\"price\" placeholder=\"가격을 입력하세요\">\r\n");
      out.write("		\r\n");
      out.write("		            <!-- 설명 -->\r\n");
      out.write("		            <label for=\"dessert-description\">설명</label>\r\n");
      out.write("		            <textarea id=\"description\" name=\"description\" rows=\"4\" placeholder=\"디저트 설명을 입력하세요\"></textarea>\r\n");
      out.write("		\r\n");
      out.write("		            <!-- 이미지 추가 -->\r\n");
      out.write("		            <label for=\"drink-image\">이미지</label>\r\n");
      out.write("		            <div class=\"image-upload\">\r\n");
      out.write("		                <img id=\"preview\" src=\"#\" alt=\"이미지 미리보기\" style=\"display: none;\" title=\"새 파일\">\r\n");
      out.write("		                <input type=\"file\" id=\"image\" name=\"image\" accept=\"image/*\" style=\"border: none;\">\r\n");
      out.write("		                <input type=\"button\" value=\"이미지 업로드\" id=\"btnUpload\" class=\"btn btn-sm btn-success\" style=\"margin-bottom: 20px;\"/>\r\n");
      out.write("		            </div>\r\n");
      out.write("		\r\n");
      out.write("		            <!-- 카테고리 구분 -->\r\n");
      out.write("		            <fieldset>\r\n");
      out.write("		                <legend>카테고리</legend>\r\n");
      out.write("		                <label>디저트<input type=\"radio\" name=\"categoriesNum\" value=\"2\" checked=\"checked\"></label>\r\n");
      out.write("		            </fieldset>\r\n");
      out.write("		\r\n");
      out.write("		            <!-- 영양 성분표 제공 여부 -->\r\n");
      out.write("		            <fieldset>\r\n");
      out.write("				    <legend>영양 성분표 제공 여부:</legend>\r\n");
      out.write("				    <label><input type=\"radio\" name=\"ingredientFlag\" value=\"Y\" onclick=\"toggleTable(true)\"> 제공</label>\r\n");
      out.write("				    <label><input type=\"radio\" name=\"ingredientFlag\" value=\"N\" onclick=\"toggleTable(false)\" checked=\"checked\"> 미제공</label>\r\n");
      out.write("		\r\n");
      out.write("				   <!-- <table id=\"ingredientTable\">\r\n");
      out.write("				        <tr>\r\n");
      out.write("				            <th>성분</th>\r\n");
      out.write("				            <th>함량</th>\r\n");
      out.write("				        </tr>\r\n");
      out.write("				        <tr>\r\n");
      out.write("				            <td>카페인</td>\r\n");
      out.write("				            <td><input type=\"text\" name=\"caffeine\" value=\"0\"></td>\r\n");
      out.write("				        </tr>\r\n");
      out.write("				        <tr>\r\n");
      out.write("				            <td>칼로리</td>\r\n");
      out.write("				            <td><input type=\"text\" name=\"calorie\" value=\"386\"></td>\r\n");
      out.write("				        </tr>\r\n");
      out.write("				        <tr>\r\n");
      out.write("				            <td>나트륨</td>\r\n");
      out.write("				            <td><input type=\"text\" name=\"natrium\" value=\"498\"></td>\r\n");
      out.write("				        </tr>\r\n");
      out.write("				        <tr>\r\n");
      out.write("				            <td>당류</td>\r\n");
      out.write("				            <td><input type=\"text\" name=\"sugar\" value=\"8\"></td>\r\n");
      out.write("				        </tr>\r\n");
      out.write("				        <tr>\r\n");
      out.write("				            <td>포화지방</td>\r\n");
      out.write("				            <td><input type=\"text\" name=\"fattyAcid\" value=\"5\"></td>\r\n");
      out.write("				        </tr>\r\n");
      out.write("				        <tr>\r\n");
      out.write("				            <td>단백질</td>\r\n");
      out.write("				            <td><input type=\"text\" name=\"protein\" value=\"9\"></td>\r\n");
      out.write("				        </tr>\r\n");
      out.write("				    </table> -->\r\n");
      out.write("				</fieldset>\r\n");
      out.write("		\r\n");
      out.write("		            <!-- 제출 버튼 -->\r\n");
      out.write("		            <button type=\"button\" class=\"btn btn-primary\" id=\"btnInsert\">추가 메뉴 저장</button>\r\n");
      out.write("		        </form>\r\n");
      out.write("		    </div>\r\n");
      out.write("		<canvas class=\"my-4 w-100\" id=\"myChart\" width=\"900\" height=\"100\"></canvas>\r\n");
      out.write("        </main>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"chart.umd.js\" integrity=\"sha384-eI7PSr3L1XLISH8JdDII5YN/njoSsxfbrkCTnJrzXt+ENP5MOVBxD+l6sEG4zoLp\" crossorigin=\"anonymous\"></script><script src=\"dashboard.js\"></script></body>\r\n");
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
