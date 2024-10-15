package org.example.faculty.college.business.department.acct;

import org.example.ConsoleColors;
import org.example.faculty.college.business.department.Department;
import org.example.faculty.college.business.Departments;

import java.util.ArrayList;
import java.util.List;

public class ACCT extends Department {

    List<Courses> coursesTaught;
    private final int indentLevel;
    public ACCT(String firstName, String lastName) {
        super(firstName, lastName, Departments.ACCT);
        coursesTaught = new ArrayList<>();
        this.indentLevel = super.indentLevel;
        System.out.println("ECE Constructor indent " + indentLevel);
    }

    public void addCourse(Courses course) {
        coursesTaught.add(course);
    }

    public String buildCoursesTaughtList(int indentLevel) {
        String courseListIndent = "\t".repeat(indentLevel + 1);
        StringBuilder sb = new StringBuilder();
        for (Courses course : coursesTaught) {
            sb.append(course.toString(indentLevel));
        }
        return sb.toString();
    }
    public String toString() {
        String indention = "\t".repeat(this.indentLevel);
        StringBuilder sb = new StringBuilder()
                .append(super.toString())
                .append(ConsoleColors.CYAN)
                .append(indention).append("\t").append("Courses Taught Listed Below: \n")
                .append(buildCoursesTaughtList(this.indentLevel+2))
                .append(ConsoleColors.RESET);
        return sb.toString();
    }
}
