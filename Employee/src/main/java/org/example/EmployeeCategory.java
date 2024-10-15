package org.example;

public enum EmployeeCategory {
    FACULTY("Faculty", "Primary duties are a combination of research, teaching, and service.", "Provost Dr. Gerry Bradley", "Grawemeyer Hall", "Room 117", "502-367-1111", "gerry.bradley@louisville.edu"),
    STAFF("Staff", "Primary duties are to to provide supportive tasks for university functions.", "Dr. Bob Builder", "SugarShack", "Room 116", "502-367-2222", "bob.builder@louisville.edu");

    private final String category;
    private final String description;
    private final String adminName;
    private final String adminBuilding;
    private final String adminRoom;
    private final String adminPhone;
    private final String adminEmail;

    private EmployeeCategory(String category, String description, String adminName, String adminBuilding, String adminRoom, String adminPhone, String adminEmail) {
        this.category = category;
        this.description = description;
        this.adminName = adminName;
        this.adminBuilding = adminBuilding;
        this.adminRoom = adminRoom;
        this.adminPhone = adminPhone;
        this.adminEmail = adminEmail;
    }


    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminBuilding() {
        return adminBuilding;
    }

    public String getAdminRoom() {
        return adminRoom;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public String toString() {
        return toString(0);
    }
    public String toString(int indentLevel) {
        String indent = "\t".repeat(indentLevel);
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append( "Category Information: \n");
        sb.append(indent).append("  ").append("Description: ").append(description).append("\n");
        sb.append(indent).append("  ").append("Admin Name: ").append(adminName).append("\n");
        sb.append(indent).append("  ").append("Admin Building: ").append(adminBuilding).append("\n");
        sb.append(indent).append("  ").append("Admin Room: ").append(adminRoom).append("\n");
        sb.append(indent).append("  ").append("Admin Phone: ").append(adminPhone).append("\n");
        sb.append(indent).append("  ").append("Admin Email: ").append(adminEmail).append("\n");
        return sb.toString();
    }

}
