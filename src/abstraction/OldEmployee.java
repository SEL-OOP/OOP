package abstraction;

public abstract class OldEmployee implements EmployeeName {
    public int oldEmployeeID;

    public abstract void getOldEmployeeAge();

    public int getOldEmployeeID(){
        return oldEmployeeID;

    }
}