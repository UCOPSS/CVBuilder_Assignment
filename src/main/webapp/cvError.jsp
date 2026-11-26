
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>CV Builder - Validation Error</title>

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/cvError.css">
</head>

<body>

    <div class="error-container">

        <div class="error-icon">⚠</div>

        <h1>Validation Error</h1>

        <p>
            Sorry! Your CV could not be generated
            because some information is missing or invalid.
        </p>

        <div class="error-message">
            ${errorMessage}
        </div>

        <p>
            Please check the following required information:
        </p>

        <p>
            Full Name, Email, Highest Degree,
            and at least one Skill.
        </p>

        <a class="btn"
           href="${pageContext.request.contextPath}/cvForm.jsp">
            Back to CV Form
        </a>

    </div>

</body>
</html>
