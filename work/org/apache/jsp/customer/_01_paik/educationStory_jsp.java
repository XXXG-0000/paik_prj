/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2024-11-15 03:07:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.customer._01_paik;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class educationStory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  public java.lang.String getServletInfo() {
    return "교육이야기 화면";
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

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/customer/05.mypage/remove_password_verified.jsp", out, false);
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko-KR\">\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"http://paiks.sist.co.kr/customer/00.common/images/btnImg.png\">\r\n");
      out.write("\r\n");
      out.write("<title>빽스커피  :::  교육이야기</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" id=\"theme-css-style-css\" href=\"https://paikdabang.com/wp-content/themes/paikdabang/assets/css/paiks_style.css\" type=\"text/css\" media=\"all\">\r\n");
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
      out.write("	\r\n");
      out.write("});//ready()\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/customer/00.common/jsp/header.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("jQuery(document).ready(function(){\r\n");
      out.write("	jQuery('.menu-item-1019 a').attr('target','_blank');\r\n");
      out.write("	jQuery('.menu-item-17246 a').attr('target','_blank');\r\n");
      out.write("	jQuery('.menu-item-17247 a').attr('target','_blank');\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"content-wrap\">\r\n");
      out.write("<div id=\"primary\" class=\"content-area\">\r\n");
      out.write("<main id=\"main\" class=\"site-main\" role=\"main\">\r\n");
      out.write("<article id=\"post-17763\" class=\"post-17763 page type-page status-publish hentry\">\r\n");
      out.write("<div class=\"entry-content\">\r\n");
      out.write("<p>");
      out.write("</p>\r\n");
      out.write("	<div class=\"sub_visual bg-paik\">\r\n");
      out.write("	<div class=\"txt\">\r\n");
      out.write("		<h1>빽스커피</h1>\r\n");
      out.write("		<p>합리적인 가격, 놀라운 퀄리티의 커피전문점 &#8220;빽스커피&#8221;입니다.</p>\r\n");
      out.write("	</div>\r\n");
      out.write("	<ul class=\"page_tab st-2\">\r\n");
      out.write("		<li><a href=\"http://paiks.sist.co.kr/customer/01.paik/introduction.jsp\">빽스커피 소개</a></li>\r\n");
      out.write("		<li><a href=\"http://paiks.sist.co.kr/customer/01.paik/coffeeStory.jsp\">커피 이야기</a></li>\r\n");
      out.write("		<li class=\"on\"><a href=\"http://paiks.sist.co.kr/customer/01.paik/educationStory.jsp\">교육 이야기</a></li>\r\n");
      out.write("	</ul>\r\n");
      out.write("	</div>\r\n");
      out.write("<p>");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<div class=\"edu_story\">\r\n");
      out.write("	<div class=\"barista_con\">\r\n");
      out.write("		<h2 class=\"con_tt\">빽<em>&#8216;S</em> 바리스타란?</h2>\r\n");
      out.write("		<dl class=\"bari_info\">\r\n");
      out.write("			<dt><em>빽스커피만의 자격검정제도</em>로, <span class=\"block_txt\">커피 추출, 메뉴 제조, 위생, 고객 응대 및 서비스 등</span> 빽스커피 바리스타로서의 역량을 섬세하게 평가하는 제도입니다.</dt>\r\n");
      out.write("			<dd>한국산업인력공단에서 인증을 완료한 사업 내 자격검정 제도입니다. (2급 : 19년 9월 / 1급 : 20년 7월 인증 완료)</dd>\r\n");
      out.write("		</dl>\r\n");
      out.write("		\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li>\r\n");
      out.write("				<div class=\"bari_img\"><img src=\"http://paiks.sist.co.kr/customer/01.paik/images/barista_img01.jpg\" alt=\"바리스타 2급\" /></div>\r\n");
      out.write("				<div class=\"bari_txt\">\r\n");
      out.write("					<span>바리스타 2급</span>\r\n");
      out.write("					<p>커피 추출, 스티밍, 메뉴 제조 및 응대 관련 기술 평가</p>\r\n");
      out.write("					<dl>\r\n");
      out.write("						<dt>응시 자격</dt>\r\n");
      out.write("						<dd>빽<em>&#8216;S</em> 바리스타 2급 특강을 이수한 모든 가맹점 점주와 직원</dd>\r\n");
      out.write("					</dl>\r\n");
      out.write("					<dl>\r\n");
      out.write("						<dt>검정 과목 및 방법</dt>\r\n");
      out.write("						<dd><span>커피 이론 기초교육</span><span>기본 추출 실습 교육</span><span>필기테스트</span><span>실기테스트</span></dd>\r\n");
      out.write("					</dl>\r\n");
      out.write("				</div>\r\n");
      out.write("			</li>\r\n");
      out.write("			\r\n");
      out.write("			<li>\r\n");
      out.write("				<div class=\"bari_img\"><img src=\"http://paiks.sist.co.kr/customer/01.paik/images/barista_img02.jpg\" alt=\"바리스타 1급\" /></div>\r\n");
      out.write("				<div class=\"bari_txt\">\r\n");
      out.write("					<span>바리스타 1급</span>\r\n");
      out.write("					<p>2급의 기술을 더 정확하고 신속하게 이행할 수 있도록 하며, <span class=\"block_txt\">라떼 아트를 적용한 메뉴 제공이 가능한지를 평가</span></p>\r\n");
      out.write("					<dl>\r\n");
      out.write("						<dt>응시 자격</dt>\r\n");
      out.write("						<dd>바리스타 2급을 취득하고 빽<em>&#8216;S</em> 바리스타 1급 특강 교육과정을 이수한 가맹점 점주와 직원 <p>(* 바리스타 2급 취득 후 1년 이내 응시 가능)</p></dd>\r\n");
      out.write("					</dl>\r\n");
      out.write("					<dl>\r\n");
      out.write("						<dt>검정 과목 및 방법</dt>\r\n");
      out.write("						<dd><span>커피 이론 기초교육</span><span>라떼아트 실습 교육</span><span>필기테스트</span><span>실기테스트</span></dd>\r\n");
      out.write("					</dl>\r\n");
      out.write("				</div>\r\n");
      out.write("			</li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"qualifying_con\">\r\n");
      out.write("		<div class=\"con_align\">\r\n");
      out.write("			<dl class=\"qualif_info\">\r\n");
      out.write("				<dt class=\"qualif_tt\">&#8220;빽&#8217;S 바리스타&#8221;라는 사업 내 자격검정을 통하여 <span class=\"block_txt\">더 전문적인 바리스타의 커피를 빽스커피에서 만날 수 있습니다.</span></dt>\r\n");
      out.write("				<dd><em>* 사업 내 자격검정이란?</em>\r\n");
      out.write("					<p>사업주가 근로자의 직무능력 향상을 위해 자체 자격검정제도를 도입, 운영하는 것</p>\r\n");
      out.write("					<p>국가 자격으로 검정하기 어려운 특수 직무를 한국산업인력공단에서 평가하여 사업 내 자격으로 인증하는 제도</p>\r\n");
      out.write("				</dd>\r\n");
      out.write("			</dl>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"goal_con\">\r\n");
      out.write("				<h3 class=\"qualif_tt\">도입목표</h3>\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li>\r\n");
      out.write("						<div class=\"goal_img\"><img src=\"http://paiks.sist.co.kr/customer/01.paik/images/goal_img01.jpg\" alt=\"브랜드 일관성\" /></div>\r\n");
      out.write("						<dl>\r\n");
      out.write("							<dt>브랜드 일관성</dt>\r\n");
      out.write("							<dd>빽스커피의 생산성과 품질의 상향평준화로 <span class=\"block_txt\">일관성 있는 서비스를 제공합니다.</span></dd>\r\n");
      out.write("						</dl>\r\n");
      out.write("					</li>\r\n");
      out.write("					\r\n");
      out.write("					<li>\r\n");
      out.write("						<div class=\"goal_img\"><img src=\"http://paiks.sist.co.kr/customer/01.paik/images/goal_img02.jpg\" alt=\"고객 신뢰\" /></div>\r\n");
      out.write("						<dl>\r\n");
      out.write("							<dt>고객 신뢰</dt>\r\n");
      out.write("							<dd>전문 바리스타를 양성하여 <span class=\"block_txt\">고객 응대 서비스 및 소통 수준과</span> 브랜드에 대한 고객 이해도를 높입니다.</dd>\r\n");
      out.write("						</dl>\r\n");
      out.write("					</li>\r\n");
      out.write("					\r\n");
      out.write("					<li>\r\n");
      out.write("						<div class=\"goal_img\"><img src=\"http://paiks.sist.co.kr/customer/01.paik/images/goal_img03.jpg\" alt=\"직원 성장\" /></div>\r\n");
      out.write("						<dl>\r\n");
      out.write("							<dt>직원 성장</dt>\r\n");
      out.write("							<dd>차별화된 교육을 통해 인재를 양성하고, <span class=\"block_txt\">소속감을 증진하며, 자부심을 부여해</span> 즐거운 근무환경을 조성합니다.</dd>\r\n");
      out.write("						</dl>\r\n");
      out.write("					</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</article>\r\n");
      out.write("</main>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/customer/00.common/jsp/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
