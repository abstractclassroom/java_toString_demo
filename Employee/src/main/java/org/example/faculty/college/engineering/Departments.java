package org.example.faculty.college.engineering;

public enum Departments {
    CSE("Computer Science and Engineering", "Dr. Wei Zhang", "csechair@louisville.edu", "123-456-7890", "Duthie", "Room 211", "CSE"),
    ECE("Electrical and Computer Engineering", "Dr. Ehsan Borzeshi", "ecechair@louisville.edu", "123-456-7890", "J.B. Speed", "Room 200", "ECE"),
    CE("Civil and Environmental Engineering", "Dr. J.P. Mohsen", "cechair@louisville.edu", "123-456-7890", "Vogt", "Room 237", "CE"),;

    private final String departmentName;
    private final String departmentChairName;
    private final String departmentChairEmail;
    private final String departmentChairPhone;
    private final String departmentChairBuilding;
    private final String departmentChairOffice;
    private final String departmentCode;

    Departments(String departmentName, String departmentChairName, String departmentChairEmail, String departmentChairPhone, String departmentChairBuilding, String departmentChairOffice, String departmentCode) {
        this.departmentName = departmentName;
        this.departmentChairName = departmentChairName;
        this.departmentChairEmail = departmentChairEmail;
        this.departmentChairPhone = departmentChairPhone;
        this.departmentChairBuilding = departmentChairBuilding;
        this.departmentChairOffice = departmentChairOffice;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentChairName() {
        return departmentChairName;
    }

    public String getDepartmentChairEmail() {
        return departmentChairEmail;
    }

    public String getDepartmentChairPhone() {
        return departmentChairPhone;
    }

    public String getDepartmentChairBuilding() {
        return departmentChairBuilding;
    }

    public String getDepartmentChairOffice() {
        return departmentChairOffice;
    }

    public String toString() {
        return toString(0);
    }
    public String toString(int indentLevel) {
        String indent = "\t".repeat(indentLevel);
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append(String.format("%s Department Information: \n", departmentName));
        sb.append(indent).append("\t").append("Department Code: ").append(departmentCode).append("\n");
        sb.append(indent).append("\t").append("Department Chair: ").append(departmentChairName).append("\n");
        sb.append(indent).append("\t").append("Department Chair Email: ").append(departmentChairEmail).append("\n");
        sb.append(indent).append("\t").append("Department Chair Phone: ").append(departmentChairPhone).append("\n");
        sb.append(indent).append("\t").append("Department Chair Office: ").append(departmentChairBuilding).append(" ").append(departmentChairOffice).append("\n");
        return sb.toString();
    }

}
