$('document').ready(function() {
	// Form
	$('.mdl-js-button').click(function() {
		var checked = $('input[name=grant-type]:checked').val();
		if (typeof checked != 'undefined') {
			var url = '';
			switch (checked) {
			case 'Government':
				url = '/GrantRank/search/gov';
				break;
			case 'Corporate':
				url = '/GrantRank/search/corporate';
				break;
			case 'Private':
				url = '/GrantRank/search/cause';
				break;
			default:
				break;
			}
			$(location).attr('href', url);
		}
	});
});