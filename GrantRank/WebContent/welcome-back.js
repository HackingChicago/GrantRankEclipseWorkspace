$('document').ready(function() {
	$('.b-button').click(function() {
		var url = '/GrantRank/login';	
		$(location).attr('href', url);
	});
});