package org.example.faculty.college.engineering;

import org.example.faculty.college.College;
import org.example.faculty.college.Colleges;

import java.util.Calendar;

public abstract class Engineering extends College {

    protected final int indentLevel;

    public Engineering(String firstName, String lastName) {
        super(firstName, lastName, Colleges.ENGINEERING);
        this.indentLevel = super.indentLevel;
        System.out.println("Engineering Constructor indent " + indentLevel);
    }

    public String toString() {
        return super.toString();
    }
}
