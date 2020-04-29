<!doctype html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>sendMessage</title>
    <script src="/static/js/jquery-1.9.1.min.js" charset="utf-8"></script>
</head>
<body>
<form>
    topic：<input type="text" id="topic"><br>
    发送的信息，id用英文,分隔：<input type="text" id="text"><br>
    <button type="button" onclick="send()">提交</button><br><br>
    <div id="sp" style="color: #32CD32"></div>
</form>
</body>
<script>
function send() {
    var topic = $("#topic").val();
    var text = $("#text").val();
    $.ajax({//查询对应类型的项目
        type: "get",
        dataType: "text",//返回字符串
        data: {
            topic: topic,
            text: text
        },
        url: "/send",
        success: function (data) {
            $("#sp").html(data);
            }
    })
}
</script>
</html>