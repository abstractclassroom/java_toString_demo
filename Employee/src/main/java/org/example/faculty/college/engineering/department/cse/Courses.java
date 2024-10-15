package org.example.faculty.college.engineering.department.cse;

public enum Courses {

    CSE110("CSE", "110" ,"Mathematical Foundations", 3, "This course introduces the mathematical foundations of computer science. Topics include logic, sets, functions, relations, combinatorics, and graph theory."),
    CSE220("CSE","220", "Object Oriented Programming", 3, "This course introduces the principles of object-oriented programming. Topics include classes, objects, inheritance, polymorphism, and encapsulation."),
    CSE310("CSE","310", "Discrete Structures", 3, "This course introduces mathematical structures used in computer science. Topics include sets, relations, functions, logic, proof techniques, and graph theory.");
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
