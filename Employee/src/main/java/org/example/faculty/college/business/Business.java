package org.example.faculty.college.business;

import org.example.faculty.college.College;
import org.example.faculty.college.Colleges;

public abstract class Business extends College {

    protected final int indentLevel;

    public Business(String firstName, String lastName) {
        super(firstName, lastName, Colleges.BUSINESS);
        this.indentLevel = super.indentLevel;
        System.out.println("Business Constructor indent " + indentLevel);
    }

    public String toString() {
        return super.toString();
    }
}
