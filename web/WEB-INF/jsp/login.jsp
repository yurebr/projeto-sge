<%-- 
    Document   : login
    Created on : 05/09/2024, 16:33:41
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body style="background-color: #eae6fc">
        <form>
            
                h1 
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">CPF</label>
                <input type="cpf" class="form-control" id="InputCpf" name="cpf">
                <div class="form-text">Seu cpf</div>
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Senha</label>
                <input type="senha" class="form-control" id="InputSenha" name="senha">
            </div>
            
            <button style="background-color: #d8d0fb" type="submit" class="btn btn-primary">Logar</button>
        </form>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
