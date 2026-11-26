
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Professional CV</title>

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/cvView.css">
</head>

<body>

    <div class="cv-container">

        <!-- CV HEADER -->
        <div class="cv-header">

            <h1>${cvData.fullName}</h1>

            <div class="job-title">
                ${cvData.professionalTitle}
            </div>

            <div class="contact-info">
                Email: ${cvData.email}
                |
                Phone: ${cvData.phoneNumber}
                <br>
                LinkedIn / GitHub:
                ${cvData.linkedInGithubUrl}
            </div>

        </div>

        <!-- PROFILE SUMMARY -->
        <div class="section">

            <h2>Professional Summary</h2>

            <p>${cvData.profileSummary}</p>

        </div>

        <!-- EDUCATION -->
        <div class="section">

            <h2>Education</h2>

            <p class="detail-title">
                ${cvData.highestDegree}
            </p>

            <p class="detail-subtitle">
                ${cvData.institutionName}
            </p>

            <p>
                Major: ${cvData.major}
                |
                Graduation Year: ${cvData.yearOfGraduation}
            </p>

        </div>

        <!-- WORK EXPERIENCE -->
        <div class="section">

            <h2>Work Experience</h2>

            <p class="detail-title">
                ${cvData.recentJobTitle}
            </p>

            <p class="detail-subtitle">
                ${cvData.companyName}
                |
                ${cvData.duration}
            </p>

            <p>${cvData.responsibilities}</p>

        </div>

        <!-- SKILLS -->
        <div class="section">

            <h2>Skills</h2>

            <div class="skills">

                <p>
                    <strong>Technical Skills:</strong>
                    ${cvData.technicalSkills}
                </p>

                <p>
                    <strong>Soft Skills:</strong>
                    ${cvData.softSkills}
                </p>

            </div>

        </div>

    </div>

    <!-- ACTION BUTTONS -->
    <div class="actions">

        <button class="btn" onclick="window.print()">
            Print / Save as PDF
        </button>

        <a class="btn btn-secondary"
           href="${pageContext.request.contextPath}/cvForm.jsp">
            Create Another CV
        </a>

    </div>

</body>
</html>
