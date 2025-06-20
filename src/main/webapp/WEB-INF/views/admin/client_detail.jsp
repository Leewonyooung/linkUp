<%--
  Author: 이원영
  Date: 25. 4. 14.
  Time: 오후 2:10
  Description: 업체(회사, client, 구인자)의 상세 페이지
  Read Data :
    - client (업체 정보)
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <c:set var="contextPath" value="${pageContext.request.contextPath }"/>
  <meta charset="UTF-8" />
  <title>회사 상세 정보</title>
  <link rel="stylesheet" href="${contextPath}/css/admin/admin_header.css" />
  <link rel="stylesheet" href="${contextPath}/css/admin/company_detail.css" />
  <script>
    const defaultOpenMenuId = "projectMenu";
  </script>
</head>
<body>
<!-- ✅ 헤더/사이드 메뉴 include -->
<jsp:include page="admin_header.jsp" />
<div class="layout-wrapper">
  <jsp:include page="menutap.jsp" />

  <div class="content">
    <div class="page-header">
      <h2>${client.name}</h2>
    </div>
    <div class="card">
      <h3>기본 정보</h3>
      <div class="info-grid">
        <div><strong>회사명</strong><p>${client.name}</p></div>
        <div><strong>설립일자</strong><p>${client.registrationDate}</p></div>
        <div><strong>대표자명</strong><p>${client.ceo}</p></div>
        <div><strong>업종</strong><p>${client.businessType}</p></div> <!-- 추후 company.industry로 변경 가능 -->
        <div><strong>사업자등록번호</strong><p>${client.companyPhoneNumber}</p></div> <!-- 추후 company.businessNumber -->
        <div><strong>업태</strong><p>${client.companyDescription}</p></div> <!-- company.businessType -->
      </div>
    </div>

    <!-- ✅ 연락처 정보 -->
    <div class="card">
      <h3>연락처 정보</h3>
      <ul class="contact-list">
        <li><strong>본사 주소:</strong> ${client.companyAddress}</li>
        <li><strong>대표 전화번호:</strong> ${client.companyPhoneNumber}</li>
        <li><strong>대표 이메일:</strong> ${client.email}</li>
        <li><strong>FAX:</strong> ${client.companyFaxNum}</li>
      </ul>
    </div>
  </div>
</div>
</body>
</html>
