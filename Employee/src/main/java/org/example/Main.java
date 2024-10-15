package org.example;


import org.example.faculty.college.business.department.acct.ACCT;
import org.example.faculty.college.business.department.econ.ECON;

public class Main {
    public static void main(String[] args) {
        ACCT acctEmployee = new ACCT("John", "Doe");
        acctEmployee.addCourse(org.example.faculty.college.business.department.acct.Courses.ACCT101);
        acctEmployee.addCourse(org.example.faculty.college.business.department.acct.Courses.ACCT201);
        acctEmployee.addCourse(org.example.faculty.college.business.department.acct.Courses.ACCT301);
        ECON econEmployee = new ECON("Nathan", "Russell");

        econEmployee.addCourse(org.example.faculty.college.business.department.econ.Courses.ECON302);
        econEmployee.addCourse(org.example.faculty.college.business.department.econ.Courses.ECON401);


        System.out.println(acctEmployee);


    }
}