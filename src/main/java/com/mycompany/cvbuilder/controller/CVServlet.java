
package com.mycompany.cvbuilder.controller;

import com.mycompany.cvbuilder.model.CVBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CVServlet extends HttpServlet {

    // Process submitted CV form
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        // Step 1: Create Model object
        CVBean cvBean = new CVBean();

        // Step 2: Get Personal Information
        cvBean.setFullName(
                request.getParameter("fullName"));
        cvBean.setProfessionalTitle(
                request.getParameter("professionalTitle"));
        cvBean.setEmail(
                request.getParameter("email"));
        cvBean.setPhoneNumber(
                request.getParameter("phoneNumber"));
        cvBean.setLinkedInGithubUrl(
                request.getParameter("linkedInGithubUrl"));
        cvBean.setProfileSummary(
                request.getParameter("profileSummary"));

        // Step 3: Get Education Information
        cvBean.setHighestDegree(
                request.getParameter("highestDegree"));
        cvBean.setInstitutionName(
                request.getParameter("institutionName"));
        cvBean.setYearOfGraduation(
                request.getParameter("yearOfGraduation"));
        cvBean.setMajor(
                request.getParameter("major"));

        // Step 4: Get Work Experience
        cvBean.setRecentJobTitle(
                request.getParameter("recentJobTitle"));
        cvBean.setCompanyName(
                request.getParameter("companyName"));
        cvBean.setDuration(
                request.getParameter("duration"));
        cvBean.setResponsibilities(
                request.getParameter("responsibilities"));

        // Step 5: Get Skills
        cvBean.setTechnicalSkills(
                request.getParameter("technicalSkills"));
        cvBean.setSoftSkills(
                request.getParameter("softSkills"));

        // Step 6: Validate CV
        if (cvBean.validate()) {

            request.setAttribute("cvData", cvBean);

            request.getRequestDispatcher("/cvView.jsp")
                   .forward(request, response);

        } else {

            request.setAttribute("errorMessage",
                    "Please complete all required fields correctly.");

            request.getRequestDispatcher("/cvError.jsp")
                   .forward(request, response);
        }
    }

    // Generate Sample CV
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if ("sample".equals(action)) {

            CVBean cvBean = new CVBean();

            // Sample Personal Information
            cvBean.setFullName("Ali Ahmad");
            cvBean.setProfessionalTitle("Software Developer");
            cvBean.setEmail("ali@example.com");
            cvBean.setPhoneNumber("0123456789");
            cvBean.setLinkedInGithubUrl(
                    "https://github.com/aliahmad");
            cvBean.setProfileSummary(
                    "Passionate software developer with "
                    + "experience in Java and web development.");

            // Sample Education
            cvBean.setHighestDegree(
                    "Bachelor of Computer Science");
            cvBean.setInstitutionName(
                    "Universiti Teknologi MARA");
            cvBean.setYearOfGraduation("2026");
            cvBean.setMajor("Computer Science");

            // Sample Experience
            cvBean.setRecentJobTitle("Junior Developer");
            cvBean.setCompanyName("ABC Technology");
            cvBean.setDuration("2025 - 2026");
            cvBean.setResponsibilities(
                    "Developed and maintained web applications.");

            // Sample Skills
            cvBean.setTechnicalSkills(
                    "Java, HTML, CSS, SQL");
            cvBean.setSoftSkills(
                    "Communication, Teamwork, Problem Solving");

            request.setAttribute("cvData", cvBean);

            request.getRequestDispatcher("/cvView.jsp")
                   .forward(request, response);

        } else {

            response.sendRedirect(
                    request.getContextPath() + "/cvForm.jsp");
        }
    }
}
