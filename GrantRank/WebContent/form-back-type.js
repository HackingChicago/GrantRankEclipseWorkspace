$('document').ready(function() {
	$('.b-button').click(function() {
		var url = '/GrantRank/search/type';	
		$(location).attr('href', url);
	});
});