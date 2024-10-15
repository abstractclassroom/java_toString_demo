package org.example.faculty.college.engineering.department;

import org.example.ConsoleColors;
import org.example.faculty.college.business.Business;

public class Department extends Business {
    private Departments department;
    protected int indentLevel;

    public Department(String firstName, String lastName, Departments department) {
        super(firstName, lastName);
        this.department = department;
        this.indentLevel = super.indentLevel + 1;
        System.out.println("Department Constructor indent " + indentLevel);

    }

    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append(super.toString())
                .append(ConsoleColors.PURPLE)
                .append(department.toString(this.indentLevel))
                .append(ConsoleColors.RESET);
        return sb.toString();
    }

}
