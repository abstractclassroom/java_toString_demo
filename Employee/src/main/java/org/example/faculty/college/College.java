package org.example.faculty.college;

import org.example.ConsoleColors;
import org.example.faculty.Faculty;

public abstract class College extends Faculty {
    private final Colleges college;
    protected final int indentLevel;

    public College(String firstName, String lastName, Colleges college) {
        super(firstName, lastName);
        this.college = college;
        this.indentLevel = super.indentLevel + 1;
        System.out.println("College Constructor indent " + this.indentLevel);
    }

    public String toString() {
        String indention = "\t".repeat(this.indentLevel);
        StringBuilder sb = new StringBuilder()
                .append(super.toString())
                .append(ConsoleColors.YELLOW)
                .append(college.toString(this.indentLevel))
                .append(ConsoleColors.RESET);
        return sb.toString();
    }

}
