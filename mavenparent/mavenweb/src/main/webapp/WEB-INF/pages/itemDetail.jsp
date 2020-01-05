<%--
  Created by IntelliJ IDEA.
  User: sky
  Date: 2020/1/5
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <table width="100%" border="1px">
        <tr>
            <td>商品名称</td>
            <td>${item.name}</td>
        </tr>
        <tr>
            <td>商品价格</td>
            <td>${item.price}</td>
        </tr>
        <tr>
            <td>生成日期</td>
            <td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
        </tr>
        <tr>
            <td>商品简介</td>
            <td>${item.detail}</td>
        </tr>
    </table>
</form>
</body>
</html>
