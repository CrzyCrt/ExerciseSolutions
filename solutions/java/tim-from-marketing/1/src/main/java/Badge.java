class Badge {
    public String print(Integer id, String name, String department) {
        String badgeID = "[" + id + "]";
        String badgeDepartment;
        String separator = " - ";
        String badge;

        if (department == null) {
            badgeDepartment = "OWNER";
        } else {
            badgeDepartment = department.toUpperCase();
        }

        if (id == null) {
            badge = name + separator + badgeDepartment;
        } else {
            badge = badgeID + separator + name + separator + badgeDepartment;
        }

        return badge;
    }
}
