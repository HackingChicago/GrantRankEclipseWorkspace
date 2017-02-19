$('document').ready(function() {
	$('.f-button').click(function() {
		var url = '/GrantRank/search/cause';	
		$(location).attr('href', url);
	});
});