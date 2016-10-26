$(document).ready(function() {
    $('#button1').click(function() {
        $('#form').animate({height:'240px',width:'230px'});
    });

    $('#form').mouseenter(function(){
	$('#form').animate({height:'240px',width:'230px'});
	});

   $('#form').mouseleave(function(){
	$('#form').animate({height:'230px',width:'220px'});
	});
   $(".date").datepicker({
            dateFormat: 'dd/mm/yy'
        });
});