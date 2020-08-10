var PROD = {
    list : function () {
        var url = "http://localhost:8080/product/list";
        AJAX.post(url,{"offset" : 5, "limit" : 5},function (result) {
            layer.alert(JSON.stringify(result))
        })
    }
}