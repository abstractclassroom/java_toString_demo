package org.example.faculty.college.engineering.department;

public enum Departments {
    CSE("Computer Science and Engineering", "CSE", "Dr. Wei Zhang", "Duthie", "Room 211", "123-456-7890", "cse@louisville.edu"),
    ECE("Electrical and Computer Engineering", "ECE", "Dr. Nick Tesla", "Sackett Hall", "Room 200", "123-456-4444", "ece@louisville.edu");
    private final String departmentName;
    private final String departmentCode;
    private final String departmentHead;
    private final String departmentOfficeBuilding;
    private final String departmentOfficeNumber;
    private final String departmentOfficePhone;
    private final String departmentOfficeEmail;

    Departments(String departmentName, String departmentCode, String departmentHead, String departmentOfficeBuilding, String departmentOfficeNumber, String departmentOfficePhone, String departmentOfficeEmail) {
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
        this.departmentHead = departmentHead;
        this.departmentOfficeBuilding = departmentOfficeBuilding;
        this.departmentOfficeNumber = departmentOfficeNumber;
        this.departmentOfficePhone = departmentOfficePhone;
        this.departmentOfficeEmail = departmentOfficeEmail;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public String getDepartmentOfficeBuilding() {
        return departmentOfficeBuilding;
    }

    public String getDepartmentOfficeNumber() {
        return departmentOfficeNumber;
    }

    public String getDepartmentOfficePhone() {
        return departmentOfficePhone;
    }

    public String getDepartmentOfficeEmail() {
        return departmentOfficeEmail;
    }

    public String toString() {
        return toString(0);
    }

    public String toString(int indentLevel) {
        String indent = "\t".repeat(indentLevel);
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Department Information: \n");
        sb.append(indent).append("  ").append("Department Name: ").append(departmentName).append("\n");
        sb.append(indent).append("  ").append("Department Code: ").append(departmentCode).append("\n");
        sb.append(indent).append("  ").append("Department Head: ").append(departmentHead).append("\n");
        sb.append(indent).append("  ").append("Department Office Building: ").append(departmentOfficeBuilding).append("\n");
        sb.append(indent).append("  ").append("Department Office Number: ").append(departmentOfficeNumber).append("\n");
        sb.append(indent).append("  ").append("Department Office Phone: ").append(departmentOfficePhone).append("\n");
        sb.append(indent).append("  ").append("Department Office Email: ").append(departmentOfficeEmail).append("\n");
        return sb.toString();

    }
}
