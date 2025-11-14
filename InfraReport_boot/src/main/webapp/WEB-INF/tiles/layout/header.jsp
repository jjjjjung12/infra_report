<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!-- 헤더 -->
<div class="header-section">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-md-8">
                <h1><i class="fas fa-chart-line me-2"></i>일일업무보고서 통합관리</h1>
                <p class="mb-0">작성일자: <fmt:formatDate value="${currentDate}" pattern="yyyy년 MM월 dd일 (E)" /></p>
            </div>
            <div class="col-md-4 text-end">
                <button class="btn btn-light me-2" onclick="location.reload()">
                    <i class="fas fa-sync-alt"></i> 새로고침
                </button>
                <button class="btn btn-success" onclick="exportAll()">
                    <i class="fas fa-download"></i> 내보내기
                </button>
            </div>
        </div>
    </div>
</div>
