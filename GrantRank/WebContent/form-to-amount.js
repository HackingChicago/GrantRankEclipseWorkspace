$('document').ready(function() {
	$('.f-button').click(function() {
		var url = '/GrantRank/search/amount';	
		$(location).attr('href', url);
	});
});