package abstraction;

public class TestOffice {
    public static void main(String[] args) {
    	
    	Employee st1 = new Employee();
    	st1.getEmployeeID(1234);
    	st1.getEmployeeName("zaytuan");
        
        Office sh1 = new Office();
        sh1.getOldEmployeeID();
        
        EmployeeName st3 = new Office();
        st3.getEmployeeFirstName();
        st3.getEmployeeLastName();
        
        NewEmployee nw1 = new NewEmployee();
        nw1.getNewEmployeeAge();
        nw1.getEmployeeID(1235);

    }
}