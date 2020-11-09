<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="layui/css/layui.css">
<script src="layui/layui.js"></script>
</head>
<body class="layui-layout-body">
    <div class="layui-layout layui-layout-admin">
        <div class="layui-header">
            <div class="layui-logo">后台布局</div>
            <ul class="layui-nav layui-layout-left">
            <shiro:hasAnyRoles name="user">
                <li class="layui-nav-item"><a href="">控制台</a></li>
            </shiro:hasAnyRoles>
                <li class="layui-nav-item"><a href="">商品管理</a></li>
                <li class="layui-nav-item"><a href="">用户</a></li>
                <li class="layui-nav-item"><a href="javascript:;">其它系统</a>
                    <dl class="layui-nav-child">
                        <dd>
                            <a href="">邮件管理</a>
                        </dd>
                        <dd>
                            <a href="">消息管理</a>
                        </dd>
                        <dd>
                            <a href="">授权管理</a>
                        </dd>
                    </dl></li>
            </ul>
            <ul class="layui-nav layui-layout-right">
                <li class="layui-nav-item"><a href="javascript:;"> <img
                        src="http://t.cn/RCzsdCq" class="layui-nav-img">Admin
                </a>
                    <dl class="layui-nav-child">
                        <dd>
                            <a href="">基本资料</a>
                        </dd>
                        <dd>
                            <a href="">安全设置</a>
                        </dd>
                    </dl></li>
                <li class="layui-nav-item"><a href="">退了</a></li>
            </ul>
        </div>

        <div class="layui-side layui-bg-black">
            <div class="layui-side-scroll">
                <ul class="layui-nav layui-nav-tree" lay-filter="test">
                    <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">权限管理</a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;">用户</a>
                            </dd>
                            <dd>
                                <a href="javascript:;">权限</a>
                            </dd>
                            <dd>
                                <a href="javascript:;">用户权限</a>
                            </dd>
                            <dd>
                                <a href="javascript:;">权限资源</a>
                            </dd>
                        </dl></li>
                    <li class="layui-nav-item"><a href="javascript:;">解决方案</a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;">列表一</a>
                            </dd>
                            <dd>
                                <a href="javascript:;">列表二</a>
                            </dd>
                            <dd>
                                <a href="">超链接</a>
                            </dd>
                        </dl></li>
                    <li class="layui-nav-item"><a href="">云市场</a></li>
                    <li class="layui-nav-item"><a href="">勤务表上传</a></li>
                </ul>
            </div>
        </div>
        <div class="layui-body" >
            <div ><table id="demo" lay-filter="test"></table></div>
        </div>
        <!--<div class="layui-footer">www.demo.com</div>-->
    </div>

    <script>
        layui.use(['table'], function() {
        	var $=layui.$;
            var table = layui.table;
            table.render({
                elem : '#demo',
                height : 'full-105',
                toolbar: true,
                method: 'post',
                url : 'Login.do',
                page : true,
                parseData:function (res) {
                    console.log(res);
                    return{
                        "code":res.code,
                        "msg":res.msg,
                        "count":res.count,
                        data:res.data
                    }
                },
                cols: [[
                	  {field: 'id', title: 'ID', width:60, sort: true}
                      ,{field: 'name', title: '用户名', width:130, sort: true}
                      ,{field: 'password', title: '密码', width:150}
                      ,{field: 'role', title: '权限', width:80, sort: true}
                      ,{field: 'submittime', title: '注册时间', width: 120, sort: true}
                ]],
                done: function (res, curr, count) {
                    $(".layui-table-view").css("margin", "0");
                }
            });
        });
    </script>
</body>
</html>