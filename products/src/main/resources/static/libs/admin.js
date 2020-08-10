var ADMIN = {
    login : function () {
      var url = "http://localhost:8080/admin/login";
      AJAX.post(url,{
          "username" : $("#username").val(),
          "password" : $("#password").val()
      },function (result) {
          alert(result.message);
      })
    }
}