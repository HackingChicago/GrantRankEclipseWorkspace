$('document').ready(function() {
	$('.b-button').click(function() {
		var url = '/GrantRank/search/cause';	
		$(location).attr('href', url);
	});
});