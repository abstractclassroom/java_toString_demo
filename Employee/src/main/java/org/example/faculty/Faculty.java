package org.example.faculty;

import org.example.ConsoleColors;
import org.example.Employee;
import org.example.EmployeeCategory;

public abstract class Faculty extends Employee {
    protected final int indentLevel;
    public Faculty(String firstName, String lastName) {
        super(firstName, lastName);
        this.setEmployeeCategory(EmployeeCategory.FACULTY);
        this.indentLevel = super.indentLevel + 1;
        System.out.println("Faculty Constructor indent " + indentLevel );
    }

    public String toString() {
        String indention = "\t".repeat(this.indentLevel);
        StringBuilder sb = new StringBuilder()
                .append(super.toString())
                .append(ConsoleColors.GREEN)
                .append(EmployeeCategory.FACULTY.toString(this.indentLevel))
                .append(ConsoleColors.RESET);
        return sb.toString();
    }
}


