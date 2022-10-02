<%-- 
    Document   : newjsp
    Created on : 1/10/2022, 5:33:15 p. m.
    Author     : KAREN RAMIREZ
--%>

<%@page import="modelo.PacienteModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.Paciente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>html,
body {
	height: 100%;
}
h1{
    color: #fff;
    text-align: center;
}

body {
	margin: 0;
	background: linear-gradient(45deg, #49a09d, #5f2c82);
	font-family: sans-serif;
	font-weight: 100;
}

.container {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
}

table {
	overflow: hidden;
	box-shadow: 0 0 20px rgba(0,0,0,0.1);
        margin: auto;
}

th,
td {
	padding: 15px;
	background-color: rgba(255,255,255,0.2);
	color: #fff;
}

th {
	text-align: left;
}

thead {
	th {
		background-color: #55608f;
	}
}

tbody {
	tr {
		&:hover {
			background-color: rgba(255,255,255,0.3);
		}
	}
	td {
		position: relative;
		&:hover {
			&:before {
				content: "";
				position: absolute;
				left: 0;
				right: 0;
				top: -9999px;
				bottom: -9999px;
				background-color: rgba(255,255,255,0.2);
				z-index: -1;
			}
		}
	}
}</style>
    <h1>
        HOSPITAL
    </h1>
    <body>
        <form style="text-align: center">
            <select name="tipoConsulta" id="tipoConsulta">
                <<option selected="true" disabled="true">Seleccione...</option>
                <option value="1">Centro de servicio</option>
                <option value="2">Medico</option>
                <option value="3">Paciente</option>
            </select>
            <input id="name" name="name"autocomplete="off" placeholder="nombre">
            <button type="submit" id="enviar">Enviar</button>
        </form>

        <div style="margin-top: 40px">
            <table>
                <thead>
                    <tr>
                        <td>codigo  </td>
                        <td>nombre  </td>
                        <td>sexo  </td>
                        <td>direccion  </td>
                        <td>lugar  </td>
                        <td>motivo de consulta  </td>
                        <td>medico  </td>
                        <td>Fecha  </td>
                    </tr>
                </thead>
                <tbody>
                    <%
                        if (request.getParameter("tipoConsulta") != null && request.getParameter("name") != null) {
                            Paciente p1 = new Paciente();
                            ArrayList<PacienteModel> lista = new ArrayList<>();
                            switch (Integer.parseInt(request.getParameter("tipoConsulta"))) {
                                case 1:
                                    lista = p1.consiltarCentro(request.getParameter("name"));
                                    break;
                                case 2:
                                    lista =p1.consultarPorMedico(request.getParameter("name"));
                                    break;
                                case 3:
                                    lista =p1.consiltarPaciente(request.getParameter("name"));
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                            for (int idx = 0; idx < lista.size(); idx++) {
                    %>
                    <tr>
                        <td><%= lista.get(idx).getCodigo()%></td>
                        <td><%= lista.get(idx).getNombre()%></td>
                        <td><%= lista.get(idx).getSexo()%></td>  
                        <td><%= lista.get(idx).getDireccion()%></td>
                        <td><%= lista.get(idx).getLugar()%></td>  
                        <td><%= lista.get(idx).getMotivoConsulta()%> </td>  
                        <td><%= lista.get(idx).getMedico()%></td>  
                        <td><%= lista.get(idx).getFecha()%></td>   
                    </tr>
                    <%}
                        }
                    %>
                </tbody>
            </table></div>
    </body>
</html>
