$('document').ready(function() {
	$('.f-button').click(function() {
		var url = '/GrantRank/search/revenue';	
		$(location).attr('href', url);
	});
});