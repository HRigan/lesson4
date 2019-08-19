$(document).ready(function(){
        $("#result").html("<b>Hello</b>");
        fire_ajax_submit();
    });
    function fire_ajax_submit() {
       $.ajax({
       type: "GET",
       contentType: "application/json",
       url:"/get_user",
       dataType:"Json",
       success:function(data){
        console.log(data);
       },
       failed:function(error){
       console.log("error");
       }
       });
       }