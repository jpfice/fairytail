<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../common/header.jsp"%>
<div class="easyui-layout" data-options="fit:true">
	<!-- Begin of toolbar -->
	<div id="wu-toolbar">
		<div class="wu-toolbar-button">
			<%@include file="../common/menus.jsp"%>
		</div>
		<div class="wu-toolbar-search">
			<label>用户名:</label><input id="search-username" class="wu-text"
				style="width: 100px"> <label>订单状态:</label> <select
				id="search-state" class="easyui-combobox" style="width: 100px">
				<option value="-1">全部</option>
				<option value="0">待审核</option>
				<option value="1">审核通过</option>
				<option value="2">审核不通过</option>
			</select> <a href="#" id="search-btn" class="easyui-linkbutton"
				iconCls="icon-search">搜索</a>
		</div>
	</div>
	<!-- End of toolbar -->
	<table id="data-datagrid" class="easyui-datagrid" toolbar="#wu-toolbar"></table>
</div>
<%@include file="../common/footer.jsp"%>

<!-- End of easyui-dialog -->
<script type="text/javascript">
	
	function verify(state){
		var checkedItem = $('#data-datagrid').datagrid('getSelected');
		if(checkedItem==null){
			$.messager.alert('信息提示','至少选择一条数据进行审核！','info');
			return;
		}
		if(checkedItem.state != 0){
			$.messager.alert('信息提示','该状态不可编辑！','info');
			return;
		}
		
		$.ajax({
			url:'examine',
			dataType:'json',
			type:'post',
			data:{id:checkedItem.id,state:state,uid:checkedItem.userId,recharge:checkedItem.recharge},
			success:function(data){
				if(data.type == 'success'){
					$.messager.alert('信息提示','审核成功！','info');
					$('#data-datagrid').datagrid('reload');
				}else{
					$.messager.alert('信息提示',data.msg,'warning');
				}
			}
		});
	
	}

	
	//搜索按钮监听
	$("#search-btn").click(function(){
		var option = {name:$("#search-username").val()};
		var state = $("#search-state").combobox('getValue');
		if(state != -1){
			option.state = state;
		}
		$('#data-datagrid').datagrid('reload',option);
	});
	
	function add0(m){return m<10?'0'+m:m }
	function format(shijianchuo){
	//shijianchuo是整数，否则要parseInt转换
		var time = new Date(shijianchuo);
		var y = time.getFullYear();
		var m = time.getMonth()+1;
		var d = time.getDate();
		var h = time.getHours();
		var mm = time.getMinutes();
		var s = time.getSeconds();
		return y+'-'+add0(m)+'-'+add0(d)+' '+add0(h)+':'+add0(mm)+':'+add0(s);
	}
	
	//获取前台用户列表
	var accountList=${accountList};
	
	/** 
	* 载入数据
	*/
	$('#data-datagrid').datagrid({
		url:'list',
		rownumbers:true,
		singleSelect:true,
		pageSize:20, 
		pagination:true,
		multiSort:true,
		fitColumns:true,
		idField:'id',
		fit:true,
		nowrap:false,
		columns:[[
			{ field:'chk',checkbox:true},
			{ field:'id',title:'充值编号',width:180,sortable:true},
			{ field:'userId',title:'充值用户',width:100,formatter:function(value,index,row){
			
			 	for(var i=0;i<accountList.length;i++){
					if(value == accountList[i].id)return accountList[i].name;
				} 
				return value;
			}},
			{ field:'recharge',title:'充值金额',width:100,sortable:true},
			{ field:'state',title:'充值状态',width:100,formatter:function(value,row,index){
				if(value == 0)return '待审核';
				if(value == 1)return '审核通过';
				if(value == 2)return '审核不通过';
				return (value);
			}},
			{ field:'createTime',title:'充值时间',width:150,formatter:function(value,index,row){
				return format(value);
			}}
		]]
	});
</script>