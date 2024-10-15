package org.example.faculty.college.business.department.econ;

public enum Courses {

    ECON101("ECON", "101", "Introduction to Economics", 3, "This course introduces students to the basic principles of economics. Topics include supply and demand, elasticity, and market structures."),
    ECON201("ECON", "201", "Microeconomics", 3, "This course introduces students to the principles of microeconomics. Topics include consumer behavior, production, and market structures."),
    ECON202("ECON", "202", "Macroeconomics", 3, "This course introduces students to the principles of macroeconomics. Topics include GDP, unemployment, and inflation."),
    ECON301("ECON", "301", "Intermediate Microeconomics", 3, "This course builds on the principles of microeconomics. Topics include consumer behavior, production, and market structures."),
    ECON302("ECON", "302", "Intermediate Macroeconomics", 3, "This course builds on the principles of macroeconomics. Topics include GDP, unemployment, and inflation."),
    ECON401("ECON", "401", "Advanced Microeconomics", 3, "This course builds on the principles of microeconomics. Topics include consumer behavior, production, and market structures."),
    ECON402("ECON", "402", "Advanced Macroeconomics", 3, "This course builds on the principles of macroeconomics. Topics include GDP, unemployment, and inflation.");

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
