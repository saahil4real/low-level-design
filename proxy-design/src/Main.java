//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            EmployeeDao empTableObj = new EmployeeDaoProxy();
            empTableObj.create("ADMIN", new EmployeeDo());
            System.out.println("Operation Successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}