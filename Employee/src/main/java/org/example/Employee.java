package org.example;
import java.util.Random;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final int employeeId;

    private EmployeeCategory employeeCategory;
    protected final int indentLevel;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = new Random().nextInt(1000);
        this.indentLevel = 0;
        System.out.println("Employee Constructor indent " + indentLevel );
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setEmployeeCategory(EmployeeCategory employeeCategory) {
        this.employeeCategory = employeeCategory;
    }

    public String toString() {
        String indention = "\t".repeat(this.indentLevel);
        StringBuilder sb = new StringBuilder()
                .append(ConsoleColors.BLUE)
                .append(indention)
                .append("Employee Information: \n")
                .append(indention).append("  ").append(String.format("Employee ID: %d\n", employeeId))
                .append(indention).append("  ").append(String.format("Employee Name: %s\n", getFullName()))
                .append(indention).append("  ").append(String.format("Employee Category: %s\n", employeeCategory.getCategory()))
                .append(ConsoleColors.RESET);
        return sb.toString();
    }

}
