package com.mycompany.cvbuilder.model;

import java.io.Serializable;

public class CVBean implements Serializable {

    // Personal Information
    private String fullName;
    private String professionalTitle;
    private String email;
    private String phoneNumber;
    private String linkedInGithubUrl;
    private String profileSummary;
    // Education Information
    private String highestDegree;
    private String institutionName;
    private String yearOfGraduation;
    private String major;

    // Work Experience
    private String recentJobTitle;
    private String companyName;
    private String duration;
    private String responsibilities;

    // Skills
    private String technicalSkills;
    private String softSkills;

    // Default Constructor
    public CVBean() {
    }

    // Getter and Setter

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProfessionalTitle() {
        return professionalTitle;
    }

    public void setProfessionalTitle(String professionalTitle) {
        this.professionalTitle = professionalTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLinkedInGithubUrl() {
        return linkedInGithubUrl;
    }

    public void setLinkedInGithubUrl(String linkedInGithubUrl) {
        this.linkedInGithubUrl = linkedInGithubUrl;
    }

    public String getProfileSummary() {
        return profileSummary;
    }

    public void setProfileSummary(String profileSummary) {
        this.profileSummary = profileSummary;
    }

    // Education Getters and Setters

    public String getHighestDegree() {  
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {    
        this.highestDegree = highestDegree;
    }

    public String getInstitutionName() {    
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {    
        this.institutionName = institutionName;
    }

    public String getYearOfGraduation() {   
    return yearOfGraduation;
    }

    public void setYearOfGraduation(String yearOfGraduation) {  
        this.yearOfGraduation = yearOfGraduation;
    }

    public String getMajor() {  
        return major;
    }

    public void setMajor(String major) {    
        this.major = major;
    }

    // Experience Getters and Setters

    public String getRecentJobTitle() { 
        return recentJobTitle;
    }

    public void setRecentJobTitle(String recentJobTitle) {  
        this.recentJobTitle = recentJobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
    this.responsibilities = responsibilities;
}

    // Skills Getters and Setters

    public String getTechnicalSkills() {
        return technicalSkills;
    }

    public void setTechnicalSkills(String technicalSkills) {
        this.technicalSkills = technicalSkills;
    }

    public String getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(String softSkills) {
        this.softSkills = softSkills;
    }

    public boolean validate() {

        // Check Full Name
        if (fullName == null || fullName.trim().isEmpty()) {
            return false;
        }

        // Check Email
        if (email == null || !email.matches(
                 "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            return false;
        }

        // Check Highest Degree
        if (highestDegree == null || highestDegree.trim().isEmpty()) {
            return false;
        }

        // Check Skills
        boolean technicalEmpty = technicalSkills == null
            || technicalSkills.trim().isEmpty();

        boolean softEmpty = softSkills == null
            || softSkills.trim().isEmpty();

        if (technicalEmpty && softEmpty) {
            return false;
        }

        return true;
    }
}