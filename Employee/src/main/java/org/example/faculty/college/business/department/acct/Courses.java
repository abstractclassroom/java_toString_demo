package org.example.faculty.college.business.department.acct;

public enum Courses {

    ACCT101("ACCT", "101", "Accounting Principles", 3, "This course introduces the basic principles of accounting. Topics include financial statements, accounting cycles, and accounting principles."),
    ACCT201("ACCT", "201", "Intermediate Accounting", 3, "This course builds on the principles of accounting. Topics include financial statements, accounting cycles, and accounting principles."),
    ACCT301("ACCT", "301", "Advanced Accounting", 3, "This course builds on the principles of accounting. Topics include financial statements, accounting cycles, and accounting principles."),
    ACCT401("ACCT", "401", "Auditing", 3, "This course introduces students to the principles of auditing. Topics include audit planning, audit evidence, and audit reports."),
    ACCT402("ACCT", "402", "Taxation", 3, "This course introduces students to the principles of taxation. Topics include tax planning, tax compliance, and tax research.");

    private final String courseNumber;
    private final String courseTitle;
    private final int courseCredits;
    private final String courseDescription;
    private final String courseAbbreviation;

    Courses(String courseAbbreviation, String courseNumber, String courseTitle, int courseCredits, String courseDescription) {
        this.courseNumber = courseNumber;
        this.courseTitle = courseTitle;
        this.courseCredits = courseCredits;
        this.courseDescription = courseDescription;
        this.courseAbbreviation = courseAbbreviation;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public String getCourseAbbreviation() {
        return courseAbbreviation;
    }

    public String toString() {
        return toString(0);
    }

    public String toString(int indentLevel) {
        String indent = "\t".repeat(indentLevel);
        StringBuilder sb = new StringBuilder();
        sb.append(indent)
            .append(courseAbbreviation).append(" ").append(courseNumber).append("\n")
            .append(indent).append("  ").append("Course Title: ").append(courseTitle).append("\n")
            .append(indent).append("  ").append("Course Credits: ").append(courseCredits).append("\n")
            .append(indent).append("  ").append("Course Description: ").append(courseDescription).append("\n");
        return sb.toString();
    }

}
