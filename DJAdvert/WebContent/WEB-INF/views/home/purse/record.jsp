<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../common/header.jsp"%>
 <link rel="stylesheet" href="../resources/home/css/shop_manager.css" type="text/css" />
 <link rel="stylesheet" href="../resources/home/css/shop_form.css" type="text/css" />
<style>
	.pagination{width:100%; margin:10px auto;}
	.pagination ul{float:right}
	.pagination ul li{float:left; margin:0 3px;}
	.pagination ul li span{display: inline-block; padding:5px 5px; border:1px solid #CCCCCC; color:#999999;}
	.pagination ul li span.currentpage{background-color:#FEA900; color:#FFF; font-weight: bold; border-color:#FEA900;}
</style>
<!-- 我的个人中心 -->
	<div class="shop_member_bd clearfix">
		<%@include file="../common/user_menu.jsp"%>
		
		<!-- 右边购物列表 -->
		<div class="shop_member_bd_right clearfix">
			
			<div class="shop_meber_bd_good_lists clearfix" >
				<div class="title"><h3>充值记录</h3></div>
				<table style="font-size:12px;">
					<thead class="tab_title">
						<th style="width:160px;"><span>充值用户</span></th>
						<th style="width:197px;"><span>充值金额</span></th>
						<th style="width:150px;"><span>状态</span></th>
						<th style="width:300px;"><span>充值时间</span></th>
					</thead>
					<tbody>
						<tr>
							<td colspan="5">
								<table class="good" style="font-size:12px;height: 30px;">
									<c:forEach items="${RecordList}" var="record">
										<tr>
											<td class="dingdan_title" style="width:50px;text-align: center;">${record.account.name}<span></td>
											<td class="dingdan_shuliang" style="width:70px;"><strong>￥${record.recharge}</strong></td>
											<td class="dingdan_zongjia" style="width: 90px;">
											<strong>
											<c:if test="${record.state==0}">审核中</c:if>
											<c:if test="${record.state==1}">审核通过</c:if>
											<c:if test="${record.state==2}">审核未通过</c:if>
											</strong>
											</td>
											<td class="digndan_caozuo">${record.createTime}</td>
										</tr>
									</c:forEach>
								</table>
							</td>
						</tr>
					</tbody>
				</table>
				<div class="clear"></div>
			<div class="pagination"> 
				<ul>
					<li><span><a href="record?page=${page -1}">上一页</a></span></li>
					<li><span class="currentpage">${page}</span></li>
					<li><span><a href="record?page=${page +1}">下一页</a></span></li>
				</ul> 
			</div>
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
		$(".finish-order-btn").click(function(){
			var $this = $(this);
			if(confirm("确定收货?")){
				$.ajax({
					url:'finish_order',
					type:'POST',
					data:{id:$this.attr('data-id')},
					dataType:'json',
					async:false,
					success:function(data){
						if(data.type == 'success'){
							alert('收货成功!');
							window.location.reload();
						}else{
							alert(data.msg);
						}
					}
				});
			}
		});
	});
	
</script>
</html>