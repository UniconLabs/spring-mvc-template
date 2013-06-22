<%@ page import="org.example.app.support.PrincipalAccessor" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>

<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a class="brand" href="/template-app" name="top">Template App</a>
            <ul class="nav pull-right">
                <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Logged in as: <%= PrincipalAccessor.currentPrincipalId()%> <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="/template-app/j_spring_cas_security_logout"><i class="icon-off"></i> Logout</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>