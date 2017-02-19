$('document').ready(function() {
	$('.f-button').click(function() {
		var url = '/GrantRank/result';	
		$(location).attr('href', url);
	});
});