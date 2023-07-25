public final class EmployeeDetails {
    
    private final String name;
    private final int employeeId;
    private String department;

    
    public EmployeeDetails(String name, int employeeId, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public static void main(String[] args) {
        
        EmployeeDetails employee1 = new EmployeeDetails("John Cena", 00073, "Engineering");

   
        System.out.println("Employee Name: " + employee1.getName());
        System.out.println("Employee ID: " + employee1.getEmployeeId());
        System.out.println("Department: " + employee1.getDepartment());
        
        //can change department
        //employee1.department="Marketing";
        //Can't change name 
        //employee1.name="Randy Orton";
       
       }
}
