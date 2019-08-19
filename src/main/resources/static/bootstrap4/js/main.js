
$(document).ready(function(){
        $("#result").html("<b>Hello</b>");
        fire_ajax_submit();
                /*$('body').on('click', "#search",search_user());*/
    });
    function fire_ajax_submit() {
       $.ajax({
       type: "GET",
       contentType: "application/json",
       url:"/get_all_user",
       dataType:"Json",
       success:function(response){
        $(function() {
            $.each(response, function(i, item) {
                var $tr = $('<tr>').append(
                    $('<td>').text(item.username),
                    $('<td>').text(item.phone),
                    $('<td>').text(item.email)
                ).appendTo('#result');
                /*$("#result").html($tr.wrap('<p>').html());*/

            });
        });
       },
       failed:function(error){
       console.log("error");
       }
       });
       }
function search_user() {
        var data=$('#usertext').val();
        console.log(data);
        if(data=="") {
            $("#result").html("");
            return fire_ajax_submit();
        }
         $.ajax({
             type: "POST",
             contentType: "application/json",
             url: "/get_user",
             data: "{\"name\":\""+ data+"\"}",
             dataType: "Json",
             success: function (response) {
                 $(function () {
                     $("#result").html("");
                     $.each(response, function (i, item) {
                         var $tr = $('<tr>').append(
                             $('<td>').text(item.username),
                             $('<td>').text(item.phone),
                             $('<td>').text(item.email)
                         ).appendTo('#result');
                     });
                 });
             }
         });
}