var ajax_timeout = 15 * 1000;
var layerLoadIndex;
$.ajaxSetup({
    beforeSend: function () {
        layerLoadIndex = layer.load(2, {
            time: ajax_timeout
        });
    },

    complete: function () {
        layer.close(layerLoadIndex);
    },
    cache: false,

    error: function (xhr, status, error) {
        if ("timeout" == status) {
            layer.alert("请求超时！");
        } else if ("error" == status) {
            layer.alert("请求错误！");
        } else if ("abort" == status) {
            layer.alert("请求终止！");
        } else if ("parsererror" == status) {
            layer.alert("解析错误！");
        } else {
            layer.alert("未知错误！")
        }
    },
    global: false,
    timeout: ajax_timeout
});

function doAjax(method, dataType, url, data, successFunction) {
    $.ajax({
        data: data,
        dataType: dataType,
        success: successFunction,
        type: method,
        url:  url
    });
}

//初始化ajax
var AJAX = {
    html: function (url,data, successFunction) {
        doAjax("GET", "html", url, data, successFunction);
    },
    get: function (url, data, successFunction) {
        doAjax("GET", "json", url, data, successFunction);
    },
    post: function (url, data, successFunction) {
        doAjax("POST", "json", url, data, successFunction);
    }
}

