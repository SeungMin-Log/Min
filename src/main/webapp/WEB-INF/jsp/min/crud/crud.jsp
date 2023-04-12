<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2023-04-11
  Time: 오전 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CRUD Page</title>
    <!-- jQuery -->
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
    <script>
        /* 온로드 함수 */
        $(function(){
            ajaxCall();
        })

        /* AJAX 호출 */
        function ajaxCall(){
            $.ajax({
                url: "/crudGetData.do",
                type: "GET",
                dataType : "json",
                success: function(result){
                    console.log(result);
                },
                error : function(xhr, status, error) {
                    console.log(status, error);
                }
            });
        }
    </script>
</head>
<body>
    <h1>CRUD Page</h1>
    <form action="/logout" method="post">
        <input hidden="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
        <button type="submit">LogOut</button>
    </form>
</body>
</html>
