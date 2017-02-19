$('document').ready(function() {
	$('.f-button').click(function() {
		var url = '/GrantRank/search/type';	
		$(location).attr('href', url);
	});
});