<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../common/header.jsp"%>
 <link rel="stylesheet" href="../resources/home/css/shop_manager.css" type="text/css" />
 <link rel="stylesheet" href="../resources/home/css/shop_form.css" type="text/css" />
<!-- 我的个人中心 -->
	<div class="shop_member_bd clearfix">
		<%@include file="../common/user_menu.jsp"%>
		
		<!-- 右边购物列表 -->
		<div class="shop_member_bd_right clearfix">
			
			<div class="shop_meber_bd_good_lists clearfix">
				<div class="title"><h3>用户充值</h3></div>
				<div class="clear"></div>
				<dic class="shop_home_form">
					<form athion="" name="" class="shop_form" method="post">
						<ul>
							<li><label>用户名称：</label>${user.name }</li>
							<li>
							<label>用户余额： </label>
								${user.balance}
							</li>
							<li>
							<label>充值金额：</label>
							<input type="number" id="balance" name="balance" value="" style="height: 25px;" min="1" onblur="checkNumber()">
							</li>
							<li class="bn"><label>&nbsp;</label><input type="button" onClick="Recharge()" class="form-submit" value="确认充值" /></li>
						</ul>
					</form>
				</div>
			</div>
		</div>
		<!-- 右边购物列表 End -->

	</div>
	<!-- Footer - wll - 2013/3/24 -->
	<div class="clear"></div>
	<%@include file="../common/footer.jsp"%>
</body>
<script>
	$(document).ready(function(){
		
	});
	//验证充值的金额
	function checkNumber(){
		var balance=$("#balance").val();
		var reg=/^\d+$/;
		if(balance==null ||balance==""){
			//alert("请输入您要充值的金额！")
			return;
		}else if(reg.test(balance)!=true){
			alert("您输入的金额格式有误，请重新输入！")
			$("#balance").val("");
			return;
		}
	}
	
	//确认修改
	function Recharge(){
		var balance=$("#balance").val();
		if(balance==null ||balance==""){
			alert("请输入您要充值的金额！")
			return;
		}
		$.ajax({
			url:'recharge',
			type:'POST',
			data:{balance:balance},
			dataType:'json',
			async:false,
			success:function(data){
				if(data.type == 'success'){
			         alert(data.msg);
			         window.location.reload();
				}else{
					alert(data.msg);
				}
			}
		});
	}
</script>
</html>