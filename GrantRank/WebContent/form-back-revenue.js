$('document').ready(function() {
	$('.b-button').click(function() {
		var url = '/GrantRank/search/revenue';	
		$(location).attr('href', url);
	});
});