package org.example.faculty.college;

public enum Colleges {
    ENGINEERING("Engineering", "Dr. Collins", "J.B. Speed", "1234", "The College of Engineering is a fantastic place where dreams come true."),
    BUSINESS("Business", "Dr. Smith", "Millionaire Tower", "5678", "The College of Business is a great place to learn about business."),
    ARTS_AND_SCIENCES("Arts and Sciences", "Dr. Johnson", "Poindexter", "9101", "The College of Arts and Sciences is a great place to learn about arts and sciences."),
    EDUCATION("Education", "Dr. Williams", "Jane Hall", "1121", "The College of Education is a great place to learn about education.");


    // Variables for each enum entry
    private final String collegeName;
    private final String deanName;
    private final String deanBuilding;
    private final String deanOfficeNumber;
    private final String collegeDescription;

    // Constructor for the enum
    Colleges(String collegeName, String deanName, String deanBuilding, String deanOfficeNumber, String collegeDescription) {
        this.collegeName = collegeName;
        this.deanName = deanName;
        this.deanBuilding = deanBuilding;
        this.deanOfficeNumber = deanOfficeNumber;
        this.collegeDescription = collegeDescription;
    }

    // Getters for the variables
    public String getCollegeName() {
        return collegeName;
    }
    public String getDeanName() {
        return deanName;
    }
    public String getDeanBuilding() {
        return deanBuilding;
    }
    public String getDeanOfficeNumber() {
        return deanOfficeNumber;
    }
    public String getCollegeDescription() {
        return collegeDescription;
    }

    public String toString() {
        return toString(0);
    }

    public String toString(int indentLevel) {
        String indent = "\t".repeat(indentLevel);
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("College Information: \n");
        sb.append(indent).append("  ").append("College Name: ").append(collegeName).append("\n");
        sb.append(indent).append("  ").append("Dean Name: ").append(deanName).append("\n");
        sb.append(indent).append("  ").append("Dean Building: ").append(deanBuilding).append("\n");
        sb.append(indent).append("  ").append("Dean Office Number: ").append(deanOfficeNumber).append("\n");
        sb.append(indent).append("  ").append("College Description: ").append(collegeDescription).append("\n");
        return sb.toString();
    }
}
