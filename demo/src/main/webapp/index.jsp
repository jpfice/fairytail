<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="layui/css/layui.css">
<script src="layui/layui.js"></script>
</head>
<body class="layui-container">
	<div class="layui-row">
		<div class="layui-col-md4">
			<div class="grid-demo grid-demo-bg1">33.33%</div>
		</div>
		<div class="layui-col-md4">
			<div class="grid-demo">
				<form class="layui-form" action="">
					<div class="layui-form-item">
						<label class="layui-form-label">用户名</label>
						<div class="layui-input-block">
							<input type="text" name="title" lay-verify="title"
								autocomplete="off" placeholder="请输入标题" class="layui-input">
						</div>
					</div>
					<div class="layui-form-item">
                        <label class="layui-form-label">密码</label>
                        <div class="layui-input-block">
                            <input type="text" name="title" lay-verify="title"
                                autocomplete="off" placeholder="请输入标题" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-input-block">
				      <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">提交</button>
				      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
				    </div>
				</form>
			</div>
		</div>
		<div class="layui-col-md4">
			<div class="grid-demo grid-demo-bg1">33.33%</div>
		</div>
	</div>
</body>
</html>