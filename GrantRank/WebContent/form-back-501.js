$('document').ready(function() {
	$('.b-button').click(function() {
		var url = '/GrantRank/searchGrant';	
		$(location).attr('href', url);
	});
});