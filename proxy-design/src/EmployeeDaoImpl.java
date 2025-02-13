public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        System.out.println("Created new row in the Employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted row with employee id: " + employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        System.out.println("Fetching data from db");
        return new EmployeeDo();
    }
}
