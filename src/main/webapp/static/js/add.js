function sub() {
    $.ajax({
        dataType: "json",    //数据类型为json格式
        contentType: "application/x-www-form-urlencoded;charset=UTF-8",
        type: "post",
        url: "TestServlet",
        statusCode: {
            404: function () {
                alert('提交地址url未发现。 ');
            }
        },
        success: function (data, textStatus) {
            //alert(data);//对象
            alert("返回状态：" + textStatus);//状态
            $("#Result").html("<table border='1'><tr>" +
                "<td>序号</td><td>姓名</td><td>年龄</td></tr>" +
                "<tr><td>" + data.people[0].id + "</td>" +
                "<td>" + data.people[0].name + "</td>" +
                "<td>" + data.people[0].age + "</td>");
        }
    });
}