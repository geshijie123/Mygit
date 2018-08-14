/**
 * 编辑-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		user: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../wx/wxuser/info?_' + $.now(),
		    	param: vm.user.id,
		    	success: function(data) {
		    		vm.user = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../wx/wxuser/update?_' + $.now(),
		    	param: vm.user,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})