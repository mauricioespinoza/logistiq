<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.latam.logistiq.modelo.Producto" %>
<%@page import="com.latam.logistiq.vo.ProductoVO" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="charset=UTF-8">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet"
          href="/webjars/bootstrap/4.3.0/css/bootstrap.min.css"/>
    <title>Logistiqal</title>
</head>
<body>
<!-- Inicio Header -->
<nav class="navbar navbar-light bg-light">
    <a class="navbar-brand" href="home">Logistiqal</a>
</nav>
<!-- Fin Header -->
<!-- Inicio Contenido -->
<div class="p-3">

    <h1>Agregar producto</h1>
    <c:if test="${mensaje != null ? true : false}">
        <div class="alert alert-secondary  alert-dismissible fade show"
             role="alert">${mensaje}
            <button type="button" class="close" data-dismiss="alert"
                    aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
        </div>
    </c:if>
    <form action="agregar" method="post">
        <table>
            <tr>
                <td class="p-2"><label for="codigo">Código:</label></td>
                <td><input class="form-control" type="text" name="codigo" id="codigo"
                           placeholder="Código" required/></td>
            </tr>
            <tr>
                <td class="p-2"><label for="nombre">Nombre:</label></td>
                <td><input class="form-control" type="text" id="nombre"
                           placeholder="Nombre" name="nombre" required/></td>
            </tr>
            <tr>

                <td class="p-2"><label for="precio">Precio:</label></td>
                <td>

                    <div class="input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text">$</span>
                        </div>
                        <input type="number" class="form-control"
                               name="precio" id="precio"
                               placeholder="Precio" required/>
                    </div>


            </tr>

            <tr>

                <td class="p-2"><label for="stock">Stock:</label></td>
                <td><input class="form-control" type="number" id="stock"
                           placeholder="Stock" name="stock" required/></td>
            </tr>
            <tr>

                <td class="p-2"><label for="descripcion">Descripción:</label></td>
                <td>
                	<textarea class="form-control" id="descripcion" name="descripcion" rows="4" cols="50" required></textarea>
                </td>
            </tr>
            <tr>
            	<td class="p-2"><label for="tipo_producto">Categoria:</label></td>
            	<td>
            		<select name="tipo_producto" class="form-control">
            			<c:forEach items="${VO}" var="cat">
							<option value="${cat.getId_categoria()}">${cat.getDet_categoria()}</option>
						</c:forEach>
					</select>
				</td>
            </tr>
            <tr>
                <td colspan="2">
                	<input type="submit" class="btn m-2 btn-success" value="Agregar"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
