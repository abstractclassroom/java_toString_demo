package org.example.faculty.college.engineering.department.ece;

public enum Courses {

    ECE110("ECE", "110", "Introduction to Electrical and Computer Engineering", 3, "This course introduces students to the field of electrical and computer engineering. Students will learn about the history of the field, the various subfields, and the career opportunities available to electrical and computer engineers."),
    ECE220("ECE", "280", "Digital Logic Design", 3, "This course introduces students to the design of digital logic circuits. Students will learn about the basic building blocks of digital logic circuits, including gates, flip-flops, and registers. Students will also learn about the design process, including specification, design, simulation, and testing."),
    ECE310("ECE", "340", "Microprocessor Systems", 4, "This course introduces students to the design of microprocessor systems. Students will learn about the architecture of microprocessors, including the instruction set, memory organization, and I/O interfaces. Students will also learn about the design process, including specification, design, simulation, and testing.");
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
